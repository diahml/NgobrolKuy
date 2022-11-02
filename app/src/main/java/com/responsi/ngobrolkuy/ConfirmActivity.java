package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ConfirmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
    }

    public void handleIya(View view) {
        Intent move = new Intent(ConfirmActivity.this, HomeChatActivity.class);
        startActivity(move);
    }

    public void handleTidak(View view) {
        Intent move = new Intent(ConfirmActivity.this, GantiPwActivity.class);
        startActivity(move);
    }

    public void handleBack(View view) {
        Intent move = new Intent(ConfirmActivity.this, HomeChatActivity.class);
        startActivity(move);
    }
}