package com.example.acer.viewpagerandfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by acer on 2017/3/31.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {
    private  int count = 0;
    public MyPagerAdapter(FragmentManager fm,int count) {
        super(fm);
        this.count = count;
    }

    @Override
    public Fragment getItem(int position) {
        return BlankFragment.newInstance(position+1+"");
    }

    @Override
    public int getCount() {
        return count;
    }
}
