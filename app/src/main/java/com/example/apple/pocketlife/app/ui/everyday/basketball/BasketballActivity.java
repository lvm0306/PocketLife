package com.example.apple.pocketlife.app.ui.everyday.basketball;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.apple.pocketlife.R;
import com.example.apple.pocketlife.app.ui.everyday.basketball.adapter.BasketVpAdapter;
import com.example.apple.pocketlife.app.ui.everyday.basketball.basketftagment.NormalFragment;
import com.example.apple.pocketlife.app.ui.everyday.basketball.basketftagment.TeamMatchFragment;
import com.example.apple.pocketlife.app.ui.everyday.basketball.basketftagment.TeamScheduleFragment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * NBA页面
 */
public class BasketballActivity extends AppCompatActivity {
    List<Fragment> mListFragments = new ArrayList<>();
    List<String> mTabStrings = new ArrayList<>();
    List<String> mTabSkip = new ArrayList<>();
    BasketVpAdapter basketVpAdapter;
    FragmentManager fragmentManager;

    @BindView(R.id.tab_basket)
    TabLayout tabBasket;
    @BindView(R.id.vp_basket)
    ViewPager vpBasket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketball);
        ButterKnife.bind(this);
        initData();
        initVp();
    }

    /**
     * ViewPager 初始化
     */
    private void initVp() {
        basketVpAdapter = new BasketVpAdapter(fragmentManager, mListFragments, mTabStrings);
        vpBasket.setOffscreenPageLimit(mListFragments.size() - 1);
        vpBasket.setAdapter(basketVpAdapter);
        tabBasket.setupWithViewPager(vpBasket);
    }

    /**
     * 数据初始化
     */
    private void initData() {
        String[] stringArray = getResources().getStringArray(R.array.basketball);
        mTabStrings.addAll(Arrays.asList(stringArray));
        mListFragments.add(NormalFragment.newInstance());
        mListFragments.add(TeamMatchFragment.newInstance());
        mListFragments.add(TeamScheduleFragment.newInstance());
        fragmentManager = getSupportFragmentManager();
    }
}
