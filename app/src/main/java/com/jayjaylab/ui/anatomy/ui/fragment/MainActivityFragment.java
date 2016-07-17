package com.jayjaylab.ui.anatomy.ui.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.jayjaylab.ui.anatomy.R;
import com.jayjaylab.ui.anatomy.model.data.instagram.Entries;
import com.jayjaylab.ui.anatomy.model.logic.InstagramLoader;
import com.jayjaylab.ui.anatomy.util.Log;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    Unbinder unbinder;

    // views
    @BindView(R.id.recyclerview) RecyclerView recyclerView;


    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_main, container, false);
        unbinder = ButterKnife.bind(this, view);
        init();
        return view;
    }

    @Override
    public void onDestroyView() {
        unbinder.unbind();
        super.onDestroyView();
    }

    void init() {
        setViews();
        loadInstagramData();
    }

    void setViews() {

    }

    void loadInstagramData() {
        Observable<Entries> observable = InstagramLoader.getData();
        observable
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Entries>() {
                    @Override
                    public void onCompleted() {
                        if(Log.DEBUG) Log.d(null);
                    }

                    @Override
                    public void onError(Throwable e) {
                        if(Log.DEBUG) e.printStackTrace();
                    }

                    @Override
                    public void onNext(Entries entries) {
                        if(Log.DEBUG) Log.d("entries : " + entries);
                    }
                });
    }
}
