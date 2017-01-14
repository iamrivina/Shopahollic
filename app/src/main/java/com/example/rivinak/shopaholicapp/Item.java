package com.example.rivinak.shopaholicapp;

public class Item {
    private String productName;
    private int stock;
    private int price;

    public Item(String name,int stock, int price){
        productName = name;
        this.stock = stock;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public int getStock() {
        return stock;
    }

    public int getPrice() {
        return price;
    }


}
