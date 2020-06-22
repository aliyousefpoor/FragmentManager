package com.example.fragmentlc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("oncreate", "onCreate: call");

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.framelayout,new MainFragment());
        transaction.commit();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("onstart", "onStart: call");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("onresume", "onResume: call");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("onpause", "onPause: call");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("onstop", "onStop: call");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ondestroy", "onDestroy: call");
    }
}