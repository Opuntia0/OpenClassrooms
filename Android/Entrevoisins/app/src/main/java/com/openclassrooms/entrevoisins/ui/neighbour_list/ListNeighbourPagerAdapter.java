package com.openclassrooms.entrevoisins.ui.neighbour_list;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.openclassrooms.entrevoisins.ui.favorites.FavoriteFragment;

public class ListNeighbourPagerAdapter extends FragmentPagerAdapter {

    public ListNeighbourPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    /**
     * getItem is called to instantiate the fragment for the given page.
     * @param position
     * @return
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return NeighbourFragment.newInstance(false);
        }
        // false pour le premier (position = 0) et true pour le deuxieme
        return FavoriteFragment.newInstance(true);
    }

    /**
     * get the number of pages
     * @return
     */
    @Override
    public int getCount() {
        return 2;
    }
}