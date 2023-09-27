package com.example.dice;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.javalib.Dice;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Dice dice =  new Dice();
        dice.roll(6);
    }
}
