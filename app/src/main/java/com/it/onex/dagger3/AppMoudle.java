package com.it.onex.dagger3;

import android.util.Log;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Linsa on 2018/3/18:16:32.
 * des:
 */
@Module
public class AppMoudle {

    private MyApp context;

    public AppMoudle(MyApp context) {
        this.context = context;
    }

    @Singleton
    @Provides
    public OkhttpUtils provideOkhttpUtils() {
        OkhttpUtils okService = new OkhttpUtils(context);
        Log.d("TAG", "provideApiService: " + okService);
        return okService;
    }
}
