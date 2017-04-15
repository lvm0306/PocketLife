package com.example.apple.pocketlife.app.ui.everyday.basketball.basketftagment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.apple.pocketlife.R;
import com.example.apple.pocketlife.app.http.HttpUtils;
import com.example.apple.pocketlife.app.ui.everyday.basketball.BBNorSkipActivity;
import com.example.apple.pocketlife.app.ui.everyday.bean.BasketNorBean;
import com.example.apple.pocketlife.app.ui.everyday.basketball.adapter.BasketNorRvAdapter;
import com.example.apple.pocketlife.lib.base.BaseFragment;
import com.example.apple.pocketlife.lib.utils.RecyclerItemClickListener;
import com.orhanobut.logger.Logger;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * NBA 赛事列表 页面
 */
public class NormalFragment extends BaseFragment {
    private List<BasketNorBean.ResultBean.ListBean.TrBean> beanList = new ArrayList<>();
    private BasketNorRvAdapter rvAdapter;
    @BindView(R.id.rv_basket_normal)
    RecyclerView rvBasketNormal;
    /**
     * 点击回调接口实现
     */
    private BasketNorRvAdapter.IOnItemClickListener listener = new BasketNorRvAdapter.IOnItemClickListener() {
        /**
         * 点击
         * @param view
         * @param position
         * @param url
         */
        @Override
        public void onItemClick(View view, int position, String url) {
            Intent intent = new Intent();
            intent.setClass(getMyActivity(), BBNorSkipActivity.class);
            intent.putExtra("url", url);
            startActivity(intent);
        }

        /**
         * 长按  未使用
         * @param view
         * @param posotion
         * @param url
         */
        @Override
        public void onLongClick(View view, int posotion, String url) {

        }
    };

    public NormalFragment() {
        // Required empty public constructor
    }

    /**
     * Fragment 初始化
     *
     * @return
     */
    public static NormalFragment newInstance() {
        NormalFragment fragment = new NormalFragment();
        Bundle args = new Bundle();
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
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_normal, container, false);
        ButterKnife.bind(this, view);
        initRv();
        initData();
        return view;
    }

    /**
     * 数据初始化
     */
    private void initData() {
        String url = "http://op.juhe.cn/onebox/basketball/nba?dtype=&key=ff3630ac1f31f3bfaac2ac941ea036c1";
        HttpUtils.Newinstance().getBasketNor(url).subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<BasketNorBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Logger.e(e.getMessage());
                    }

                    @Override
                    public void onNext(BasketNorBean basketNorBean) {
                        Logger.e(basketNorBean.getReason());
                        List<BasketNorBean.ResultBean.ListBean.TrBean> tr = basketNorBean.getResult().getList().get(1).getTr();
                        beanList.addAll(tr);
                        rvAdapter.notifyDataSetChanged();
                    }
                });
    }

    /**
     * 列表初始化
     */
    private void initRv() {

        rvAdapter = new BasketNorRvAdapter(getMyActivity(), beanList, listener);
        LinearLayoutManager llm = new LinearLayoutManager(getMyActivity(), OrientationHelper.VERTICAL, false);
        rvBasketNormal.setLayoutManager(llm);
        rvBasketNormal.setAdapter(rvAdapter);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

}
