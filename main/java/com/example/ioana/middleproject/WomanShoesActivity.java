package com.example.ioana.middleproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ioana.middleproject.model.Product;
import com.example.ioana.middleproject.model.WomanShoes;

public class WomanShoesActivity extends AppCompatActivity {

    private Button womanShoesButton;
    private Button manShoesButton;
    private Button bagsButton;
    private Button contactsButton;
    private Button settingsButton;
    private Button myAccountButton;

    static{
        WomanShoes.createNewWomanShoes(Product.Brand.CHRISTIAN_DIOR, Product.Color.BLACK, 2878.99);
        WomanShoes.createNewWomanShoes(Product.Brand.LOUBOUTIN, Product.Color.RED, 4500);
        WomanShoes.createNewWomanShoes(Product.Brand.TIMBERLAND, Product.Color.PURPLE, 415.80);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bags);

        womanShoesButton = (Button) this.findViewById(R.id.womanShoesButton);
        manShoesButton = (Button) this.findViewById(R.id.manShoesButton);
        bagsButton = (Button) this.findViewById(R.id.bagsButton);
        contactsButton = (Button) this.findViewById(R.id.contacts);
        myAccountButton = (Button) this.findViewById(R.id.myAccount);
        settingsButton = (Button) this.findViewById(R.id.settings);

        womanShoesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WomanShoesActivity.this, WomanShoesActivity.class);
                WomanShoesActivity.this.startActivity(intent);
                finish();
            }
        });


        manShoesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WomanShoesActivity.this, ManShoesActivity.class);
                WomanShoesActivity.this.startActivity(intent);
                finish();
            }
        });


        bagsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WomanShoesActivity.this, BagsActivity.class);
                WomanShoesActivity.this.startActivity(intent);
                finish();
            }
        });

        contactsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WomanShoesActivity.this, ContactsActivity.class);
                WomanShoesActivity.this.startActivity(intent);
                finish();
            }
        });

        myAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WomanShoesActivity.this, MyAccountActivity.class);
                WomanShoesActivity.this.startActivity(intent);
                finish();
            }
        });

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WomanShoesActivity.this, SettingsActivity.class);
                WomanShoesActivity.this.startActivity(intent);
                finish();
            }
        });
    }
}