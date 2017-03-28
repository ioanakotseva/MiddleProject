package com.example.ioana.middleproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WomanShoesActivity extends AppCompatActivity {

    private Button womanShoesButton;
    private Button manShoesButton;
    private Button bagsButton;
    private Button contactsButton;
    private Button settingsButton;
    private Button myAccountButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_woman_shoes);
        getSupportActionBar().hide();

        womanShoesButton = (Button) this.findViewById(R.id.women_shoes_button_women_page);
        manShoesButton = (Button) this.findViewById(R.id.men_shoes_button_women_page);
        bagsButton = (Button) this.findViewById(R.id.bags_button_women_page);
        contactsButton = (Button) this.findViewById(R.id.contacts_women_page);
        myAccountButton = (Button) this.findViewById(R.id.my_account_women_page);
        settingsButton = (Button) this.findViewById(R.id.settings_women_page);

        womanShoesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WomanShoesActivity.this, WomanShoesActivity.class);
                WomanShoesActivity.this.startActivity(intent);
            }
        });

        manShoesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WomanShoesActivity.this, ManShoesActivity.class);
                WomanShoesActivity.this.startActivity(intent);
            }
        });

        bagsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WomanShoesActivity.this, BagsActivity.class);
                WomanShoesActivity.this.startActivity(intent);
            }
        });

        contactsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WomanShoesActivity.this, ContactsActivity.class);
                WomanShoesActivity.this.startActivity(intent);
            }
        });

        myAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WomanShoesActivity.this, MyAccountActivity.class);
                WomanShoesActivity.this.startActivity(intent);
            }
        });

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WomanShoesActivity.this, SettingsActivity.class);
                WomanShoesActivity.this.startActivity(intent);
            }
        });
    }
}
