package com.jayjaylab.ui.anatomy.presenter.implementations;

import com.jayjaylab.ui.anatomy.model.data.instagram.Entries;
import com.jayjaylab.ui.anatomy.model.data.instagram.Node;
import com.jayjaylab.ui.anatomy.model.data.instagram.ProfilePage;
import com.jayjaylab.ui.anatomy.model.logic.InstagramLoader;
import com.jayjaylab.ui.anatomy.presenter.interfaces.InstagramImagesPresenter;
import com.jayjaylab.ui.anatomy.view.view.InstagramImageView;
import com.jayjaylab.ui.anatomy.util.Log;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * Created by jjkim on 2016. 7. 17..
 */
public class InstagramImagesPresenterImpl implements InstagramImagesPresenter {
    WeakReference<InstagramImageView> view;

    public InstagramImagesPresenterImpl(InstagramImageView view) {
        this.view = new WeakReference<InstagramImageView>(view);
    }

    @Override
    public void getImageData() {
        Observable<Entries> observable = InstagramLoader.getData();
        observable
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Entries>() {
                    @Override
                    public void onCompleted() {
                        if(Log.DEBUG) Log.d(null);
                    }

                    @Override
                    public void onError(Throwable e) {
                        if(Log.DEBUG) e.printStackTrace();
                    }

                    @Override
                    public void onNext(Entries entries) {
                        if(Log.DEBUG) Log.d("entries : " + entries);
                        if(view.get() != null && entries != null) {
                            if(entries.getConfig() != null
                                    && entries.getEntryData().getProfilePage() != null) {
                               parseProfilePageList(entries.getEntryData().getProfilePage());
                            }
                        }
                    }
                });
    }

    void parseProfilePageList(List<ProfilePage> list) {
        final int size = list.size();
        Observable.from(list)
                .forEach(profilePage -> {
                    if(profilePage.getUser() != null
                        && profilePage.getUser().getMedia() != null) {
                        final List<Node> nodes =
                                profilePage.getUser().getMedia().getNodes();
                        if(view.get() != null) {
                            view.get().showImage(nodes);
                        }
                    }
                });
    }
}
