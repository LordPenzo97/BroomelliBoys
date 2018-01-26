package com.broomelliboys.broomelliboys.broomelliboys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


    }

    public void goToMeals (View view) {

        Intent meals = new Intent(Menu.this, Meals.class);
        startActivity(meals);

    }

    public void goToSides (View view) {

        Intent sides = new Intent(Menu.this, Sides.class);
        startActivity(sides);
    }
}
