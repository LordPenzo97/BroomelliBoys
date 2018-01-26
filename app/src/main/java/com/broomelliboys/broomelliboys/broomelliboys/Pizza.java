package com.broomelliboys.broomelliboys.broomelliboys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pizza extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);
    }

    public void goToSize (View view) {
        Intent pizzaSizes = new Intent(Pizza.this,PizzaSize.class);
        startActivity(pizzaSizes);

    }
}
