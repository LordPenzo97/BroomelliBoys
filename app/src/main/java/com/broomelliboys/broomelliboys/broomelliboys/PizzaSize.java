package com.broomelliboys.broomelliboys.broomelliboys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PizzaSize extends AppCompatActivity {

    public static Bundle bundle = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_size);
        bundle.putString("meal", "Pizza: ");
    }

    public void goToPizzaToppingsLarge (View view) {
        Intent pizzaToppings = new Intent(PizzaSize.this,PizzaToppings.class);
        bundle.putString("price","13.00");
        bundle.putString("pricePerTop","1.50");
        pizzaToppings.putExtras(bundle);
        startActivity(pizzaToppings);
    }

    public void goToPizzaToppingsMedium (View view) {
        Intent pizzaToppings = new Intent(PizzaSize.this,PizzaToppings.class);
        bundle.putString("price", "11.00");
        bundle.putString("pricePerTop","1.00");
        pizzaToppings.putExtras(bundle);
        startActivity(pizzaToppings);
    }

    public void goToPizzaToppingsGluten (View view) {
        Intent pizzaToppings = new Intent(PizzaSize.this,PizzaToppings.class);
        bundle.putString("price", "9.00");
        bundle.putString("pricePerTop","1.00");
        pizzaToppings.putExtras(bundle);
        startActivity(pizzaToppings);
    }

    public void goToPizzaToppingsFlatbread (View view) {
        Intent pizzaToppings = new Intent(PizzaSize.this,PizzaToppings.class);
        bundle.putString("price", "3.50");
        bundle.putString("pricePerTop",".075");
        pizzaToppings.putExtras(bundle);
        startActivity(pizzaToppings);
    }

    public void goToPizzaToppingsSlice (View view) {
        Intent pizzaToppings = new Intent(PizzaSize.this,PizzaToppings.class);
        bundle.putString("price", "3.00");
        bundle.putString("pricePerTop",".50");
        pizzaToppings.putExtras(bundle);
        startActivity(pizzaToppings);
    }
}
