package com.example.ioana.projectshoesshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashSet;

public class MainActivity extends AppCompatActivity {


    HashSet<User> users;
    private Button logInButton;
    private Button singInButton;
    private EditText username;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) this.findViewById(R.id.username_textView);
        password = (EditText) this.findViewById(R.id.password_textView);
        logInButton = (Button) this.findViewById(R.id.logIn_Button);
        singInButton = (Button) this.findViewById(R.id.singIn_Button);

        View.OnClickListener listen = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validData()) {
                    Toast.makeText(MainActivity.this, "User data is valid", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "User data is not valid", Toast.LENGTH_SHORT).show();
                }

            }
        };

        logInButton.setOnClickListener(listen);

    }

    private boolean validData() {
        for (User user : users){
           String email = user.getEmail();
            String pass = user.getPassword();
            if(this.username.getText().toString().equals(email) && this.password.getText().toString().equals(pass)){
                return true;
            }
        }
        return false;
    }

    public void tryLogIn(View view) {
        Toast.makeText(this, "This is a log in attempt", Toast.LENGTH_SHORT).show();
    }
}
