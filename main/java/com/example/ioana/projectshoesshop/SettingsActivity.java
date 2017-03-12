package com.example.ioana.projectshoesshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.nikoleta.projectshoes.R;

public class SettingsActivity extends AppCompatActivity {

    private Button changePassword;
    private Button logOut;
    private Button deleteAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        changePassword = (Button) this.findViewById(R.id.changePassButton);
        logOut = (Button) this.findViewById(R.id.logOutButton);
        deleteAccount = (Button) this.findViewById(R.id.deleteAccountButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingsActivity.this, ChangePasswordActivity.class);
                SettingsActivity.this.startActivity(intent);
                finish();
            }
        };
        changePassword.setOnClickListener(listener);

        View.OnClickListener listener1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
                SettingsActivity.this.startActivity(intent);
                finish();
            }
        };
        logOut.setOnClickListener(listener1);

        View.OnClickListener listener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
                SettingsActivity.this.startActivity(intent);
                finish();
            }
        };
        deleteAccount.setOnClickListener(listener2);
    }
}
