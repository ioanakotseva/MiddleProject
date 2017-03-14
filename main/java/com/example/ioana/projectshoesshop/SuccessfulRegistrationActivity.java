package com.example.ioana.projectshoesshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SuccessfulRegistrationActivity extends AppCompatActivity {

    private Button homeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successful_registration);

        homeButton = (Button) this.findViewById(R.id.home_page_button);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SuccessfulRegistrationActivity.this, HomeActivity.class);
                SuccessfulRegistrationActivity.this.startActivity(intent);
                finish();
            }
        };
        homeButton.setOnClickListener(listener);
    }
}
