package com.broomelliboys.broomelliboys.broomelliboys;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Meals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meals);
    }

    public void goToPizza (View view) {
        Intent pizza = new Intent(Meals.this,Pizza.class);
        startActivity(pizza);
    }
}
