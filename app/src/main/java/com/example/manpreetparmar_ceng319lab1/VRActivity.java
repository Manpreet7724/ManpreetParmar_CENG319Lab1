package com.example.manpreetparmar_ceng319lab1;
//Manpreet Parmar
//N01302460
//2020/09/21
//CENG319

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class VRActivity  extends AppCompatActivity
{
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) // tells user the activy is created
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vractivity);

        Intent intent = getIntent();
        String result = intent.getStringExtra("activity");
        textView = findViewById(R.id.vrView);
        textView.setText(result + ": \n");
        textView.append(getString(R.string.onCreate)+"\n");
    }
    public void onStart() // tells user the activy is started
    {
        super.onStart();
        textView.append(getString(R.string.onStart)+"\n");
    }
    public  void onStop() // tells user the activy is stopped
    {
        super.onStop();
        textView.append(getString(R.string.onStop)+"\n");
    }
    public  void onDestroy()
    {
        super.onDestroy();
    } // tells user the activy is destory
}
