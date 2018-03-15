package com.adnonstop.pagestetesswitchproject;

import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    private PageStatesSwitchLayout pageStatesSwitchLayout;
    private RelativeLayout mRlViewContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        pageStatesSwitchLayout = new PageStatesSwitchLayout(this);
        pageStatesSwitchLayout.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        pageStatesSwitchLayout.setBackgroundColor(0x66005500);
        setContentView(pageStatesSwitchLayout);
        mRlViewContainer = (RelativeLayout) LayoutInflater.from(this).inflate(R.layout.normal_layout, pageStatesSwitchLayout, false);

        pageStatesSwitchLayout.showLoadingView();

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {

                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
                pageStatesSwitchLayout.showContentView(mRlViewContainer, layoutParams);
            }
        }, 1000);
    }
}
