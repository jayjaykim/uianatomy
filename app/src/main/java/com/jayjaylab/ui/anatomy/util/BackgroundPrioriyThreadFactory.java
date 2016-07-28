package com.jayjaylab.ui.anatomy.util;

import android.support.annotation.NonNull;

import java.util.concurrent.ThreadFactory;

/**
 * Created by jayjay on 2016. 7. 28..
 */
public class BackgroundPrioriyThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(@NonNull Runnable runnable) {
        return new BackgroundThread(runnable);
    }
}
