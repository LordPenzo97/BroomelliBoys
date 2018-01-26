package com.broomelliboys.broomelliboys.broomelliboys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class BreadStyx extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);

        ArrayList<MenuItems> itemsList = new ArrayList<>();

        itemsList.add(new MenuItems("Breadstyx- ","brushed with extra virgin olive oil, then sprinkled with parmesan, oregano, and garlic salt", 4.99f));
        itemsList.add(new MenuItems("Cheesestyx- ", "topped with white cheddar cheese, then sprinkled with parmesan and oregano",5.99f));
        itemsList.add(new MenuItems("Pestostyx- ","topped with our homemade pesto, white cheddar, sprinkled with parmesan and oregano", 5.99f));
        itemsList.add(new MenuItems("Whitestyx- ","topped with feta, and mozzarella cheeses, with fresh garlic, parmesan, and oregano",5.99f));

        MenuItemsAdapter menuItemsAdapter = new MenuItemsAdapter(this, itemsList);

        ListView listView = (ListView) findViewById(R.id.breadStyx);

        listView.setAdapter(menuItemsAdapter);
    }
}
