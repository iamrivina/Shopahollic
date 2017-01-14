package com.example.rivinak.shopaholicapp;

import android.provider.BaseColumns;

public class ItemTable implements BaseColumns {
    public static final String NAME = "name";
    public static final String STOCK = "stock";
    public static final String PRICE = "price";
    public static final String TABLE_NAME = "itemTable";

    public static final String CREATE_QUERY = "create table " + TABLE_NAME + " (" +
            _ID + " INTEGER, " +
            NAME + " TEXT, " +
            PRICE + " INTEGER, "+
            STOCK + "INTEGER)";

    public static final String DROP_QUERY = "drop table " + TABLE_NAME;
    public static final String SElECT_QUERY = "select * from " + TABLE_NAME;
}

