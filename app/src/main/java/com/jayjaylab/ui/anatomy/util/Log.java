package com.jayjaylab.ui.anatomy.util;

/**
 * Created by jjkim on 2015. 9. 30..
 */
public class Log {
    public static final boolean DEBUG = true;
    static final String TAG = "JJLab";

    private static String getTag() {
        String threadId = String.valueOf(Thread.currentThread().getId());
        String threadName = Thread.currentThread().getName();
        String fullClassName = Thread.currentThread().getStackTrace()[4].getClassName();
        String className = fullClassName.substring(fullClassName.lastIndexOf(".") + 1);
        String methodName = Thread.currentThread().getStackTrace()[4].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[4].getLineNumber();

        return TAG + ": " + threadName + "(" + threadId + ")  " + className + "#" +
                methodName + "()[" + lineNumber + "]";
    }

    private static String getStackTrace() {
        StringBuilder builder = new StringBuilder();
        builder.append("---------------------------- Stacktrace ----------------------------\n");
        StackTraceElement[] lists = Thread.currentThread().getStackTrace();
        final int size = lists.length;

        for (int i = 0; i < size; i++) {
            if (i == 0 || i == 1 || i == 2 || i == 3)
                continue;

            builder.append(lists[i] + "\n");
        }
        builder.append("---------------------------- Stacktrace ----------------------------\n");

        return builder.toString();
    }

    public static void d(String msg) {
        if (DEBUG) {
            if (msg == null) {
                android.util.Log.d(getTag(), "no log message...");
            } else {
                android.util.Log.d(getTag(), msg);
            }
        }
    }

    public static void dWithStackTrace(String msg) {
        if (DEBUG) {
            if (msg == null) {
                android.util.Log.d(getTag(), "\n" + getStackTrace());
            } else {
                android.util.Log.d(getTag(), msg + "\n" + getStackTrace());
            }
        }
    }

    public static void v(String msg) {
        if (DEBUG) {
            if (msg == null) {
                android.util.Log.v(getTag(), "no log message...");
            } else {
                android.util.Log.v(getTag(), msg);
            }
        }
    }

    public static void vWithStackTrace(String msg) {
        if (DEBUG) {
            if (msg == null) {
                android.util.Log.v(getTag(), "\n" + getStackTrace());
            } else {
                android.util.Log.v(getTag(), msg + "\n" + getStackTrace());
            }
        }
    }

    public static void w(String msg) {
        if(DEBUG){
            if(msg == null) {
                android.util.Log.w(getTag(), "no log message...");
            } else {
                android.util.Log.w(getTag(), msg);
            }
        }
    }

    public static void wWithStackTrace(String msg) {
        if(DEBUG){
            if(msg == null) {
                android.util.Log.w(getTag(), "\n" + getStackTrace());
            } else {
                android.util.Log.w(getTag(), msg + "\n" + getStackTrace());
            }
        }
    }

    public static void i(String msg) {
        if(DEBUG){
            if(msg == null) {
                android.util.Log.i(getTag(), "no log message...");
            } else {
                android.util.Log.i(getTag(), msg);
            }
        }
    }

    public static void iWithStackTrace(String msg) {
        if(DEBUG){
            if(msg == null) {
                android.util.Log.i(getTag(), "\n" + getStackTrace());
            } else {
                android.util.Log.i(getTag(), msg + "\n" + getStackTrace());
            }
        }
    }

    public static void e(String msg) {
        if(DEBUG){
            if(msg == null) {
                android.util.Log.e(getTag(), "no log message...");
            } else {
                android.util.Log.e(getTag(), msg);
            }
        }
    }

    public static void eWithStackTrace(String msg) {
        if(DEBUG){
            if(msg == null) {
                android.util.Log.e(getTag(), "\n" + getStackTrace());
            } else {
                android.util.Log.e(getTag(), msg + "\n" + getStackTrace());
            }
        }
    }
}

