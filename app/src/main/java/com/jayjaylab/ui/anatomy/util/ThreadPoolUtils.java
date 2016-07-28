package com.jayjaylab.ui.anatomy.util;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by jayjay on 2016. 7. 28..
 */
public class ThreadPoolUtils {
    static final int SINGLE_THREAD_QUEUE_INITIAL_CAPACITY = 20;
    static ExecutorService singleThreadPool;

    public static ExecutorService getSingleThreadPool() {
        if(singleThreadPool == null) {
            synchronized (ThreadPoolUtils.class) {
                if(singleThreadPool == null) {
                    singleThreadPool =
                            new ThreadPoolExecutor(1, 1, 30000
                                    , TimeUnit.MILLISECONDS
                                    , new ArrayBlockingQueue<Runnable>(
                                            SINGLE_THREAD_QUEUE_INITIAL_CAPACITY)
                                    , new BackgroundPrioriyThreadFactory());
                }
            }

        }

        return singleThreadPool;
    }
}
