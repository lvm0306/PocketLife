package com.example.apple.pocketlife.app.ui.everyday.basketball.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * NBA ViewPager 适配器
 * Created by apple on 17/4/2.
 */

public class BasketVpAdapter extends FragmentPagerAdapter {
    List<Fragment> mListFragments;
    List<String> mTabStrings;

    public BasketVpAdapter(FragmentManager fm, List<Fragment> listFragments
            , List<String> mTabStrings) {
        super(fm);
        this.mListFragments = listFragments;
        this.mTabStrings = mTabStrings;
    }

    @Override
    public Fragment getItem(int position) {
        return mListFragments.get(position);
    }

    @Override
    public int getCount() {
        return mListFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTabStrings.get(position);

    }
}
