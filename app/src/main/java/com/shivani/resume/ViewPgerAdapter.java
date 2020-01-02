package com.shivani.resume;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPgerAdapter extends FragmentPagerAdapter {

    int tabCount;

    public ViewPgerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;
        if (position == 0)
        {
            fragment = new AbutMeFragment();
        }
        else if (position == 1)
        {
            fragment = new EducationFragment();
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return tabCount ;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        String title = null;
        if (position == 0)
        {
            title = "Personal";
        }
        else if (position == 1)
        {
            title = "Academic";
        }

        return title;

    }
}
