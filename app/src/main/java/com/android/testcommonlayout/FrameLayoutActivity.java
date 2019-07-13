package com.android.testcommonlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class FrameLayoutActivity extends AppCompatActivity {

    private ImageView iv_p1;
    private ImageView iv_p2;
    private ImageView iv_p3;
    private ImageView iv_p4;
    private ImageView iv_p5;
    private FrameLayout frame_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
        findViewById(R.id.btn_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        iv_p1 = findViewById(R.id.iv_p1);
        iv_p2 = findViewById(R.id.iv_p2);
        iv_p3 = findViewById(R.id.iv_p3);
        iv_p4 = findViewById(R.id.iv_p4);
        iv_p5 = findViewById(R.id.iv_p5);
        frame_layout = findViewById(R.id.frame_layout);

        startP1();
    }

    private void startP1() {
        iv_p1.setVisibility(View.VISIBLE);
        iv_p1.postDelayed(new Runnable() {
            @Override
            public void run() {
                iv_p1.setVisibility(View.GONE);
                startP2();
            }
        }, 1000);
    }

    private void startP2() {
        iv_p2.setVisibility(View.VISIBLE);
        iv_p2.postDelayed(new Runnable() {
            @Override
            public void run() {
                iv_p2.setVisibility(View.GONE);
                startP3();
            }
        }, 1000);
    }

    private void startP3() {
        iv_p3.setVisibility(View.VISIBLE);
        iv_p3.postDelayed(new Runnable() {
            @Override
            public void run() {
                iv_p3.setVisibility(View.GONE);
                startP4();
            }
        }, 1000);
    }

    private void startP4() {
        iv_p4.setVisibility(View.VISIBLE);
        iv_p4.postDelayed(new Runnable() {
            @Override
            public void run() {
                iv_p4.setVisibility(View.GONE);
                startP5();
            }
        }, 1000);
    }

    private void startP5() {
        iv_p5.setVisibility(View.VISIBLE);
        iv_p5.postDelayed(new Runnable() {
            @Override
            public void run() {
                iv_p5.setVisibility(View.GONE);
                startP1();
            }
        }, 1000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        iv_p1.removeCallbacks(null);
        iv_p2.removeCallbacks(null);
        iv_p3.removeCallbacks(null);
        iv_p4.removeCallbacks(null);
        iv_p5.removeCallbacks(null);
    }
}
