package com.jayjaylab.ui.anatomy.ui.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.jayjaylab.ui.anatomy.R;
import com.jayjaylab.ui.anatomy.event.ResponseEvent;
import com.jayjaylab.ui.anatomy.event.id.ResponseId;
import com.jayjaylab.ui.anatomy.model.data.instagram.Node;
import com.jayjaylab.ui.anatomy.presenter.implementations.InstagramImagesPresenterImpl;
import com.jayjaylab.ui.anatomy.presenter.interfaces.InstagramImagesPresenter;
import com.jayjaylab.ui.anatomy.ui.adapter.GridImageAdapter;
import com.jayjaylab.ui.anatomy.ui.view.InstagramImageView;
import com.jayjaylab.ui.anatomy.util.Log;
import org.greenrobot.eventbus.EventBus;

import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements
        InstagramImageView {
    final int GRID_COLUMN = 2;
    Unbinder unbinder;
    InstagramImagesPresenter presenter;

    // views
    GridImageAdapter adapter;
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
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onDestroyView() {
        unbinder.unbind();
        super.onDestroyView();
    }

    void init() {
        presenter = new InstagramImagesPresenterImpl(this);
        presenter.getImageData();
        setViews();
    }

    void setViews() {
        setRecyclerView();
    }

    void setRecyclerView() {
        GridLayoutManager layoutManager = new GridLayoutManager(getContext(), GRID_COLUMN);
        adapter = new GridImageAdapter(getContext(), GRID_COLUMN);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }

    @Override
    public void showImage(Node node) {
        if(Log.DEBUG) Log.d("node : " + node);
        // TODO: 2016. 7. 17.  
    }

    @Override
    public void showImage(List<Node> list) {
        if(Log.DEBUG) Log.d("# : " + list.size() + ", list : " + list);
        if(list != null && list.size() > 0) {
            EventBus.getDefault().post(new ResponseEvent(ResponseId.FLEXIBLE_IMAGE, list.get(0)));
        }
        adapter.addItems(list);
    }
}
