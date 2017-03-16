package com.example.ioana.projectshoesshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class BagsActivity extends AppCompatActivity {

    private Button womanShoesButton;
    private Button manShoesButton;
    private Button homeButton;
    private Button contactsButton;
    private Button settingsButton;
    private Button myAccountButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bags);

        womanShoesButton = (Button) this.findViewById(R.id.womanShoesButton_bags);
        manShoesButton = (Button) this.findViewById(R.id.manShoesButton_bags);
        homeButton = (Button) this.findViewById(R.id.home_bags);
        contactsButton = (Button) this.findViewById(R.id.contacts_bags);
        myAccountButton = (Button) this.findViewById(R.id.myAccount_bags);
        settingsButton = (Button) this.findViewById(R.id.settings_bags);

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


        homeButton.setOnClickListener(new View.OnClickListener() {
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
                finish();
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
