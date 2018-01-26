package com.broomelliboys.broomelliboys.broomelliboys;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Dante on 1/17/2018.
 */

public class PizzaToppingAdapter extends ArrayAdapter<String> {

    boolean[] rCheckBoxState;
    boolean[] lCheckBoxState;
    boolean[] bCheckBoxState;

    ViewHolder viewHolder;

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {


        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_pizza_toppings_item, parent, false);
            viewHolder = new ViewHolder();

            viewHolder.topping = (TextView) listItemView.findViewById(R.id.topping);
            viewHolder.lCheckBox = (CheckBox) listItemView.findViewById(R.id.leftHalf);
            Log.v("pizzaAdapter","set a tag");
            viewHolder.rCheckBox = (CheckBox) listItemView.findViewById(R.id.rightHalf);
            viewHolder.bcheckBox = (CheckBox) listItemView.findViewById(R.id.bothHalves);

            listItemView.setTag(viewHolder);
        }

        viewHolder = (ViewHolder) listItemView.getTag();
        viewHolder.topping.setText(getItem(position));
        viewHolder.lCheckBox.setChecked(lCheckBoxState[position]);
        viewHolder.rCheckBox.setChecked(rCheckBoxState[position]);
        viewHolder.bcheckBox.setChecked(bCheckBoxState[position]);

        viewHolder.lCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lCheckBoxState[position]) {
                    lCheckBoxState[position] = false;
                } else {
                    lCheckBoxState[position] = true;
                }
            }
        });

        viewHolder.rCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rCheckBoxState[position]) {
                    rCheckBoxState[position] = false;
                } else {
                    rCheckBoxState[position] = true;
                }
            }
        });

        viewHolder.bcheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bCheckBoxState[position]) {
                    bCheckBoxState[position] = false;
                } else {
                    bCheckBoxState[position] = true;
                }
            }
        });

        return listItemView;
    }

    public PizzaToppingAdapter(Activity context, ArrayList<String> pizzaToppingsList) {
        super(context, 0, pizzaToppingsList);
        lCheckBoxState = new boolean[pizzaToppingsList.size()];
        rCheckBoxState = new boolean[pizzaToppingsList.size()];
        bCheckBoxState = new boolean[pizzaToppingsList.size()];

    }

    private class ViewHolder {
        TextView topping;
        CheckBox lCheckBox;
        CheckBox rCheckBox;
        CheckBox bcheckBox;
    }

}
