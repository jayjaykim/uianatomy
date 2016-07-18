package com.jayjaylab.ui.anatomy.util;

import android.content.Context;
import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader;
import com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory;
import com.bumptech.glide.load.engine.cache.LruResourceCache;
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator;
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
        Log.d(null);
        // Apply options to the builder here.
        MemorySizeCalculator calculator = new MemorySizeCalculator(context);
        builder.setDiskCache(new InternalCacheDiskCacheFactory(context, DISK_CACHE_SIZE));
        builder.setMemoryCache(new LruResourceCache(calculator.getMemoryCacheSize()));
    }

    @Override public void registerComponents(Context context, Glide glide) {
        Log.d(null);
        okHttpClient = OkhttpProvider.getInstance().getOkHttpClient();
        glide.register(GlideUrl.class, InputStream.class, new OkHttpUrlLoader.Factory(okHttpClient));
    }
}
