package com.example.ioana.middleproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ioana.middleproject.model.Shop;
import com.example.ioana.middleproject.model.User;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button logInButton;
    private TextView singUpButton;
    private EditText username ;
    private EditText password;
    public static ArrayList<User> registeredUsers = new ArrayList<>();
    public Shop shop = Shop.getInstace("Shoes Shop");

    static {
        User ivan = new User("ivanivanov", "Ivan123");
        registeredUsers.add(ivan);
        User georgi = new User("georgi_georgiev", "Gogo123");
        registeredUsers.add(georgi);
        User dimitur = new User("dimitur_dimitrov", "Dimo123");
        registeredUsers.add(dimitur);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) this.findViewById(R.id.email_editText);
        password = (EditText) this.findViewById(R.id.password_editText);
        logInButton = (Button) this.findViewById(R.id.logIn_Button);
        singUpButton = (TextView) this.findViewById(R.id.signUp_Button);

        logInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validData(username.getText().toString(), password.getText().toString())){
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                    MainActivity.this.startActivity(intent);
                    Toast.makeText(MainActivity.this, "Successful Login", Toast.LENGTH_SHORT).show();
                    finish();
                }
                else{
                    Toast.makeText(MainActivity.this, "User data is not valid", Toast.LENGTH_SHORT).show();
                    username.requestFocus();
                }
            }
        });

        singUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegistrationActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });

    }

    private boolean validData(String username, String password) {
        boolean flag = false;
        if(registeredUsers.size() > 0) {
            for (User user : registeredUsers) {
                if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }
}
