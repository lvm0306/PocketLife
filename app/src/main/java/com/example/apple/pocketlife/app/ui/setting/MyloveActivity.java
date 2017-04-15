package com.example.apple.pocketlife.app.ui.setting;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.blankj.utilcode.utils.ToastUtils;
import com.example.apple.pocketlife.R;
import com.example.apple.pocketlife.app.ui.bmobbean.WebLikeBean;
import com.example.apple.pocketlife.app.ui.news.newsweb.NewWebActivity;
import com.example.apple.pocketlife.lib.base.App;
import com.example.apple.pocketlife.lib.base.IOnItemClickListener;
import com.github.johnpersano.supertoasts.library.Style;
import com.github.johnpersano.supertoasts.library.SuperActivityToast;
import com.github.johnpersano.supertoasts.library.utils.PaletteUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;

public class MyloveActivity extends AppCompatActivity {

    @BindView(R.id.rv_mylove)
    RecyclerView rvMylove;
    private List<WebLikeBean> listBean = new ArrayList<>();
    private MyLoveRvAdapter adapter;
    private Context context;
    private IOnItemClickListener listener = new IOnItemClickListener() {
        @Override
        public void onItemClick(View view, int position, String url, String title) {
            ToastUtils.showShortToast(url);
            Intent intent = new Intent();
            intent.putExtra("webview", url);
            intent.putExtra("love", "2");
            intent.putExtra("title", title);
            intent.setClass(context, NewWebActivity.class);
            startActivity(intent);
        }

        @Override
        public void onLongClick(View view, int posotion, String url) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mylove);
        ButterKnife.bind(this);
        context = this;
        initRv();
        initData();
    }

    private void initRv() {
        adapter = new MyLoveRvAdapter(context, listBean, listener);
        LinearLayoutManager manager = new LinearLayoutManager(context, OrientationHelper.VERTICAL, false);
        rvMylove.setLayoutManager(manager);
        rvMylove.setAdapter(adapter);
    }

    private void initData() {
        if (!App.useName.equals("admin")) {
            BmobQuery<WebLikeBean> query = new BmobQuery<WebLikeBean>();
            //查询playerName叫“比目”的数据
            query.addWhereEqualTo("name", App.useName);
            //返回50条数据，如果不加上这条语句，默认返回10条数据
            query.setLimit(50);
            //执行查询方法
            query.findObjects(new FindListener<WebLikeBean>() {
                @Override
                public void done(List<WebLikeBean> object, BmobException e) {
                    if (e == null) {
                        //查询成功
                        listBean.addAll(object);
                        adapter.notifyDataSetChanged();
//                    toast("查询成功：共"+object.size()+"条数据。");
//                        for (WebLikeBean gameScore : object) {
//                            //获得playerName的信息
//                            gameScore.getPlayerName();
//                            //获得数据的objectId信息
//                            gameScore.getObjectId();
//                            //获得createdAt数据创建时间（注意是：createdAt，不是createAt）
//                            gameScore.getCreatedAt();
//                        }
                    } else {
                        Log.i("bmob", "失败：" + e.getMessage() + "," + e.getErrorCode());
                        ToastUtils.showShortToast("查询失败");

                    }
                }
            });
        } else {
            ToastUtils.showShortToast("您还未登录哦~");
        }
    }
}
