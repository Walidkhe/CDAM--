package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);


        EditText email = findViewById(R.id.mailEditText);
        EditText password = findViewById(R.id.passwordEditText);
        Button button = findViewById(R.id.LoginButton);
        TextView go_register = findViewById(R.id.textViewGoToRegister);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this, data.class);
                intent.putExtra("email", email.getText().toString());
                intent.putExtra("password",  password.getText().toString());
                startActivity(intent);
            }
        });

        go_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
