package com.example.myapplication;
import android.util.Log;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class data extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data);

        TextView username = findViewById(R.id.username_val);
        TextView email = findViewById(R.id.email_val);
        TextView password = findViewById(R.id.password_val);
        TextView code = findViewById(R.id.code_val);
        TextView number = findViewById(R.id.number_val);

        Intent intent = getIntent();

        String username_val = intent.getStringExtra("username");
        String email_val = intent.getStringExtra("email");
        String password_val = intent.getStringExtra("password");
        String code_val = intent.getStringExtra("code");
        String number_val = intent.getStringExtra("number");



        if (intent.hasExtra("username")) {
            if (username_val.equals("")){
                username.setText("--blank--");
            }else{
                username.setText(username_val);
            }
        }else {
            username.setText("NaN");
        }


        if (intent.hasExtra("email")) {
            if (email_val.equals("")){
                email.setText("--blank--");
            }else{
                email.setText(email_val);
            }
        }else {
            email.setText("NaN");
        }


        if (intent.hasExtra("password")) {
            if (password_val.equals("")){
                password.setText("--blank--");
            }else{
                password.setText(password_val);
            }
        }else {
            password.setText("NaN");
        }



        if (intent.hasExtra("code")) {
            if (code_val.equals("")){
                code.setText("--blank--");
            }else{
                code.setText(code_val);
            }
        }else {
            code.setText("NaN");
        }


        if (intent.hasExtra("number")) {
            if (number_val.equals("")){
                number.setText("--blank--");
            }else{
                number.setText(number_val);
            }
        }else {
            number.setText("NaN");
        }



    }
}