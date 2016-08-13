package com.jayjaylab.ui.anatomy.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.jayjaylab.ui.anatomy.R;
import com.jayjaylab.ui.anatomy.util.Log;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by jjkim on 2016. 7. 21..
 */
public class SplashActivity extends Activity {
    final int WAITING_TIME = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);

        startMainActivity();
    }

    void startMainActivity() {
        ScheduledExecutorService timer = new ScheduledThreadPoolExecutor(1);
        timer.schedule(() -> {
            ActivityCompat.startActivity(
                    SplashActivity.this, new Intent(SplashActivity.this, MainActivity.class), null);
            finish();
        }, WAITING_TIME, TimeUnit.MILLISECONDS);
    }
}
