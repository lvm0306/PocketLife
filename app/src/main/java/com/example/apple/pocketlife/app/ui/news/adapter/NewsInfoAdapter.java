package com.example.apple.pocketlife.app.ui.news.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.andview.refreshview.recyclerview.BaseRecyclerAdapter;
import com.example.apple.pocketlife.R;
import com.example.apple.pocketlife.app.ui.news.bean.NewsBean;
import com.example.apple.pocketlife.lib.utils.GlideUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by apple on 17/3/18.
 */

//public class NewsInfoAdapter extends RecyclerViewAdapterHelper<NewsBean.ResultBean.DataBean> {
//    private INewsRvClickListener listener;
//
//    public NewsInfoAdapter(Context context, List<NewsBean.ResultBean.DataBean> list, INewsRvClickListener listener) {
//        super(context, list);
//        this.listener = listener;
//    }
//
//    @Override
//    public RecyclerView.ViewHolder onCreateMyViewHolder(ViewGroup parent, int viewType) {
//        View inflate = mInflater.inflate(R.layout.item_rv_news, parent, false);
//        return new NewsRvViewHolder(inflate);
//    }
//
//    @Override
//    public void onBindMyViewHolder(RecyclerView.ViewHolder holder, int position) {
//        NewsRvViewHolder viewHolder = (NewsRvViewHolder) holder;
//        NewsBean.ResultBean.DataBean dataBean = mList.get(position);
//        viewHolder.tvNewsrvTitle.setText(dataBean.getTitle());
//        viewHolder.tvNewsrvData.setText(dataBean.getDate());
//        viewHolder.tvNewsrvPublish.setText(dataBean.getAuthorName());
//        if (dataBean.getThumbnailPicS() != null) {
//            GlideUtils.loadImageView(mContext, dataBean.getThumbnailPicS(), viewHolder.ivNewsrv);
//        }
//
//        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                listener.setOnItemClick();
//            }
//        });
//    }
//
//    public interface INewsRvClickListener {
//        void setOnItemClick();
//
//        void setOnItemLongClick();
//    }
//
//    static class NewsRvViewHolder extends RecyclerView.ViewHolder {
//        @BindView(R.id.iv_newsrv)
//        ImageView ivNewsrv;
//        @BindView(R.id.tv_newsrv_title)
//        TextView tvNewsrvTitle;
//        @BindView(R.id.tv_newsrv_publish)
//        TextView tvNewsrvPublish;
//        @BindView(R.id.tv_newsrv_data)
//        TextView tvNewsrvData;
//
//        NewsRvViewHolder(View view) {
//            super(view);
//            ButterKnife.bind(this, view);
//        }
//    }
//}

public class NewsInfoAdapter extends BaseRecyclerAdapter<NewsInfoAdapter.NewsRvViewHolder> {
    public Context mContext = null;
    public List<NewsBean.ResultBean.DataBean> mList = null;
    public LayoutInflater mInflater = null;
    private INewsRvClickListener listener;

    public NewsInfoAdapter(Context mContext, List<NewsBean.ResultBean.DataBean> mList, INewsRvClickListener listener) {
        this.mContext = mContext;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.mList = mList;
        this.listener = listener;
    }

    @Override
    public NewsRvViewHolder getViewHolder(View view) {
        return new NewsRvViewHolder(view, false);
    }

    @Override
    public NewsRvViewHolder onCreateViewHolder(ViewGroup parent, int viewType, boolean isItem) {
        View inflate = mInflater.inflate(R.layout.item_rv_news, parent, false);
        return new NewsRvViewHolder(inflate, true);
    }


    @Override
    public void onBindViewHolder(NewsRvViewHolder holder, int position, boolean isItem) {
        final NewsBean.ResultBean.DataBean dataBean = mList.get(position);
        holder.tvNewsrvTitle.setText(dataBean.getTitle());
        holder.tvNewsrvData.setText(dataBean.getDate());
        holder.tvNewsrvPublish.setText(dataBean.getAuthorName());
        if (dataBean.getThumbnailPicS() != null) {
            GlideUtils.loadImageView(mContext, dataBean.getThumbnailPicS(), holder.ivNewsrv);
        }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.setOnItemClick(dataBean.getUrl(), dataBean.getTitle());
            }
        });

    }

    @Override
    public int getAdapterItemCount() {
        return mList.size();
    }

    class NewsRvViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.iv_newsrv)
        ImageView ivNewsrv;
        @BindView(R.id.tv_newsrv_title)
        TextView tvNewsrvTitle;
        @BindView(R.id.tv_newsrv_publish)
        TextView tvNewsrvPublish;
        @BindView(R.id.tv_newsrv_data)
        TextView tvNewsrvData;

        NewsRvViewHolder(View view, boolean isItem) {
            super(view);
            if (isItem) {
                ButterKnife.bind(this, view);
            }
        }
    }

    public interface INewsRvClickListener {
        void setOnItemClick(String url, String title);

        void setOnItemLongClick();
    }


}