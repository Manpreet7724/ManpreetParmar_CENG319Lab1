package com.example.manpreetparmar_ceng319lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {
    DisplayFrag fragment;
    String status;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment = (DisplayFrag) getSupportFragmentManager().findFragmentById(R.id.disFragment);
        status =getString(R.string.main)+"\n"+getString(R.string.onStop);
        fragment.displaymain(status);
    }

    @Override
    protected void onStart() // change
    {
        super.onStart();
        status = "\n"+getString(R.string.onStart);
        fragment.displaymain(status);
    }

    @Override
    protected void onStop() // change
    {
        super.onStop();
        status = "\n"+getString(R.string.onStop);
        fragment.displaymain(status);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}