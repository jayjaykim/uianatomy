package com.jayjaylab.ui.anatomy.view.navigation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.jayjaylab.ui.anatomy.util.Log;

/**
 * Created by jayjay on 2016. 8. 11..
 */
public class PageResolver {
    public static Class<? extends Fragment> showShowFragment(Bundle args) {
        final Page page = (Page)args.getSerializable(Key.PAGE);
        if(Log.DEBUG) Log.d("page : " + page);
        return page.getFragment();
    }
}
