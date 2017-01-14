package com.example.rivinak.shopaholicapp;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ViewListContents extends AppCompatActivity {

    DatabaseHelper databaseHelper;
    ArrayList<Item> itemList;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_list_contents);
        databaseHelper = new DatabaseHelper(this);
        Cursor data = databaseHelper.getProductCursor();
        itemList = new ArrayList<Item>();
        int numRows = data.getCount();
        int i = 0;
        while (data.moveToNext()) {
            Item item = new Item(data.getString(1), data.getInt(2), data.getInt(3));
            itemList.add(i, item);
            System.out.println(data.getString(1) + " " + data.getString(2) + " " + data.getString(3));
            System.out.println(itemList.get(i).getProductName());
            i++;
        }
        ThreeColumn_ListAdapter adapter =  new ThreeColumn_ListAdapter(this,R.layout.list_adapter_view, itemList);
        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }


}
