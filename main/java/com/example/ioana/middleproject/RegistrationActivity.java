package com.example.ioana.middleproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ioana.middleproject.model.User;

public class RegistrationActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    EditText confirmedPassword;
    Button singIn;
    Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        getSupportActionBar().hide();

        singIn = (Button) this.findViewById(R.id.singInButton);
        cancel = (Button) this.findViewById(R.id.cancelButton);
        username = (EditText) this.findViewById(R.id.email_registration);
        password = (EditText) this.findViewById(R.id.password_editText);
        confirmedPassword = (EditText) this.findViewById(R.id.confirm_password_editText);

        singIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isAvailable = true;
                for (User u: MainActivity.registeredUsers) {
                    if(u.getUsername().equals(username.getText().toString())){
                        isAvailable = false;
                        break;
                    }
                }
                if(isAvailable) {
                    if (validData(username.getText().toString(), password.getText().toString(), confirmedPassword.getText().toString())) {
                        User user = new User(username.getText().toString(), password.getText().toString());
                        MainActivity.registeredUsers.add(user);
                        Intent intent = new Intent(RegistrationActivity.this, HomeActivity.class);
                        RegistrationActivity.this.startActivity(intent);
                    }
                }
                else{
                    username.setError("This username is not available");
                    username.requestFocus();
                }
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistrationActivity.this, MainActivity.class);
                RegistrationActivity.this.startActivity(intent);
                Toast.makeText(RegistrationActivity.this, "Canceled registration!", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }

    private boolean validData(String userName, String pass, String pass2){
        if(userName.isEmpty()){
            username.setError("Username cannot be empty!");
            username.requestFocus();
            return false;
        }
        if(pass.isEmpty()){
            password.setError("Password cannot be empty!");
            password.requestFocus();
            return false;
        }
        if(!pass.equals(pass2)){
            confirmedPassword.setError("Passwords are not equal!");
            password.requestFocus();
            return false;
        }
        return true;
    }
}
