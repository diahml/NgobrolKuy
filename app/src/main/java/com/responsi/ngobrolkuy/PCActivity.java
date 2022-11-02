package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pcactivity);
    }

    public void handleBack(View view) {
        Intent move = new Intent(PCActivity.this, HomeChatActivity.class);
        startActivity(move);
    }
}