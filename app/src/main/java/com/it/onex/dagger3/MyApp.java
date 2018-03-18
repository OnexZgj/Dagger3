package com.it.onex.dagger3;

import android.app.Application;

/**
 * Created by Linsa on 2018/3/18:16:28.
 * des:
 */

public class MyApp extends Application {

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent = DaggerAppComponent.builder().appMoudle(new AppMoudle(this)).build();

    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
