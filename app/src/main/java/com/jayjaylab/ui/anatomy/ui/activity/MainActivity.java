package com.jayjaylab.ui.anatomy.ui.activity;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.jayjaylab.ui.anatomy.R;
import com.jayjaylab.ui.anatomy.event.ResponseEvent;
import com.jayjaylab.ui.anatomy.model.data.instagram.Entries;
import com.jayjaylab.ui.anatomy.model.data.instagram.Node;
import com.jayjaylab.ui.anatomy.model.logic.InstagramLoader;
import com.jayjaylab.ui.anatomy.util.Log;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jsoup.nodes.Document;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {
    // views
    @BindView(R.id.toolbar) Toolbar toolbar;
    @BindView(R.id.fab) FloatingActionButton fab;
    @BindView(R.id.appbar_layout) AppBarLayout appBarLayout;
    @BindView(R.id.collapsingtoolbar_layout) CollapsingToolbarLayout collapsingToolbarLayout;
    @BindView(R.id.imageview) ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        EventBus.getDefault().register(this);

        setViews();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    void setViews() {
        setSupportActionBar(toolbar);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        collapsingToolbarLayout.setTitle("uianatomy");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void showImageOnFlexibleArea(ResponseEvent event) {
        Log.d("event : " + event);
        // TODO: 2016. 7. 19. set image
        switch(event.getId()) {
            case FLEXIBLE_IMAGE: {
                if(event.getArgs() == null || event.getArgs().length < 0
                        || !(event.getArgs()[0] instanceof Node))
                    return;

                Node node = (Node)event.getArgs()[0];
                Glide.with(this).load(node.getDisplaySrc()).crossFade().into(imageView);
                break;
            }
        }

    }
}
