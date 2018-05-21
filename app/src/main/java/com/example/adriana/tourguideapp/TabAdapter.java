package com.example.adriana.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabAdapter extends FragmentPagerAdapter {
    private Context context;

    public TabAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new LandmarksFragment();
        } else if (position == 1) {
            return new MuseumsFragment();
        } else if (position == 2) {
            return new ParksFragment();
        } else {
            return new RestaurantsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.landmarks);
        } else if (position == 1) {
            return context.getString(R.string.museums);
        } else if (position == 2) {
            return context.getString(R.string.parks);
        } else {
            return context.getString(R.string.restaurants);
        }
    }

}