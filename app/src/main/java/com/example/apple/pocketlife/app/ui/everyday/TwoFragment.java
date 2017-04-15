package com.example.apple.pocketlife.app.ui.everyday;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.apple.pocketlife.R;
import com.example.apple.pocketlife.lib.base.BaseFragment;
import com.example.apple.pocketlife.lib.utils.UIManager;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 第二页
 */

public class TwoFragment extends BaseFragment {

    @BindView(R.id.ll_two_phone)
    LinearLayout llTwoPhone;
    @BindView(R.id.ll_two_star)
    LinearLayout llTwoStar;
    @BindView(R.id.ll_two_basketball)
    LinearLayout llTwoBasketball;
    @BindView(R.id.ll_two_calendar)
    LinearLayout llTwoCalendar;

    public TwoFragment() {
        // Required empty public constructor
    }

    public static TwoFragment newInstance() {
        TwoFragment fragment = new TwoFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @OnClick({R.id.ll_two_phone, R.id.ll_two_star, R.id.ll_two_basketball, R.id.ll_two_calendar})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ll_two_phone:
                UIManager.phoneadressSkip(getActivity());
                break;
            case R.id.ll_two_star:
                UIManager.starSkip(getActivity());
                break;
            case R.id.ll_two_basketball:
                UIManager.basketballSkip(getActivity());
                break;
            case R.id.ll_two_calendar:
                UIManager.calendarSkip(getActivity());
                break;
        }
    }
}
