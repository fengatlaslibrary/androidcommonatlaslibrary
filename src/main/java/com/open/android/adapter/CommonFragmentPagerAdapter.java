package com.open.android.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class CommonFragmentPagerAdapter extends FragmentPagerAdapter {
	private List<Fragment> listFragment;
	private List<String> titleList;

    public CommonFragmentPagerAdapter(FragmentManager fm, List<Fragment> listFragment, List<String> titleList ) {
        super(fm);
        this.listFragment = listFragment;
        this.titleList = titleList;
    }

    @Override
    public int getCount() {
        return listFragment.size();
    }


    @Override
    public Fragment getItem(int position) {
        return listFragment.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }

    @Override
    public int getItemPosition(Object object) {
        // TODO Auto-generated method stub
        return POSITION_NONE;
    }
}
