package com.jayjaylab.ui.anatomy.util;

import android.content.Context;
import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader;
import com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.module.GlideModule;
import okhttp3.OkHttpClient;

import java.io.InputStream;

/**
 * Created by jjkim on 2016. 7. 18..
 */
public class CustomGlideModule implements GlideModule {
    final int DISK_CACHE_SIZE = 50 * 1024 * 1024;
    OkHttpClient okHttpClient;



    @Override public void applyOptions(Context context, GlideBuilder builder) {
        // Apply options to the builder here.
        builder.setDiskCache(new InternalCacheDiskCacheFactory(context, DISK_CACHE_SIZE));
    }

    @Override public void registerComponents(Context context, Glide glide) {
        // FIXME: 2016. 7. 18. 
        okHttpClient = new OkHttpClient();
        glide.register(GlideUrl.class, InputStream.class, new OkHttpUrlLoader.Factory(okHttpClient));
    }
}
