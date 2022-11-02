package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
    }

    public void handleGanti(View view) {
        Intent move = new Intent(SettingActivity.this, GantiPwActivity.class);
        startActivity(move);
    }

    public void handleBack(View view) {
        Intent move = new Intent(SettingActivity.this, HomeChatActivity.class);
        startActivity(move);
    }
}