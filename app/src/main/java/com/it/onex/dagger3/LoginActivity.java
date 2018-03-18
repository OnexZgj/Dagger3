package com.it.onex.dagger3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity {


    @Inject
    OkhttpUtils okhttpUtils;

    @Inject
    OkhttpUtils okhttpUtils2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        DaggerLoginComponent.builder().appComponent(((MyApp)getApplication()).getAppComponent()).build().inject(this);

        Log.d("TAG", " LoginActivity : okhttpUtils :" +okhttpUtils.toString());
        Log.d("TAG", " LoginActivity : okhttpUtils2 :" +okhttpUtils2.toString());

    }
}
