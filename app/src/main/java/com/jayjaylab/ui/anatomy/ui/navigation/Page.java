package com.jayjaylab.ui.anatomy.ui.navigation;

import android.app.Activity;
import com.jayjaylab.ui.anatomy.ui.activity.MainActivity;

/**
 * 2 depth, 3 depth, n depth?
 *
 * Created by jayjay on 2016. 8. 9..
 */
public enum Page {
    FAVORITE(MainActivity.class),
    ;

    Class<? extends Activity> activity;

    Page(Class<? extends Activity> activity) {
        this.activity = activity;
    }

    public Class<? extends Activity> getActivity() {
        return activity;
    }
}
