package com.adnonstop.pagestetesswitchproject;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/**
 * Author:　Created by benjamin
 * DATE :  2018/3/15 16:33
 * versionCode:　v2.2
 */

public class PageStatesSwitchLayout extends FrameLayout {


    public PageStatesSwitchLayout(@NonNull Context context) {
        this(context, null);
    }

    public PageStatesSwitchLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, -1);
    }

    public PageStatesSwitchLayout(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void showLoadingView() {
        removeAllViews();
        inflate(getContext(), R.layout.loading_layout, this);
    }

    public void showBadNetwork() {
        removeAllViews();
        inflate(getContext(), R.layout.bad_network_layout, this);
    }

    public void showEmptyView(View emptyView, LayoutParams layoutParams) {
        removeAllViews();
        if (emptyView == null) {
            inflate(getContext(), R.layout.empty_layout, this);
        } else {
            if (layoutParams == null) {
                throw new RuntimeException("layoutParams 不可以为 null");
            }
            addView(emptyView, layoutParams);
        }
    }

    public void showContentView(View contentView, LayoutParams layoutParams) {
        removeAllViews();
        // 添加ContentView
        if (contentView == null || layoutParams == null) {
            throw new RuntimeException("contentView 或者 layoutParams 任何一个都不可以为 null");
        }
        addView(contentView, layoutParams);
    }
}
