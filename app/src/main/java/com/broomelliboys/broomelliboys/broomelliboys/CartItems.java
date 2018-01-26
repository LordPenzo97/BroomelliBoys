package com.broomelliboys.broomelliboys.broomelliboys;

import android.os.Parcel;
import android.os.Parcelable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Dante on 1/13/2018.
 */

/**public class CartItems implements Parcelable {

    private boolean pizza = false;

    private boolean large = false;

    private boolean medium = false;

    private boolean glutenFree = false;

    private boolean flatbread = false;

    private boolean slice = false;

    private boolean salad = false;

    private boolean breadstyx = false;

    private boolean buffaloWings = false;

    private boolean specialties = false;

    private boolean whitePizza = false;

    private boolean calzones = false;

    private boolean subs = false;

    private boolean lunchSpecials = false;

    private boolean spaghetti = false;

    //private ArrayList<boolean> mPizzaToppings = new ArrayList<boolean>(25);

    private boolean pizzaToppings[] = new boolean[25];

    /**
     *
     * @param typeOfItem 1=pizza, 2=salad, 3=breadstyx, 4=buffaloWings, 5=specialties, 6=whitePizza, 7=calzones, 8=subs, 9=lunchSpecials, 10=spaghetti
     *
     * @param size 1=large, 2=medium, 3=glutenFree, 4=flatBread, 5=slice
     */
  /**  public CartItems(int typeOfItem, int size) {

        if (typeOfItem == 1 && size == 1) {
            pizza = true;
            large = true;
            Arrays.fill(pizzaToppings, Boolean.FALSE);
        } else if (typeOfItem == 1 && size ==2) {
            pizza = true;
            medium = true;
            Arrays.fill(pizzaToppings, Boolean.FALSE);
        } else if (typeOfItem == 1 && size == 3) {
            pizza = true;
            glutenFree = true;
            Arrays.fill(pizzaToppings,Boolean.FALSE);
        } else if (typeOfItem == 1 && size == 4) {
            pizza = true;
            flatbread = true;
            Arrays.fill(pizzaToppings, Boolean.FALSE);
        } else if (typeOfItem == 1 && size == 5) {
            pizza = true;
            slice = true;
            Arrays.fill(pizzaToppings, Boolean.FALSE);
        }

        




    }

    //This is for passing the information across activities
    protected CartItems(Parcel in) {
        pizza = in.readInt() == 1;

        large = in.readInt() == 1;

        medium = in.readInt() == 1;

        glutenFree = in.readInt() == 1;

        flatbread = in.readInt() == 1;

        slice = in.readInt() == 1;

        salad = in.readInt() == 1;

        breadstyx = in.readInt() == 1;

        buffaloWings = in.readInt() == 1;

        specialties = in.readInt() == 1;

        whitePizza = in.readInt() == 1;

        calzones = in.readInt() == 1;

        subs = in.readInt() == 1;

        lunchSpecials = in.readInt() == 1;

        spaghetti = in.readInt() == 1;

        pizzaToppings = in.createBooleanArray();

    }

}
*/