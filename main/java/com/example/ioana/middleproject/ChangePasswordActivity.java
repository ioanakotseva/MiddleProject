package com.example.ioana.middleproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ChangePasswordActivity extends AppCompatActivity {

    private Button changePassword;
    private EditText oldPassword;
    private EditText newPassword;
    private EditText confirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        changePassword = (Button) this.findViewById(R.id.changePassButton);
        oldPassword = (EditText) this.findViewById(R.id.old_password);
        newPassword = (EditText) this.findViewById(R.id.new_password);
        confirmPassword = (EditText) this.findViewById(R.id.confirmed_password);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((newPassword.getText().toString()).matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")) {
                    if(newPassword.getText().toString().equals(confirmPassword.getText().toString())) {
                        Intent intent = new Intent(ChangePasswordActivity.this, MainActivity.class);

                        ChangePasswordActivity.this.startActivity(intent);
                        Toast.makeText(ChangePasswordActivity.this, "Successful change password", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                    else{
                        newPassword.setError("Your passwords are not equal");
                        newPassword.requestFocus();
                    }
                }
                else{
                    newPassword.setError("You password must have a digit, lower, upper case letter and symbol.");
                    newPassword.requestFocus();
                }
            }
        };
        changePassword.setOnClickListener(listener);
    }


   /* static boolean isStrongPassword(String password){
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
    } */
}
