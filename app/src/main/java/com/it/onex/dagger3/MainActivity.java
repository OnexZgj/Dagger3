package com.it.onex.dagger3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {


    @Inject
    OkhttpUtils okhttpUtils;

    @Inject
    OkhttpUtils okhttpUtils2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnStart = (Button) findViewById(R.id.btn_start);

        DaggerUserComponet.builder().appComponent(((MyApp) getApplication()).getAppComponent()).build().inject(this);



        Log.d("TAG", " MainActivity : okhttpUtils :" +okhttpUtils.toString());
        Log.d("TAG", " MainActivity : okhttpUtils2 :" +okhttpUtils2.toString());

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });

    }
}
