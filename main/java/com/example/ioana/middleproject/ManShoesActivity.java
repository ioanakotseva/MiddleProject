package com.example.ioana.middleproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ioana.middleproject.model.ManShoes;
import com.example.ioana.middleproject.model.Product;

public class ManShoesActivity extends AppCompatActivity {

    private Button womanShoesButton;
    private Button manShoesButton;
    private Button bagsButton;
    private Button contactsButton;
    private Button settingsButton;
    private Button myAccountButton;


    static{
        ManShoes.createNewShoes(Product.Brand.GUCCI, Product.Color.BLACK, 348.99);
        ManShoes.createNewShoes(Product.Brand.LACOSTE, Product.Color.WHITE, 99.99);
        ManShoes.createNewShoes(Product.Brand.ADIDAS, Product.Color.GREEN, 180);
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
                Intent intent = new Intent(ManShoesActivity.this, WomanShoesActivity.class);
                ManShoesActivity.this.startActivity(intent);
                finish();
            }
        });


        manShoesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManShoesActivity.this, ManShoesActivity.class);
                ManShoesActivity.this.startActivity(intent);
                finish();
            }
        });


        bagsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManShoesActivity.this, BagsActivity.class);
                ManShoesActivity.this.startActivity(intent);
                finish();
            }
        });

        contactsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManShoesActivity.this, ContactsActivity.class);
                ManShoesActivity.this.startActivity(intent);
                finish();
            }
        });

        myAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManShoesActivity.this, MyAccountActivity.class);
                ManShoesActivity.this.startActivity(intent);
                finish();
            }
        });

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManShoesActivity.this, SettingsActivity.class);
                ManShoesActivity.this.startActivity(intent);
                finish();
            }
        });
    }

}
