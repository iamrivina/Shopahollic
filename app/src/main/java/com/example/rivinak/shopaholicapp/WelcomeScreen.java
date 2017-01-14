package com.example.rivinak.shopaholicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WelcomeScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
    }

    public void callShopActivity(View view) {
        Intent intent = new Intent(WelcomeScreen.this, ViewListContents.class);
        startActivity(intent);
    }



}
