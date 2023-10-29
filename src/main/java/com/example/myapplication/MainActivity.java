package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
     private Spinner phoneNumberSp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phoneNumberSp = findViewById(R.id.phoneNumberSp);
        Button button = findViewById(R.id.RegisterButton);
        EditText username = findViewById(R.id.usernameEditText);
        EditText email = findViewById(R.id.mailEditText);
        EditText password = findViewById(R.id.passwordEditText);
        EditText phone_num = findViewById(R.id.phoneEditText);
        TextView login = findViewById(R.id.textViewGoToLogin);

        List<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add("212");
        phoneNumbers.add("213");
        phoneNumbers.add("214");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, phoneNumbers);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        phoneNumberSp.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, data.class);
                intent.putExtra("username", username.getText().toString());
                intent.putExtra("email", email.getText().toString());
                intent.putExtra("password",  password.getText().toString());
                intent.putExtra("code", phoneNumberSp.getSelectedItem().toString());
                intent.putExtra("number", phone_num.getText().toString());
                startActivity(intent);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, login.class);
                startActivity(intent);
            }
        });




    }
}