package com.github.cyc.constraintlayoutdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

/**
 * 相对定位
 */
public class Demo01Activity extends AppCompatActivity {

    public static void start(Context context) {
        Intent intent = new Intent(context, Demo01Activity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo01);
    }
}
