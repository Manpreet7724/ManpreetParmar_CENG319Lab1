package com.example.manpreetparmar_ceng319lab1;
//Manpreet Parmar
//N01302460
//2020/09/21
//CENG319

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {
    DisplayFrag fragment;
    String status;
    @Override
    protected void onCreate(Bundle savedInstanceState)// tells user the activy is created
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment = (DisplayFrag) getSupportFragmentManager().findFragmentById(R.id.disFragment);
        status =getString(R.string.main)+"\n"+getString(R.string.onStop);
        fragment.displaymain(status);
    }

    @Override
    protected void onStart() // tells user the activy is started
    {
        super.onStart();
        status = "\n"+getString(R.string.onStart);
        fragment.displaymain(status);
    }

    @Override
    protected void onStop() // tells user the activy was stoped
    {
        super.onStop();
        status = "\n"+getString(R.string.onStop);
        fragment.displaymain(status);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }// tells user the activy is destoryed
}