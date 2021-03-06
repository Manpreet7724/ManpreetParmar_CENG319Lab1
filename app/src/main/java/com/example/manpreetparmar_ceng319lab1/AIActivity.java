package com.example.manpreetparmar_ceng319lab1;
//Manpreet Parmar
//N01302460
//2020/09/21
//CENG319

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class AIActivity extends AppCompatActivity
{
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState)// tells user the activy was created
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aiactivity);

        Intent intent = getIntent();
        String result = intent.getStringExtra("activity");
        textView = findViewById(R.id.aiView);
        textView.setText(result + ":\n");
        textView.append(getString(R.string.onCreate)+"\n");
    }

    public void onStart()// tells user the activy was started
    {
        super.onStart();
        textView.append(getString(R.string.onStart)+"\n");
    }

    public  void onStop() // tells user the activy was stoped
    {
        super.onStop();
        textView.append(getString(R.string.onStop)+"\n");
    }

    public  void onDestroy()
    {
        super.onDestroy();
    }//destorys activty
}
