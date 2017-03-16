package com.example.ioana.projectshoesshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.ioana.projectshoesshop.model.User;


public class RegistrationActivity extends AppCompatActivity {

    User user;
    EditText email;
    EditText password;
    EditText password2;
    EditText firstName;
    EditText lastName;
    EditText age;
    EditText phoneNumber;
    Button singIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        email = (EditText) this.findViewById(R.id.addingEmail);
        password = (EditText) this.findViewById(R.id.password);
        password2 = (EditText) this.findViewById(R.id.password2);
        firstName = (EditText) this.findViewById(R.id.firsName);
        lastName = (EditText) this.findViewById(R.id.lastName);
        age = (EditText) this.findViewById(R.id.age);
        phoneNumber = (EditText) this.findViewById(R.id.phoneNumber);
        singIn = (Button) this.findViewById(R.id.singInButton);

        String userEmail = email.getText().toString();
        String userPass = password.getText().toString();
        String userPass2 = password2.getText().toString();
        String userFirstName = firstName.getText().toString();
        String userLastName = lastName.getText().toString();
        int userAge = Integer.parseInt(age.getText().toString());
        String userPhone = phoneNumber.getText().toString();
        if (userPass.equals(userPass2)) {
            User user = new User(userFirstName, userLastName, userAge, userPhone, userEmail, userPass);
        }

        singIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistrationActivity.this, HomeActivity.class);
                RegistrationActivity.this.startActivity(intent);
            }
        });

    }

}
