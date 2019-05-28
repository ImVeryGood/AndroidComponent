package com.component.app;

import android.app.Application;

import com.baselibrary.skin.SkinManager;

/**
 * date:2019/5/23
 * describe：
 */
public class MApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SkinManager.getInstance().init(this);
    }
}
