package com.jayjaylab.ui.anatomy.ui.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.jayjaylab.ui.anatomy.R;
import com.jayjaylab.ui.anatomy.model.data.instagram.Node;
import com.jayjaylab.ui.anatomy.util.AndroidUtils;
import com.jayjaylab.ui.anatomy.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jjkim on 2016. 7. 17..
 */
public class GridImageAdapter extends RecyclerView.Adapter<GridImageAdapter.ViewHolder> {
    final int DEFAULT_SIZE = 100;
    final int HEIGHT;
    final int GRID_COLUMN;
    List<Node> dataset;

    public GridImageAdapter(Context context, int columnNum) {
        this.dataset = new ArrayList<>(DEFAULT_SIZE);
        this.GRID_COLUMN = columnNum;
        HEIGHT = AndroidUtils.getScreenWidth(context) / GRID_COLUMN;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(parent.getContext(), R.layout.instagram_image, null);
        ViewHolder vh = new ViewHolder(view);
        view.setLayoutParams(new RecyclerView.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, HEIGHT));
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Node node = dataset.get(position);
        if(Log.DEBUG) Log.d("position : " + position);

        if(node != null) {
            if(Log.DEBUG) Log.d("url : " + node.getThumbnailSrc());
            if(TextUtils.isEmpty(node.getThumbnailSrc())) {
                Log.d("empty");
                holder.imageview.setImageDrawable(null);
            } else {
                Log.d("not empty");
                Glide.with(holder.imageview.getContext())
                        .load(node.getThumbnailSrc())
                        .diskCacheStrategy(DiskCacheStrategy.RESULT)
                        .into(holder.imageview);
            }
        }
    }

    @Override
    public int getItemCount() {
        if(dataset == null)
            return 0;
        else
            return dataset.size();
    }

    public void addItems(List<Node> list) {
        if(Log.DEBUG) Log.d("list : " + list);
        final int prevSize = dataset.size();
        dataset.addAll(list);
        notifyItemRangeInserted(prevSize, list.size());
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.imageview) ImageView imageview;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
