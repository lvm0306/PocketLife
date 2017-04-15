package com.example.apple.pocketlife.app.ui.everyday.basketball.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.apple.pocketlife.R;
import com.example.apple.pocketlife.app.ui.everyday.bean.BasketTsBean;
import com.example.apple.pocketlife.lib.utils.BaseAdapterHelper;
import com.example.apple.pocketlife.lib.utils.GlideUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * NBA TeamVs Adapter
 * Created by apple on 17/4/2.
 */

public class BasketTsLvAdapter extends BaseAdapter {
    Context mContext;
    List<BasketTsBean.ResultBean.ListBean> mList;
    public LayoutInflater mInflater = null;

    public BasketTsLvAdapter(Context context, List<BasketTsBean.ResultBean.ListBean> list) {
        this.mContext = context;
        this.mList = list;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        BBTsViewHolder viewHolder = null;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.item_rv_basket_normal, parent, false);
            viewHolder = new BBTsViewHolder();
            viewHolder.tvBbnorLeft = (TextView) convertView.findViewById(R.id.tv_bbnor_left);
            viewHolder.tvBbnorTitle = (TextView) convertView.findViewById(R.id.tv_bbnor_title);
            viewHolder.tvBbnorRight = (TextView) convertView.findViewById(R.id.tv_bbnor_right);
            viewHolder.ivBbnorLeft = (ImageView) convertView.findViewById(R.id.iv_bbnor_left);
            viewHolder.ivBbnorRight = (ImageView) convertView.findViewById(R.id.iv_bbnor_right);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (BBTsViewHolder) convertView.getTag();
        }
        BasketTsBean.ResultBean.ListBean listBean = mList.get(position);
        viewHolder.tvBbnorTitle.setText(listBean.getTime());
        if (listBean.getPlayer1logo() != null) {
            GlideUtils.loadImageView(mContext, listBean.getPlayer1logo(), viewHolder.ivBbnorLeft);
        }
        if (listBean.getPlayer2logo() != null) {
            GlideUtils.loadImageView(mContext, listBean.getPlayer2logo(), viewHolder.ivBbnorRight);
        }
        viewHolder.tvBbnorLeft.setText(listBean.getPlayer1());
        viewHolder.tvBbnorRight.setText(listBean.getPlayer2());
        return convertView;
    }

    class BBTsViewHolder {
        TextView tvBbnorTitle;
        ImageView ivBbnorLeft;
        TextView tvBbnorLeft;
        ImageView ivBbnorRight;
        TextView tvBbnorRight;

    }
}
