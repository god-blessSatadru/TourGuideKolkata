package com.example.android.tourguidekolkata;

/**
 * Created by baba on 9/5/2016.
 */

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class TourFragmentPageAdapter extends FragmentPagerAdapter {
    private String tabTitles[] = new String[4];
    Context context;

    public TourFragmentPageAdapter(FragmentManager fm, Context context)
    {
        super(fm);
        this.context = context;
        tabTitles[0] = context.getResources().getString(R.string.tab1);
        tabTitles[1] = context.getResources().getString(R.string.tab2);
        tabTitles[2] = context.getResources().getString(R.string.tab3);
        tabTitles[3] = context.getResources().getString(R.string.tab4);
    }


    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PlacesFragment();
        } else if (position == 1) {
            return new AccomodationFragment();
        } else if (position == 2) {
            return new DinningFragment();
        } else {
            return new SeasonFragment();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
