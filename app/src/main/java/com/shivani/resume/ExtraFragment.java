package com.shivani.resume;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;


public class ExtraFragment extends Fragment {

   TabLayout tabLayout;
   ViewPager viewPager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_extra, container, false);
       tabLayout = view.findViewById(R.id.tabLayout);
       viewPager = view.findViewById(R.id.viewPager);

       tabLayout.addTab(tabLayout.newTab().setText("Personal"));
        tabLayout.addTab(tabLayout.newTab().setText("Most Proud Of"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        ViewPgerAdapter pgerAdapter = new ViewPgerAdapter(getFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pgerAdapter);

        tabLayout.setupWithViewPager(viewPager);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setTabTextColors(R.color.colorAccent, Color.WHITE);
        //viewPager.addOnPageChangeListener(TabLayout.TabL)

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return view;
    }


}
