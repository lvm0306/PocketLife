package com.example.apple.pocketlife.app.ui.everyday.basketball.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.apple.pocketlife.R;
import com.example.apple.pocketlife.app.ui.everyday.bean.BasketTmBean;
import com.example.apple.pocketlife.lib.utils.BaseAdapterHelper;
import com.example.apple.pocketlife.lib.utils.GlideUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * NBA TeamMathch Adapter
 * Created by apple on 17/4/3.
 */

public class BasketTmLvAdapter extends BaseAdapterHelper<BasketTmBean.ResultBean.ListBean> {
    public BasketTmLvAdapter(Context context, List<BasketTmBean.ResultBean.ListBean> list) {
        super(context, list);
    }

    @Override
    public View getItemView(int position, View convertView, ViewGroup parent) {
        BBTmViewHolder viewHolder = null;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.item_rv_basket_normal, parent, false);
            viewHolder = new BBTmViewHolder(convertView);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (BBTmViewHolder) convertView.getTag();
        }
        BasketTmBean.ResultBean.ListBean listBean = mList.get(position);
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

    class BBTmViewHolder {
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

        BBTmViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
