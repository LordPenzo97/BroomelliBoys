package com.broomelliboys.broomelliboys.broomelliboys;

/**
 * Created by Dante on 1/19/2018.
 */

public class MenuItems {

    private String mItem;

    private String mDescription;

    private float mPrice;

    public MenuItems(String item, String description, float price) {
        mItem = item;
        mDescription = description;
        mPrice = price;
    }

    public String getItem() {
        return mItem;
    }

    public String getDescription() {
        return mDescription;
    }

    public float getPrice() {
        return mPrice;
    }
}
