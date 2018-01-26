package com.broomelliboys.broomelliboys.broomelliboys;

import android.app.Activity;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.broomelliboys.broomelliboys.broomelliboys.MenuItems;
import com.broomelliboys.broomelliboys.broomelliboys.R;

import java.util.ArrayList;

/**
 * Created by Dante on 1/19/2018.
 */

public class MenuItemsAdapter extends ArrayAdapter<MenuItems> {

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_list_item,parent,false);
        }

        MenuItems currentItem = getItem(position);

        TextView listing = (TextView) listItemView.findViewById(R.id.listing);

        //This lets use multiple text sizes and styles on a single text view
        String breadTitle = currentItem.getItem();
        String breadIntro = currentItem.getDescription();
        SpannableString ss1 = new SpannableString(breadTitle);
        SpannableString ss2 = new SpannableString(breadIntro);
        ss1.setSpan(new RelativeSizeSpan(2f), 0,breadTitle.length(),0);
        ss1.setSpan(new StyleSpan(Typeface.BOLD), 0,breadTitle.length(),0);
        listing.setText(TextUtils.concat(ss1,ss2));

        Button order = (Button) listItemView.findViewById(R.id.order);

        order.setText(Float.toString(currentItem.getPrice()));

        return listItemView;

    }

    public MenuItemsAdapter(Activity context, ArrayList<MenuItems> itemsForMenu) {
        super(context, 0, itemsForMenu);
    }


}
