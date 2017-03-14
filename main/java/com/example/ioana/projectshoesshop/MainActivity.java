package com.example.ioana.projectshoesshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.String;

public class MainActivity extends AppCompatActivity {

    private Button logInButton;
    private TextView singUpButton;
    private EditText username ;
    private EditText password;
    Shop shop = Shop.getInstace("Shoes Shop");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) this.findViewById(R.id.username_textView);
        password = (EditText) this.findViewById(R.id.password_textView);
        logInButton = (Button) this.findViewById(R.id.logIn_Button);
        singUpButton = (TextView) this.findViewById(R.id.signUp_Button);

        View.OnClickListener listen = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validData()) {
                    Toast.makeText(MainActivity.this, "User data is valid", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                    MainActivity.this.startActivity(intent);
                    finish();
                }
                else{
                    Toast.makeText(MainActivity.this, "User data is not valid", Toast.LENGTH_SHORT).show();
                }

            }
        };
        logInButton.setOnClickListener(listen);

        singUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegistrationActivity.class);
                MainActivity.this.startActivity(intent);
                finish();
            }
        });

        username.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus)
                    username.setHint("");
                else
                    username.setHint("Username");
            }
        });

        password.setOnFocusChangeListener(new View.OnFocusChangeListener(){
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus)
                    password.setHint("");
                else
                    password.setHint("Password");
            }
        });
    }

    private boolean validData() {
        return true;

//        if(shop.getUsers().size()>0) {
//            for (User user : shop.getUsers()) {
//                String email = user.getEmail();
//                String pass = user.getPassword();
//                if (this.username.getText().toString().equals(email) && this.password.getText().toString().equals(pass)) {
//                    return true;
//                }
//            }
//            return false;
//        }
//        Toast.makeText(MainActivity.this, "No users", Toast.LENGTH_SHORT).show();
//        return false;
    }


}
