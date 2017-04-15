package com.example.apple.pocketlife.app.ui.everyday.basketball.basketftagment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import com.example.apple.pocketlife.R;
import com.example.apple.pocketlife.app.http.HttpUtils;
import com.example.apple.pocketlife.app.ui.everyday.basketball.BBNorSkipActivity;
import com.example.apple.pocketlife.app.ui.everyday.basketball.adapter.BasketTsLvAdapter;
import com.example.apple.pocketlife.app.ui.everyday.bean.BasketTsBean;
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
 * NBA TeamVs 页面
 */
public class TeamScheduleFragment extends BaseFragment {
    @BindView(R.id.lv_bbts)
    ListView lvBbts;
    LayoutInflater inflater;
    private Spinner sp;
    private Button btn_check;
    private BasketTsLvAdapter adapter;
    private List<BasketTsBean.ResultBean.ListBean> beanList = new ArrayList<>();
    private String bbname;

    public TeamScheduleFragment() {
    }

    // TODO: Rename and change types and number of parameters
    public static TeamScheduleFragment newInstance() {
        TeamScheduleFragment fragment = new TeamScheduleFragment();
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
        View view = inflater.inflate(R.layout.fragment_team_schedule, container, false);
        ButterKnife.bind(this, view);
        final View inflate = inflater.inflate(R.layout.item_head_bbts, null);
        sp = (Spinner) inflate.findViewById(R.id.sp_bbts);
        btn_check = (Button) inflate.findViewById(R.id.btn_head_bbts);
        lvBbts.addHeaderView(inflate);

        final String[] stringArray = getResources().getStringArray(R.array.basketballname);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getMyActivity(), android.R.layout.simple_spinner_item, stringArray);
        sp.setAdapter(adapter);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                bbname = stringArray[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        initLv();
        btn_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initData();
            }
        });
        lvBbts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                BasketTsBean.ResultBean.ListBean listBean = beanList.get(position);
                String link1url = listBean.getLink1url();
                Intent intent = new Intent();
                intent.setClass(getMyActivity(), BBNorSkipActivity.class);
                intent.putExtra("url", link1url);
                startActivity(intent);
            }
        });
        return view;
    }

    /**
     * 初始化数据
     */
    private void initData() {
        String url = "http://op.juhe.cn/onebox/basketball/team?dtype=&team=" + bbname + "队&key=ff3630ac1f31f3bfaac2ac941ea036c1";
        HttpUtils.Newinstance().getBasketTeamSchedule(url)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<BasketTsBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Logger.e(e.getMessage());
                    }

                    @Override
                    public void onNext(BasketTsBean basketTsBean) {
                        Logger.e(basketTsBean.getReason());
                        List<BasketTsBean.ResultBean.ListBean> list = basketTsBean.getResult().getList();
                        beanList.clear();
                        beanList.addAll(list);
//                        adapter.reloadListView(beanList, true);
                        adapter.notifyDataSetChanged();
                    }
                });

    }

    private void initLv() {
        adapter = new BasketTsLvAdapter(getMyActivity(), beanList);
        lvBbts.setAdapter(adapter);
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
