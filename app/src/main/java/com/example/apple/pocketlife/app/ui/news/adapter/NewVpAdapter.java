package com.example.apple.pocketlife.app.ui.news.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by apple on 17/3/18.
 */

public class NewVpAdapter extends FragmentPagerAdapter{
    List<Fragment> mListFragments;
    List<String> mTabStrings;

    public NewVpAdapter(FragmentManager fm, List<Fragment> listFragments
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
