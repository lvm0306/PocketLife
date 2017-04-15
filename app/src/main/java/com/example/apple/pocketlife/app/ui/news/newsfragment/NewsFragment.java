package com.example.apple.pocketlife.app.ui.news.newsfragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.andview.refreshview.XRefreshView;
import com.andview.refreshview.XRefreshViewFooter;
import com.blankj.utilcode.utils.ToastUtils;
import com.example.apple.pocketlife.R;
import com.example.apple.pocketlife.app.constant.UrlConstant;
import com.example.apple.pocketlife.app.http.HttpUtils;
import com.example.apple.pocketlife.app.ui.news.adapter.NewsInfoAdapter;
import com.example.apple.pocketlife.app.ui.news.bean.NewsBean;
import com.example.apple.pocketlife.app.ui.news.newsweb.NewWebActivity;
import com.example.apple.pocketlife.lib.view.WrapContentLinearLayoutManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.http.QueryMap;
import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class NewsFragment extends Fragment {


    @BindView(R.id.rv_news)
    RecyclerView rvNews;

    @BindView(R.id.xrv_news)
    XRefreshView xrvNews;

    private int mLoadCount = 0;
    private int freshNum = 1;
    private NewsInfoAdapter adapter;
    private List<NewsBean.ResultBean.DataBean> beanList = new ArrayList<>();
    private List<NewsBean.ResultBean.DataBean> simpleList = new ArrayList<>();
    private Context context;
    NewsInfoAdapter.INewsRvClickListener listener = new NewsInfoAdapter.INewsRvClickListener() {
        @Override
        public void setOnItemClick(String url, String title) {
            Intent intent = new Intent();
            intent.setClass(context, NewWebActivity.class);
            intent.putExtra("webview", url);
            intent.putExtra("title", title);
            intent.putExtra("love", "1");
            startActivity(intent);
        }

        @Override
        public void setOnItemLongClick() {

        }
    };

    public NewsFragment() {
    }

    public static NewsFragment newInstance(String type) {
        NewsFragment fragment = new NewsFragment();
        Bundle args = new Bundle();
        args.putString("newtype", type);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news, container, false);
        ButterKnife.bind(this, view);
        adapter = new NewsInfoAdapter(context, simpleList, listener);
        LinearLayoutManager layoutManager = new LinearLayoutManager(context, OrientationHelper.VERTICAL, false);
        rvNews.setAdapter(adapter);
        rvNews.setLayoutManager(layoutManager);
        initData();

        initRefresh();
        return view;
    }

    private void initRefresh() {
        rvNews.setHasFixedSize(true);
        //如果刷新时不想让里面的列表滑动，可以这么设置
        //xRefreshView.setPinnedContent(true);
        xrvNews.setPinnedTime(1000);
        //处理横向移动与XRefreshView的冲突,如果需要在手指横向移动的时候，让XRefreshView不拦截事件，
        xrvNews.setMoveForHorizontal(true);
        xrvNews.setPullLoadEnable(true);
        //滑动到底部自动加载更多
//        xrfFollowposting.setAutoLoadMore(false);
//        xrfFollowposting.setSilenceLoadMore();
        adapter.setCustomLoadMoreView(new XRefreshViewFooter(context));
        xrvNews.enableReleaseToLoadMore(true);
        xrvNews.enableRecyclerViewPullUp(true);
        xrvNews.enablePullUpWhenLoadCompleted(true);
        xrvNews.setXRefreshViewListener(new XRefreshView.XRefreshViewListener() {
            public void onRefresh() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        simpleList.clear();
                        beanList.clear();
                        adapter.notifyDataSetChanged();
                        freshNum = 1;
                        mLoadCount = 0;
                        initData();

                        xrvNews.setLoadComplete(false);
                        xrvNews.stopRefresh();
                    }
                }, 1000);
            }

            @Override
            public void onRefresh(boolean isPullDown) {

            }

            @Override
            public void onLoadMore(boolean isSilence) {
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        mLoadCount++;
                        initData();
                        if (mLoadCount >= 3) {//模拟没有更多数据的情况
                            xrvNews.setLoadComplete(true);
                        } else {
                            // 刷新完成必须调用此方法停止加载
                            xrvNews.stopLoadMore(true);
                            //当数据加载失败 不需要隐藏footerview时，可以调用以下方法，传入false，不传默认为true
                            // 同时在Footerview的onStateFinish(boolean hideFooter)，可以在hideFooter为false时，显示数据加载失败的ui
                            // xRefreshView1.stopLoadMore(false);
                        }
                    }
                }, 1000);

            }

            @Override
            public void onRelease(float direction) {

            }

            @Override
            public void onHeaderMove(double headerMovePercent, int offsetY) {

            }
        });
    }

    private void initData() {
        Bundle arguments = getArguments();
        String newtype = arguments.getString("newtype");

        Map<String, String> map = new HashMap<>();
        map.put(UrlConstant.Param.type, newtype);
        map.put(UrlConstant.Param.key, "6ea443ef1b0cb86bbaffb97e2674cac4");
        HttpUtils.Newinstance().getNews(map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<NewsBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(NewsBean newsBean) {
                        List<NewsBean.ResultBean.DataBean> data = newsBean.getResult().getData();
                        beanList.addAll(data);
                        if (freshNum < 4) {
                            for (int i = (freshNum - 1) * 10; i < freshNum * 10; i++) {
                                simpleList.add(beanList.get(i));
                            }
                            freshNum++;
                        }
                        adapter.notifyDataSetChanged();
                    }
                });
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

}
