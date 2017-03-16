package com.example.ioana.projectshoesshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ioana.projectshoesshop.model.Information;
import com.example.ioana.projectshoesshop.model.User;


public class RegistrationActivity extends AppCompatActivity {

    EditText email;
    EditText password;
    EditText confirmedPassword;
    Button singIn;
    Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        singIn = (Button) this.findViewById(R.id.singInButton);
        cancel = (Button) this.findViewById(R.id.cancelButton);
        email = (EditText) this.findViewById(R.id.email_registration);
        password = (EditText) this.findViewById(R.id.password_editText);
        confirmedPassword = (EditText) this.findViewById(R.id.confirm_password_editText);

        singIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validData()) {
                    User user = new User(email.getText().toString(), password.getText().toString());
                    MainActivity.registeredUsers.add(user);
                    Intent intent = new Intent(RegistrationActivity.this, HomeActivity.class);
                    RegistrationActivity.this.startActivity(intent);
                }
                else{
                    Toast.makeText(RegistrationActivity.this, "Please, enter a valid data.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistrationActivity.this, MainActivity.class);
                RegistrationActivity.this.startActivity(intent);
            }
        });
    }

    private boolean validData(){
        if(!Information.isValidEmail(email.getText().toString()) || !Information.isStrongPassword(password.getText().toString())
                 || !(password.getText().toString().equals(confirmedPassword.getText().toString()))){
            return false;
        }
        for(User user : MainActivity.registeredUsers){
            if(this.email.getText().toString().equals(user.getEmail())){
                return false;
            }
        }
        return true;
    }
}
