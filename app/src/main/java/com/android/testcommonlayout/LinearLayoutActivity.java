package com.android.testcommonlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;

public class LinearLayoutActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout linear_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        linear_layout = findViewById(R.id.linear_layout);
        findViewById(R.id.btn_back).setOnClickListener(this);
        findViewById(R.id.btn_left).setOnClickListener(this);
        findViewById(R.id.btn_vertical).setOnClickListener(this);
        findViewById(R.id.btn_horizontal).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_back:
                finish();
                break;
            case R.id.btn_left:
                linear_layout.setGravity(Gravity.LEFT);
                break;
            case R.id.btn_vertical:
                linear_layout.setGravity(Gravity.CENTER_VERTICAL);
                break;
            case R.id.btn_horizontal:
                linear_layout.setGravity(Gravity.CENTER_HORIZONTAL);
                break;
        }
    }
}
