package com.jayjaylab.ui.anatomy.util;

/**
 * Created by jayjay on 2016. 7. 28..
 */
public class BackgroundThread extends Thread {
    public BackgroundThread(Runnable target) {
        super(target);
    }

    @Override
    public void run() {
        android.os.Process.setThreadPriority(android.os.Process.THREAD_PRIORITY_BACKGROUND);
        super.run();
    }
}
