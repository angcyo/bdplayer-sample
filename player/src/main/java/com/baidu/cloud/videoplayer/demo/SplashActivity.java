package com.baidu.cloud.videoplayer.demo;

import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import com.angcyo.player.R;

public class SplashActivity extends Activity {
    private static final String TAG = "SplashActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new TimerTask() {
            @Override
            public void run() {
                SplashActivity.this.startActivityForResult(new Intent(SplashActivity.this, MainActivity.class), 0);
            }
        }, 700);
        // checkUpdate();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        finish();
    }

    private void checkUpdate() {
        Toast.makeText(this, "检查新版本...", Toast.LENGTH_SHORT).show();
    }
}
