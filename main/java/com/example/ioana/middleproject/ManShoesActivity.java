package com.example.ioana.middleproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ManShoesActivity extends AppCompatActivity {

    private Button womanShoesButton;
    private Button manShoesButton;
    private Button bagsButton;
    private Button contactsButton;
    private Button settingsButton;
    private Button myAccountButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_shoes);
        getSupportActionBar().hide();

        womanShoesButton = (Button) this.findViewById(R.id.women_shoes_button_men_page);
        manShoesButton = (Button) this.findViewById(R.id.men_shoes_button_men_page);
        bagsButton = (Button) this.findViewById(R.id.bags_button_men_page);
        contactsButton = (Button) this.findViewById(R.id.contacts_men_page);
        myAccountButton = (Button) this.findViewById(R.id.my_account_men_page);
        settingsButton = (Button) this.findViewById(R.id.settings_men_page);

        womanShoesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManShoesActivity.this, WomanShoesActivity.class);
                ManShoesActivity.this.startActivity(intent);
            }
        });


        manShoesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManShoesActivity.this, ManShoesActivity.class);
                ManShoesActivity.this.startActivity(intent);
            }
        });


        bagsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManShoesActivity.this, BagsActivity.class);
                ManShoesActivity.this.startActivity(intent);
            }
        });

        contactsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManShoesActivity.this, ContactsActivity.class);
                ManShoesActivity.this.startActivity(intent);
            }
        });

        myAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManShoesActivity.this, MyAccountActivity.class);
                ManShoesActivity.this.startActivity(intent);
            }
        });

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManShoesActivity.this, SettingsActivity.class);
                ManShoesActivity.this.startActivity(intent);
            }
        });
    }

}
