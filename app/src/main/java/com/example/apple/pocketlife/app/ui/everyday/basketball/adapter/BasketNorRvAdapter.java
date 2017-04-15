package com.example.apple.pocketlife.app.ui.everyday.basketball.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.apple.pocketlife.R;
import com.example.apple.pocketlife.app.ui.everyday.bean.BasketNorBean;
import com.example.apple.pocketlife.lib.utils.GlideUtils;
import com.example.apple.pocketlife.lib.utils.RecyclerViewAdapterHelper;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * NBA赛事 Adapter
 * Created by apple on 17/4/2.
 */

public class BasketNorRvAdapter extends RecyclerViewAdapterHelper<BasketNorBean.ResultBean.ListBean.TrBean> {
    private IOnItemClickListener listener;

    public BasketNorRvAdapter(Context context, List<BasketNorBean.ResultBean.ListBean.TrBean> list, IOnItemClickListener listener) {
        super(context, list);
        this.listener = listener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateMyViewHolder(ViewGroup parent, int viewType) {
        View inflate = mInflater.inflate(R.layout.item_rv_basket_normal, parent, false);
        return new BBNorViewHolder(inflate);
    }

    @Override
    public void onBindMyViewHolder(RecyclerView.ViewHolder holder, final int position) {
        final BasketNorBean.ResultBean.ListBean.TrBean trBean = mList.get(position);
        BBNorViewHolder viewHolder = (BBNorViewHolder) holder;
        viewHolder.tvBbnorTitle.setText(trBean.getTime() + "");
        if (trBean.getPlayer1logo() != null) {
            GlideUtils.loadImageView(mContext, trBean.getPlayer1logo(), viewHolder.ivBbnorLeft);
        }
        if (trBean.getPlayer2logo() != null) {
            GlideUtils.loadImageView(mContext, trBean.getPlayer2logo(), viewHolder.ivBbnorRight);
        }
        viewHolder.tvBbnorLeft.setText(trBean.getPlayer1());
        viewHolder.tvBbnorRight.setText(trBean.getPlayer2());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClick(v, position, trBean.getLink1url());
            }
        });
    }

    class BBNorViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_bbnor_title)
        TextView tvBbnorTitle;
        @BindView(R.id.iv_bbnor_left)
        ImageView ivBbnorLeft;
        @BindView(R.id.tv_bbnor_left)
        TextView tvBbnorLeft;
        @BindView(R.id.iv_bbnor_right)
        ImageView ivBbnorRight;
        @BindView(R.id.tv_bbnor_right)
        TextView tvBbnorRight;

        BBNorViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    public interface IOnItemClickListener {
        void onItemClick(View view, int position, String url);

        void onLongClick(View view, int posotion, String url);
    }
}
