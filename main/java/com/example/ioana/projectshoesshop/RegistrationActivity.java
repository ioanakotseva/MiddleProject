package com.example.ioana.projectshoesshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ioana.projectshoesshop.model.User;


public class RegistrationActivity extends AppCompatActivity {

    User user;

    Button singIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        singIn = (Button) this.findViewById(R.id.singInButton);
        singIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(RegistrationActivity.this, HomeActivity.class);
                RegistrationActivity.this.startActivity(intent);
            }
        });

    }
}
