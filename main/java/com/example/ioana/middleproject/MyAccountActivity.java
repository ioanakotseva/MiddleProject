package com.example.ioana.middleproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyAccountActivity extends AppCompatActivity {

    private Button contactsButton;
    private Button myAccountButton;
    private Button settingsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_account);
        getSupportActionBar().hide();

        contactsButton = (Button) this.findViewById(R.id.contacts_my_account_page);
        myAccountButton = (Button) this.findViewById(R.id.my_account_my_account_page);
        settingsButton = (Button) this.findViewById(R.id.settings_my_account_page);

        contactsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyAccountActivity.this, ContactsActivity.class);
                MyAccountActivity.this.startActivity(intent);
                finish();
            }
        });

        myAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyAccountActivity.this, MyAccountActivity.class);
                MyAccountActivity.this.startActivity(intent);
                finish();
            }
        });

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyAccountActivity.this, SettingsActivity.class);
                MyAccountActivity.this.startActivity(intent);
                finish();
            }
        });
    }
}
