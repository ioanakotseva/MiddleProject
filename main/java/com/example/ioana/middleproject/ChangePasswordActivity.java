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
    private Button cancel;
    private EditText oldPassword;
    private EditText newPassword;
    private EditText confirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);
        getSupportActionBar().hide();

        changePassword = (Button) this.findViewById(R.id.change_password_button);
        oldPassword = (EditText) this.findViewById(R.id.old_password);
        newPassword = (EditText) this.findViewById(R.id.new_password);
        confirmPassword = (EditText) this.findViewById(R.id.confirmed_password);
        cancel = (Button) findViewById(R.id.cancel_change_password_button);

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

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChangePasswordActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });
    }

}
