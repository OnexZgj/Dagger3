package com.it.onex.dagger3;

import android.util.Log;

import okhttp3.OkHttpClient;

/**
 * Created by Linsa on 2018/3/18:16:34.
 * des:
 */

public class OkhttpUtils {


    private OkHttpClient mClient;

    public OkhttpUtils(MyApp context) {

        mClient = new OkHttpClient().newBuilder().build();
    }

    public void logId(){
        Log.d("TAG", "logId: "+mClient.toString());
    }
}
