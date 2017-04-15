package com.example.apple.pocketlife.app.ui.news;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.apple.pocketlife.R;
import com.example.apple.pocketlife.app.ui.news.adapter.NewVpAdapter;
import com.example.apple.pocketlife.app.ui.news.newsfragment.NewsFragment;
import com.example.apple.pocketlife.lib.base.BaseFragment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

import static android.content.ContentValues.TAG;

/**
 * 第一页
 */
public class OneFragment extends BaseFragment {
    List<Fragment> mListFragments = new ArrayList<>();
    List<String> mTabStrings = new ArrayList<>();
    List<String> mTabSkip = new ArrayList<>();
    NewVpAdapter newsVpAdapter;
    FragmentManager fragmentManager;

    @BindView(R.id.tab_first)
    TabLayout tabFirst;
    @BindView(R.id.vp_first)
    ViewPager vpFirst;

    public OneFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static OneFragment newInstance() {
        OneFragment fragment = new OneFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        ButterKnife.bind(this, view);
        fragmentManager = getChildFragmentManager();
        initData();
        initVp();
        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    private void initVp() {
        newsVpAdapter = new NewVpAdapter(fragmentManager, mListFragments, mTabStrings);
        vpFirst.setOffscreenPageLimit(mListFragments.size() - 1);
        vpFirst.setAdapter(newsVpAdapter);
        tabFirst.setupWithViewPager(vpFirst);
    }


    private void initData() {
        String[] stringArray = getResources().getStringArray(R.array.newlist_ch);
        String[] stringArraySkip = getResources().getStringArray(R.array.newlist_en);
        mTabStrings.addAll(Arrays.asList(stringArray));
        mTabSkip.addAll(Arrays.asList(stringArraySkip));
        for (int i = 0; i < mTabStrings.size(); i++) {
            mListFragments.add(NewsFragment.newInstance(mTabSkip.get(i)));
        }
        fragmentManager = getChildFragmentManager();
    }

}
