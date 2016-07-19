package com.jayjaylab.ui.anatomy.util;

import com.facebook.stetho.okhttp3.StethoInterceptor;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * Created by jjkim on 2016. 7. 18..
 */
public class OkhttpProvider {
    static volatile OkhttpProvider instance;
    OkHttpClient okHttpClient;

    private OkhttpProvider() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        if(Log.DEBUG) {
            builder.addInterceptor(chain -> {
                Request request = chain.request();
                Log.v("url : " + request.url());

                // try the request
                Response response = chain.proceed(request);
                return response;
            });
            builder.addNetworkInterceptor(new StethoInterceptor());
        }

        okHttpClient = builder.build();
    }

    public static OkhttpProvider getInstance() {
        if(instance == null) {
            synchronized (OkhttpProvider.class) {
                if(instance == null) {
                    instance = new OkhttpProvider();
                }
            }
        }

        return instance;
    }

    public OkHttpClient getOkHttpClient() {
        return okHttpClient;
    }
}
