package com.example.ioana.middleproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ioana.middleproject.model.Bags;
import com.example.ioana.middleproject.model.Product;

public class BagsActivity extends AppCompatActivity {

    private Button womanShoesButton;
    private Button manShoesButton;
    private Button bagsButton;
    private Button contactsButton;
    private Button settingsButton;
    private Button myAccountButton;

    static {
        Bags.createNewWomanShoes(Product.Brand.CHRISTIAN_DIOR, 499.90);
        Bags.createNewWomanShoes(Product.Brand.GUCCI, 978);
        Bags.createNewWomanShoes(Product.Brand.LOUBOUTIN, 1974.10);
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
                Intent intent = new Intent(BagsActivity.this, WomanShoesActivity.class);
                BagsActivity.this.startActivity(intent);
                finish();
            }
        });


        manShoesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BagsActivity.this, ManShoesActivity.class);
                BagsActivity.this.startActivity(intent);
                finish();
            }
        });


        bagsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BagsActivity.this, BagsActivity.class);
                BagsActivity.this.startActivity(intent);
                finish();
            }
        });

        contactsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BagsActivity.this, ContactsActivity.class);
                BagsActivity.this.startActivity(intent);
                finish();
            }
        });

        myAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BagsActivity.this, MyAccountActivity.class);
                BagsActivity.this.startActivity(intent);
                finish();
            }
        });

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BagsActivity.this, SettingsActivity.class);
                BagsActivity.this.startActivity(intent);
                finish();
            }
        });
    }
}
