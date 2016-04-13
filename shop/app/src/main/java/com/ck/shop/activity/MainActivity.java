package com.ck.shop.activity;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.NavUtils;

import com.ck.shop.R;
import com.ck.shop.contant.Weather;

public class MainActivity extends Activity {

	private BitmapFactory.Options ops;
    private String[] weather = {
            Weather.SUNNY,
            Weather.CLOUDY,
            Weather.RAINING,
            Weather.SNOWING
    };
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    /**
     * 初始化布局页面
     */
    private void initView() {

    }

}
