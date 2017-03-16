package com.example.ioana.projectshoesshop;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class HomeActivity extends AppCompatActivity {

    private Button womanShoesButton;
    private Button manShoesButton;
    private Button bagsButton;
    private Button contactsButton;
    private Button myAccountButton;
    private Button settingsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        womanShoesButton = (Button) this.findViewById(R.id.womanShoesButton_home);
        manShoesButton = (Button) this.findViewById(R.id.manShoesButton_home);
        bagsButton = (Button) this.findViewById(R.id.bagsButton_home);
        contactsButton = (Button) this.findViewById(R.id.contacts_home);
        myAccountButton = (Button) this.findViewById(R.id.myAccount_home);
        settingsButton = (Button) this.findViewById(R.id.settings_home);

        womanShoesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, WomanShoesActivity.class);
                HomeActivity.this.startActivity(intent);

            }
        });

        manShoesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ManShoesActivity.class);
                HomeActivity.this.startActivity(intent);

            }
        });

        bagsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, BagsActivity.class);
                HomeActivity.this.startActivity(intent);
            }
        });

        contactsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ContactsActivity.class);
                HomeActivity.this.startActivity(intent);
            }
        });

        myAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MyAccountActivity.class);
                HomeActivity.this.startActivity(intent);
            }
        });

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, SettingsActivity.class);
                HomeActivity.this.startActivity(intent);
            }
        });
    }
}
