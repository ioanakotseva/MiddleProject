package com.example.ioana.projectshoesshop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class SettingsActivity extends AppCompatActivity {

    private Button changePassword;
    private Button logOut;
    private Button deleteAccount;
    private Button contactsButton;
    private Button myAccountButton;
    private Button homeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        changePassword = (Button) this.findViewById(R.id.changePassButton);
        logOut = (Button) this.findViewById(R.id.logOutButton);
        deleteAccount = (Button) this.findViewById(R.id.deleteAccountButton);
        contactsButton = (Button) this.findViewById(R.id.contacts_settings);
        myAccountButton = (Button) this.findViewById(R.id.myAccount_setting);
        homeButton = (Button) this.findViewById(R.id.home_settings);

        changePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingsActivity.this, ChangePasswordActivity.class);
                SettingsActivity.this.startActivity(intent);

            }
        });

        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
                SettingsActivity.this.startActivity(intent);
                finish();
            }
        });

        deleteAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
                SettingsActivity.this.startActivity(intent);
                finish();
            }
        });

        contactsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingsActivity.this, ContactsActivity.class);
                SettingsActivity.this.startActivity(intent);
            }
        });

        myAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingsActivity.this, MyAccountActivity.class);
                SettingsActivity.this.startActivity(intent);

            }
        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingsActivity.this, HomeActivity.class);
                SettingsActivity.this.startActivity(intent);
            }
        });
    }
}
