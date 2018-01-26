package com.broomelliboys.broomelliboys.broomelliboys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class PizzaToppings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_toppings_list);

        TextView meal = (TextView) findViewById(R.id.meal);
        TextView topPrice = (TextView) findViewById(R.id.toppingPrice);

        Intent intentExtras = getIntent();

        meal.setText(intentExtras.getStringExtra("meal") + intentExtras.getStringExtra("price"));
        topPrice.setText("Toppings " + intentExtras.getStringExtra("pricePerTop") + " each");

        ArrayList<String> listOfToppings = new ArrayList<>();

        listOfToppings.add("Pepperoni");
        listOfToppings.add("Hot Italian Sausage");
        listOfToppings.add("Ham");
        listOfToppings.add("Sliced Meatballs");
        listOfToppings.add("Bacon");
        listOfToppings.add("Onions");
        listOfToppings.add("Green Bell Peppers");
        listOfToppings.add("Mushrooms");
        listOfToppings.add("Spinach");
        listOfToppings.add("Roma Tomatoes");
        listOfToppings.add("Fresh Garlic");
        listOfToppings.add("Black Olives");
        listOfToppings.add("Green Olives");
        listOfToppings.add("Banana Peppers");
        listOfToppings.add("Jalapenos");
        listOfToppings.add("Pineapple");
        listOfToppings.add("Broccoli");
        listOfToppings.add("Pesto");
        listOfToppings.add("Breaded Eggplant");
        listOfToppings.add("Anchovies");
        listOfToppings.add("Artichoke Hearts");
        listOfToppings.add("Feta Cheese");
        listOfToppings.add("Gorgonzola Cheese");
        listOfToppings.add("White Cheddar");
        listOfToppings.add("Chicken");

        PizzaToppingAdapter itemsAdapter = new PizzaToppingAdapter(this, listOfToppings);

        ListView listView = (ListView) findViewById(R.id.pizzaList);

        listView.setAdapter(itemsAdapter);




    }

}
