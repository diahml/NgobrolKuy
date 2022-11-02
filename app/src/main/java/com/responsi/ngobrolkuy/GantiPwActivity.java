package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GantiPwActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ganti_pw);
    }
    public void handleTerapkan(View view) {
        Intent move = new Intent(GantiPwActivity.this, ConfirmActivity.class);
        startActivity(move);
    }

    public void handleBack(View view) {
        Intent move = new Intent(GantiPwActivity.this, HomeChatActivity.class);
        startActivity(move);
    }
}