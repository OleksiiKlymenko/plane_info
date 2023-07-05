package com.example.planesburger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moveOneFirstPlane(View view) {
        Intent intent = new Intent(this, FirstPlane.class);
        startActivity(intent);
    }

    public void moveOneSecondPlane(View view) {
        Intent intent = new Intent(this, FirstPlane.class);
        startActivity(intent);
    }

    public void moveOneThirdPlane(View view) {
        Intent intent = new Intent(this, FirstPlane.class);
        startActivity(intent);
    }

    public void moveOneFourthPlane(View view) {
        Intent intent = new Intent(this, FirstPlane.class);
        startActivity(intent);
    }


}