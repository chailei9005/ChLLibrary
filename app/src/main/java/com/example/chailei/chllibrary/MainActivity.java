package com.example.chailei.chllibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.chailei.chllibrary.activity.IosBottomDialogActivity;
import com.example.chailei.chllibrary.activity.JdHeadActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jdHead(View view) {
        startActivity(new Intent(this, JdHeadActivity.class));
    }

    public void btmDialog(View view) {
        startActivity(new Intent(this, IosBottomDialogActivity.class));
    }
}
