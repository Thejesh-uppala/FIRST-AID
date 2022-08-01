package com.example.firstaidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Success extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        getSupportActionBar().hide();
    }

    public void one(View V) {
        Intent i = new Intent(this, one.class);
        startActivity(i);
    }
    public void two(View V) {
        Intent i = new Intent(this, two.class);
        startActivity(i);
    }
    public void three(View V) {
        Intent i = new Intent(this, three.class);
        startActivity(i);
    }
    public void four(View V) {
        Intent i = new Intent(this, four.class);
        startActivity(i);
    }
    public void five(View V) {
        Intent i = new Intent(this, five.class);
        startActivity(i);
    }
    public void six(View V) {
        Intent i = new Intent(this, six.class);
        startActivity(i);
    }
    public void seven(View V) {
        Intent i = new Intent(this, seven.class);
        startActivity(i);
    }
    public void eight(View V) {
        Intent i = new Intent(this, eight.class);
        startActivity(i);
    }
    public void nine(View V) {
        Intent i = new Intent(this, nine.class);
        startActivity(i);
    }
    public void ten(View V) {
        Intent i = new Intent(this, ten.class);
        startActivity(i);
    }
}

