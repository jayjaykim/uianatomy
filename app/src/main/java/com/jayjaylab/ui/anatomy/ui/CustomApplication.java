package com.jayjaylab.ui.anatomy.ui;

import android.app.Application;
import com.facebook.stetho.Stetho;
import com.jayjaylab.ui.anatomy.util.Log;

/**
 * Created by jjkim on 2016. 7. 18..
 */
public class CustomApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        if(Log.DEBUG) {
            Stetho.initializeWithDefaults(this);
        }
    }
}
