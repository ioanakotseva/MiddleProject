package com.example.ioana.projectshoesshop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ManShoesActivity extends AppCompatActivity {

    private Button womanShoesButton;
    private Button homeButton;
    private Button bagsButton;
    private Button contactsButton;
    private Button settingsButton;
    private Button myAccountButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bags);

        womanShoesButton = (Button) this.findViewById(R.id.womanShoesButton_man);
        homeButton = (Button) this.findViewById(R.id.home_man);
        bagsButton = (Button) this.findViewById(R.id.bagsButton_man);
        contactsButton = (Button) this.findViewById(R.id.contacts_man);
        myAccountButton = (Button) this.findViewById(R.id.myAccount_man);
        settingsButton = (Button) this.findViewById(R.id.settings_man);

        womanShoesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManShoesActivity.this, WomanShoesActivity.class);
                ManShoesActivity.this.startActivity(intent);
            }
        });


        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManShoesActivity.this, HomeActivity.class);
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
