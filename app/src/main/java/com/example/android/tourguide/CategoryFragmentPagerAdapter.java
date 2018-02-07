package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by carlo on 1/11/18.
 */

public class CategoryFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryFragmentPagerAdapter (Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CityFragment();
        } else if (position == 1) {
            return new EventsFragment();
        } else if (position == 2) {
            return new FoodFragment();
        } else if (position == 3) {
            return new ParksFragment();
        } else if (position == 4) {
            return new ShoppingFragment();
        } else {
            return new CityFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "The City";
        } else if (position == 1) {
            return "Events";
        } else if (position == 2) {
            return "Food";
        } else if (position == 3) {
            return "Parks";
        } else if (position == 4) {
            return "Shopping";
        } else {
            return "The City";
        }
    }
}
