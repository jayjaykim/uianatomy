package com.jayjaylab.ui.anatomy.model.logic;

import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.jayjaylab.ui.anatomy.model.data.instagram.Entries;
import com.jayjaylab.ui.anatomy.util.GsonProvider;
import com.jayjaylab.ui.anatomy.util.Log;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.observables.AsyncOnSubscribe;

import java.util.concurrent.Callable;

/**
 * Created by jjkim on 2016. 7. 17..
 */
public class InstagramLoader {
    @WorkerThread
    public static Observable<Entries> getData() {
        return Observable.create(
                subscriber -> {
                    if (subscriber.isUnsubscribed())
                        return;

                    try {
                        Document doc = Jsoup.connect("https://www.instagram.com/ioi_fanpage/").get();
                        Entries entries = null;
                        if(doc != null) {
                            entries = internalGetData(doc);
                        }
                        subscriber.onNext(entries);
                        subscriber.onCompleted();
                    } catch (Exception e) {
                        subscriber.onError(e);
                    }
                }
        );
    }

    @WorkerThread
    static Entries internalGetData(Document document) {
        Elements elements = document.select("script");
        Entries entries = null;
        if(elements != null) {
//            Observable.from(elements)
//                    .forEach(element -> {
//                        if(Log.DEBUG) Log.d("element : " + element);
//                        String type = element.attr("type");
//                        if (TextUtils.isEmpty(type))
//                            return;
//
//                        if (type.equals("text/javascript")) {
//                            String text = element.html();
//                            if (!TextUtils.isEmpty(text)
//                                    && text.startsWith("window._sharedData")) {
//                                // finally we found the javascript element which has image data.
//                                final int startPosition = text.indexOf('=') + 1;
//                                final String json = text.substring(startPosition, text.length());
//                                entries = GsonProvider.getInstance().
//                                        unmarshallByJsonReader(json, Entries.class);
//                                // FIXME: 2016. 7. 17. can the next invocation be cancelled?
//                            }
//                        }
//                    });


            final int size = elements.size();
            for (int i = size - 1; i >= 0; i--) {
                Element e = elements.get(i);
                String type = e.attr("type");
                if (TextUtils.isEmpty(type))
                    continue;

                if (type.equals("text/javascript")) {
                    String text = e.html();
                    if (!TextUtils.isEmpty(text)
                            && text.startsWith("window._sharedData")) {
                        // finally we found the javascript element which has image data.
                        final int startPosition = text.indexOf('=') + 1;
                        final String json = text.substring(startPosition, text.length());
                        entries = GsonProvider.getInstance().
                                unmarshallByJsonReader(json, Entries.class);

                    }
                }
            }
        }

        return entries;
    }
}
