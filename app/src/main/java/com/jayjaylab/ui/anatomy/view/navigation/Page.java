package com.jayjaylab.ui.anatomy.view.navigation;

import android.app.Activity;
import android.support.v4.app.Fragment;
import com.jayjaylab.ui.anatomy.view.activity.MainActivity;

/**
 * 2 depth, 3 depth, n depth?
 *
 * Created by jayjay on 2016. 8. 9..
 */
public enum Page {
    FAVORITE(MainActivity.class, null),


    ;

    Class<? extends Activity> activity;
    Class<? extends Fragment> fragment;

    Page(Class<? extends Activity> activity, Class<? extends Fragment> fragment) {
        this.activity = activity;
        this.fragment = fragment;
    }

    public Class<? extends Activity> getActivity() {
        return activity;
    }

    public Class<? extends Fragment> getFragment() {
        return fragment;
    }
}
