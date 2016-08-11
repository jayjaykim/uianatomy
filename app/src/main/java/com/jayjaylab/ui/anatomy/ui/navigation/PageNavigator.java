package com.jayjaylab.ui.anatomy.ui.navigation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;

/**
 * Created by jayjay on 2016. 8. 9..
 */
public class PageNavigator {
    /**
     * Goes to the <code>page</code> by delivering <code>args</code>.<p/>
     * pages could be {@link android.app.Activity} or {@link android.support.v4.app.Fragment} at
     * the moment.
     *
     * @param activity
     * @param page
     * @param args extra information to be delivered to the <code>page</code>
     */
    public static void go(Activity activity, Page page, Bundle args) {
        Intent intent = new Intent(activity, page.getActivity());
        ActivityCompat.startActivity(activity, intent, args);
    }
}
