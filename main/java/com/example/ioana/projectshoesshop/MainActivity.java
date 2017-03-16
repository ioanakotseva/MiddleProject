package com.example.ioana.projectshoesshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ioana.projectshoesshop.model.Shop;
import com.example.ioana.projectshoesshop.model.User;

import java.lang.String;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button logInButton;
    private TextView singUpButton;
    private EditText email ;
    private EditText password;
    public static ArrayList<User> registeredUsers = new ArrayList<>();
    public Shop shop = Shop.getInstace("Shoes Shop");

    static {
        User ivan = new User("ivanivanov@abv.bg", "Ivan123");
        registeredUsers.add(ivan);
        User georgi = new User("georgi_georgiev@gmail.com", "Gogo123");
        registeredUsers.add(georgi);
        User dimitur = new User("dimitur_dimitrov@gmail.com", "Dimo123");
        registeredUsers.add(dimitur);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText) this.findViewById(R.id.email_editText);
        password = (EditText) this.findViewById(R.id.password_editText);
        logInButton = (Button) this.findViewById(R.id.logIn_Button);
        singUpButton = (TextView) this.findViewById(R.id.signUp_Button);

        logInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validData()){
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                    MainActivity.this.startActivity(intent);
                    finish();
                }
                else{
                    Toast.makeText(MainActivity.this, "User data is not valid", Toast.LENGTH_SHORT).show();
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

    private boolean validData() {
        boolean flag = false;
        if(registeredUsers.size() > 0) {
            for (User user : registeredUsers) {
                String currentEmail = user.getEmail();
                String currentPassword = user.getPassword();
                if (this.email.getText().toString().equals(currentEmail) && this.password.getText().toString().equals(currentPassword)) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }
}
