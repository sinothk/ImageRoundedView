package com.sinothk.view.image.rounded.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sinothk.android.utils.UnitUtil;

public class RoundedDemoMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rounded_image_view_main);


        UnitUtil.getFileSize(11);
    }
}
