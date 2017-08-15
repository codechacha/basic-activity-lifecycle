package com.example.xyz.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(TAG, "onCreate(): activity가 생성되었습니다. View를 생성합니다.");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.v(TAG, "onStart(): activity가 화면에 보이게(visible) 됩니다.");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.v(TAG, "onResume(): 유저와 interaction할 수 있습니다.");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.v(TAG, "onPause(): 유저와 interaction할 수 없습니다.");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.v(TAG, "onStop(): activity가 더이상 화면에 보이지 않습니다.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.v(TAG, "onDestroy(): activity가 종료되었습니다. 모든 자원을 release합니다.");
    }

    void onButtonClick(View v) {
        Intent intent = new Intent(this, SubActivity01.class);
        startActivity(intent);

        Log.d(TAG, "onButtonClick: SubActivity01을 실행시켰습니다.");
    }
}
