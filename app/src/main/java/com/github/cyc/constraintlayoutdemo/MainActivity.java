package com.github.cyc.constraintlayoutdemo;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        findViewById(R.id.btn_demo_01).setOnClickListener(this);
        findViewById(R.id.btn_demo_02).setOnClickListener(this);
        findViewById(R.id.btn_demo_03).setOnClickListener(this);
        findViewById(R.id.btn_demo_04).setOnClickListener(this);
        findViewById(R.id.btn_demo_05).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_demo_01:
                Demo01Activity.start(this);
                break;
            case R.id.btn_demo_02:
                Demo02Activity.start(this);
                break;
            case R.id.btn_demo_03:
                Demo03Activity.start(this);
                break;
            case R.id.btn_demo_04:
                Demo04Activity.start(this);
                break;
            case R.id.btn_demo_05:
                Demo05Activity.start(this);
                break;
            default:
                break;
        }
    }
}
