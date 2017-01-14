package com.example.rivinak.shopaholicapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.List;

import static java.util.Arrays.asList;


public class DatabaseHelper extends SQLiteOpenHelper{
    public DatabaseHelper(Context context) {

        super(context, "itemTable", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(ItemTable.CREATE_QUERY);
        seedProducts(sqLiteDatabase);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int prevVersion, int newVersion) {
        sqLiteDatabase.execSQL(ItemTable.DROP_QUERY);
        sqLiteDatabase.execSQL(ItemTable.CREATE_QUERY);
    }

    private void seedProducts(SQLiteDatabase sqLiteDatabase){
        List<Item> products = asList(
                new Item("Skirt", 20, 1000),
                new Item("Bag", 10, 2000),
                new Item("Heels", 6, 2300),
                new Item("Shirt", 23, 3200),
                new Item("Jeggings", 5, 3000));

        for (Item product : products) {
            ContentValues values = new ContentValues();
            values.put(ItemTable.NAME, product.getProductName());
            values.put(ItemTable.PRICE, product.getPrice());
            values.put(ItemTable.STOCK, product.getStock());

            sqLiteDatabase.insert(ItemTable.TABLE_NAME, null, values);
        }
    }

    public Cursor getProductCursor() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor data = db.rawQuery(ItemTable.SElECT_QUERY, null);
        return data;
    }
}