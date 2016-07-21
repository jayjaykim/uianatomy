package com.jayjaylab.ui.anatomy.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import com.jayjaylab.ui.anatomy.util.Log;

/**
 * Created by jjkim on 2016. 7. 21..
 */
public class ProxyActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        resolveBundle(savedInstanceState);
        resolveIntent();
        finish();
    }

    void resolveBundle(Bundle bundle) {
        if(Log.DEBUG) Log.d("bundle : " + bundle);

        if(bundle != null) {
            // TODO: 2016. 7. 21.
        }
    }

    void resolveIntent() {
        Intent intent = getIntent();
        if(Log.DEBUG) Log.d("intent : " + intent);

        if(intent != null) {
            // resolves action
            if(intent.getAction() != null
                && intent.getAction().equals(Intent.ACTION_MAIN)
                    && intent.getCategories() != null && intent.getCategories().size() > 0
                    && intent.getCategories().contains(Intent.CATEGORY_LAUNCHER)) {
                // TODO: 2016. 7. 21. needs mediator pattern
                ActivityCompat.startActivity(
                        this, new Intent(this, SplashActivity.class), null);
            }
        }
    }
}
