package com.github.cyc.constraintlayoutdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

/**
 * 辅助工具
 */
public class Demo05Activity extends AppCompatActivity {

    public static void start(Context context) {
        Intent intent = new Intent(context, Demo05Activity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo05);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle(R.string.title_demo05);
        }
    }
}
