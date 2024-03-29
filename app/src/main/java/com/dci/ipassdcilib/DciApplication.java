package com.dci.ipassdcilib;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

public class DciApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
