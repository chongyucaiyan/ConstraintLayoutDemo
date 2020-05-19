package com.github.cyc.constraintlayoutdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

/**
 * 外边距
 */
public class Demo02Activity extends AppCompatActivity {

    public static void start(Context context) {
        Intent intent = new Intent(context, Demo02Activity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo02);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle(R.string.title_demo02);
        }
    }
}
