package com.example.apple.pocketlife.app.ui.everyday.basketball.basketftagment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.apple.pocketlife.R;
import com.example.apple.pocketlife.app.http.HttpUtils;
import com.example.apple.pocketlife.app.ui.everyday.basketball.BBNorSkipActivity;
import com.example.apple.pocketlife.app.ui.everyday.basketball.adapter.BasketTmLvAdapter;
import com.example.apple.pocketlife.app.ui.everyday.bean.BasketTmBean;
import com.example.apple.pocketlife.app.ui.weather.bean.WeatherBean;
import com.example.apple.pocketlife.lib.base.BaseFragment;
import com.orhanobut.logger.Logger;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * NBA TeamMatch 页面
 */
public class TeamMatchFragment extends BaseFragment {

    @BindView(R.id.lv_bbtm)
    ListView lvBbtm;

    private EditText et_zc;
    private EditText et_kc;
    private Button btn;
    private BasketTmLvAdapter adapter;
    private List<BasketTmBean.ResultBean.ListBean> beanList = new ArrayList<>();

    public TeamMatchFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static TeamMatchFragment newInstance() {
        TeamMatchFragment fragment = new TeamMatchFragment();
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
        View view = inflater.inflate(R.layout.fragment_team_match, container, false);
        ButterKnife.bind(this, view);
        View head = inflater.inflate(R.layout.item_head_bbtm, null);
        et_zc = (EditText) head.findViewById(R.id.et_bbtm_zc);
        et_kc = (EditText) head.findViewById(R.id.et_bbtm_kc);
        btn = (Button) head.findViewById(R.id.btn_bbtm);
        lvBbtm.addHeaderView(head);
        initLv();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String zc = et_zc.getEditableText().toString();
                String kc = et_kc.getEditableText().toString();
                String url = "http://op.juhe.cn/onebox/basketball/combat?dtype=&hteam=" + zc + "&vteam=" + kc + "& key=ff3630ac1f31f3bfaac2ac941ea036c1";
                HttpUtils.Newinstance().getBasketTeamMatch(url).subscribeOn(Schedulers.newThread())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Subscriber<BasketTmBean>() {
                            @Override
                            public void onCompleted() {

                            }

                            @Override
                            public void onError(Throwable e) {
                                Logger.e(e.getMessage());
                            }

                            @Override
                            public void onNext(BasketTmBean basketTmBean) {
                                beanList.clear();
                                Logger.e(basketTmBean.getResult().getList().toString() + "");
                                beanList.addAll(basketTmBean.getResult().getList());
                                adapter.notifyDataSetChanged();
                            }
                        });

            }
        });
        return view;
    }

    /**
     * ListView  初始化
     */
    private void initLv() {
        adapter = new BasketTmLvAdapter(getMyActivity(), beanList);
        lvBbtm.setAdapter(adapter);
        lvBbtm.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                BasketTmBean.ResultBean.ListBean listBean = beanList.get(position);
                String link1url = listBean.getLink1url();
                Intent intent = new Intent();
                intent.setClass(getMyActivity(), BBNorSkipActivity.class);
                intent.putExtra("url", link1url);
                startActivity(intent);
            }
        });
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
