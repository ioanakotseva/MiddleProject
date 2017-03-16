package com.example.ioana.projectshoesshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WomanShoesActivity extends AppCompatActivity {

    private Button homeButton;
    private Button manShoesButton;
    private Button bagsButton;
    private Button contactsButton;
    private Button settingsButton;
    private Button myAccountButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bags);

        homeButton = (Button) this.findViewById(R.id.home_woman);
        manShoesButton = (Button) this.findViewById(R.id.manShoesButton_woman);
        bagsButton = (Button) this.findViewById(R.id.bagsButton_woman);
        contactsButton = (Button) this.findViewById(R.id.contacts_woman);
        myAccountButton = (Button) this.findViewById(R.id.myAccount_woman);
        settingsButton = (Button) this.findViewById(R.id.settings_woman);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WomanShoesActivity.this, HomeActivity.class);
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
