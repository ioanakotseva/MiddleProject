package com.example.ioana.middleproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BagsActivity extends AppCompatActivity {

    private Button womanShoesButton;
    private Button manShoesButton;
    private Button bagsButton;
    private Button contactsButton;
    private Button settingsButton;
    private Button myAccountButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bags);
        getSupportActionBar().hide();

        womanShoesButton = (Button) this.findViewById(R.id.women_shoes_button_bags_page);
        manShoesButton = (Button) this.findViewById(R.id.men_shoes_button_bags_page);
        bagsButton = (Button) this.findViewById(R.id.bags_button_bags_page);
        contactsButton = (Button) this.findViewById(R.id.contacts_bags_page);
        myAccountButton = (Button) this.findViewById(R.id.my_account_bags_page);
        settingsButton = (Button) this.findViewById(R.id.settings_bags_page);

        womanShoesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BagsActivity.this, WomanShoesActivity.class);
                BagsActivity.this.startActivity(intent);
            }
        });


        manShoesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BagsActivity.this, ManShoesActivity.class);
                BagsActivity.this.startActivity(intent);
            }
        });


        bagsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BagsActivity.this, BagsActivity.class);
                BagsActivity.this.startActivity(intent);
            }
        });

        contactsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BagsActivity.this, ContactsActivity.class);
                BagsActivity.this.startActivity(intent);
            }
        });

        myAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BagsActivity.this, MyAccountActivity.class);
                BagsActivity.this.startActivity(intent);
            }
        });

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BagsActivity.this, SettingsActivity.class);
                BagsActivity.this.startActivity(intent);
            }
        });
    }
}
