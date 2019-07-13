package com.android.testcommonlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_linear).setOnClickListener(this);
        findViewById(R.id.btn_relative).setOnClickListener(this);
        findViewById(R.id.btn_frame).setOnClickListener(this);
        findViewById(R.id.btn_table).setOnClickListener(this);
        findViewById(R.id.btn_grid).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_linear:
                startActivity(new Intent(this, LinearLayoutActivity.class));
                break;
            case R.id.btn_relative:
                startActivity(new Intent(this, RelativeLayoutActivity.class));
                break;
            case R.id.btn_frame:
                startActivity(new Intent(this, FrameLayoutActivity.class));
                break;
            case R.id.btn_table:
                startActivity(new Intent(this, TableLayoutActivity.class));
                break;
            case R.id.btn_grid:
                startActivity(new Intent(this, GridLayoutActivity.class));
                break;
        }
    }
}
