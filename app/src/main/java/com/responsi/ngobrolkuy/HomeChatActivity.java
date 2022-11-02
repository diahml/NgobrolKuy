package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_chat);
    }

    public void handleKeluar (View view) {
        Intent move = new Intent(HomeChatActivity.this, LoginActivity.class);
        startActivity(move);
    }

    public void handleSetting (View view) {
        Intent move = new Intent(HomeChatActivity.this, SettingActivity.class);
        startActivity(move);
    }

    public void handlepc(View view) {
        Intent move = new Intent(HomeChatActivity.this, PCActivity.class);
        startActivity(move);
    }


}