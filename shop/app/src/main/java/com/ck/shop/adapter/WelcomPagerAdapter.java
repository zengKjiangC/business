package com.ck.shop.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;

/**
 * Created by Administrator on 2016/4/13.
 */
public class WelcomPagerAdapter extends PagerAdapter {
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }
}
