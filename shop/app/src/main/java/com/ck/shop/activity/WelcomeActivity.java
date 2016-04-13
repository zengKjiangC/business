package com.ck.shop.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.ck.shop.R;
import com.ck.shop.adapter.WelcomPagerAdapter;

public class WelcomeActivity extends Activity {


    private ViewPager vp_welcome;
    private WelcomPagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        initView();
    }

    private void initView() {
        vp_welcome = (ViewPager)findViewById(R.id.vp_welcome);

    }
}
