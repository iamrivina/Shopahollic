package com.example.rivinak.shopaholicapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ThreeColumn_ListAdapter extends ArrayAdapter<Item>{

    private LayoutInflater mInflater;
    private ArrayList<Item> items;
    private int mViewResourceId;

    public ThreeColumn_ListAdapter(Context context, int textViewResourceId, ArrayList<Item> items) {
        super(context, textViewResourceId, items);
        this.items = items;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mViewResourceId = textViewResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = mInflater.inflate(mViewResourceId, null);

        Item item = items.get(position);

        if (item != null) {
            TextView productName = (TextView) convertView.findViewById(R.id.textProductName);
            TextView stock = (TextView) convertView.findViewById(R.id.textStock);
            TextView price = (TextView) convertView.findViewById(R.id.textPrice);
            productName.setText(item.getProductName());
            stock.setText((item.getStock()));
            price.setText((item.getPrice()));
        }

        return convertView;
    }

}
