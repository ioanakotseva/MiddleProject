package com.example.ioana.projectshoesshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class ChangePasswordActivity extends AppCompatActivity {

    private Button changePassword;
    private String oldPassword;
    private String newPassword;
    private String confirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changepassword);

        changePassword = (Button) this.findViewById(R.id.changePassButton);
        oldPassword = this.findViewById(R.id.old_password).toString();
        newPassword = this.findViewById(R.id.new_password).toString();
        confirmPassword = this.findViewById(R.id.confirmed_password).toString();

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isStrongPassword(newPassword)) {
                    if(newPassword.equals(confirmPassword)) {
                        Intent intent = new Intent(ChangePasswordActivity.this, MainActivity.class);
                        ChangePasswordActivity.this.startActivity(intent);
                        finish();
                    }
                    else{
                        Toast.makeText(ChangePasswordActivity.this, R.string.match_passwords, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(ChangePasswordActivity.this, R.string.strong_password_expectations, Toast.LENGTH_SHORT).show();
                }
            }
        };
        changePassword.setOnClickListener(listener);
    }


    static boolean isStrongPassword(String password){
        // A strong password has at least 5 symbols( small letters, capital letters and digits).
        boolean hasSmallLetter = false;
        boolean hasCapitalLetter = false;
        boolean hasDigit = false;

        if(password.length() < 5){
            return false;
        }

        for(char c : password.toCharArray()){
            if(c >= 'a' && c <= 'z'){
                hasSmallLetter = true;
            }
            if(c >= 'A' && c <= 'Z'){
                hasCapitalLetter = true;
            }
            if(c >= '1' && c <= '9'){
                hasDigit = true;
            }
            if(hasSmallLetter && hasCapitalLetter && hasDigit){
                return true;
            }
        }
        return false;
    }
}
