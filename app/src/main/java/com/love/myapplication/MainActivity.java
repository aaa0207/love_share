package com.love.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.love.share.HttpUtils;
import com.love.share.LoveShareClient;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoveShareClient.init(this, "123", new HttpUtils.StringCallback() {
            @Override
            public void onSuccess(String result) {
                Log.e("xxx", result);
            }

            @Override
            public void onFaileure(int code, Exception e) {
                Log.e("xxx", code + e.toString());
            }
        });

    }
}