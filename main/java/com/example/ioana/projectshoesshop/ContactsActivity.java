package com.example.ioana.projectshoesshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ioana.projectshoesshop.R;

public class ContactsActivity extends AppCompatActivity {

    private Button home;
    private Button myAccountButton;
    private Button settingsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        home = (Button) this.findViewById(R.id.home_contacts);
        myAccountButton = (Button) this.findViewById(R.id.myAccount_Contacts);
        settingsButton = (Button) this.findViewById(R.id.settings_contacts);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContactsActivity.this, HomeActivity.class);
                ContactsActivity.this.startActivity(intent);
            }
        });

        myAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContactsActivity.this, MyAccountActivity.class);
                ContactsActivity.this.startActivity(intent);
            }
        });

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContactsActivity.this, SettingsActivity.class);
                ContactsActivity.this.startActivity(intent);
            }
        });
    }
}
