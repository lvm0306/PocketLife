package com.example.apple.pocketlife.app.ui.setting;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.apple.pocketlife.R;
import com.example.apple.pocketlife.app.ui.bmobbean.WebLikeBean;
import com.example.apple.pocketlife.lib.base.IOnItemClickListener;
import com.example.apple.pocketlife.lib.utils.RecyclerViewAdapterHelper;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by apple on 17/4/13.
 */

public class MyLoveRvAdapter extends RecyclerViewAdapterHelper<WebLikeBean> {
    private IOnItemClickListener listener;

    public MyLoveRvAdapter(Context context, List<WebLikeBean> list, IOnItemClickListener listener) {
        super(context, list);
        this.listener = listener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateMyViewHolder(ViewGroup parent, int viewType) {
        View inflate = mInflater.inflate(R.layout.item_rv_mylove, parent, false);

        return new MyLoveViewHolder(inflate);
    }

    @Override
    public void onBindMyViewHolder(RecyclerView.ViewHolder holder, final int position) {
        MyLoveViewHolder viewHolder = (MyLoveViewHolder) holder;
        final WebLikeBean webLikeBean = mList.get(position);
        viewHolder.tvMylove.setText(webLikeBean.getTitle());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClick(v, position, webLikeBean.getUrl(), webLikeBean.getTitle());
            }
        });

    }

    class MyLoveViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_mylove)
        TextView tvMylove;

        MyLoveViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
