package com.broomelliboys.broomelliboys.broomelliboys;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callStore(View view) {
        Intent call = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:9122677075"));
        startActivity(call);
    }

    public void map (View view) {
        Intent showMap = new Intent(Intent.ACTION_VIEW);
        showMap.setData(Uri.parse("geo:0,0?Broomelli+Boys+Pizzeria"));
        startActivity(showMap);
    }

    public void startOrder (View view) {

        Intent menuIntent = new Intent(MainActivity.this, Menu.class);
        startActivity(menuIntent);

        //CartItems test = new CartItems(1,1);
    }


}
