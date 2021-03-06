package com.example.ecocity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnLogin, btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);
        btnSignUp = findViewById(R.id.btnSignUp);
        btnSignUp.setOnClickListener(this);

        btnLogin.setText("Login");
        btnSignUp.setText("Sign Up");
    }

    @Override
    public void onClick(View view) {
        if(view.equals(btnLogin)){
            // redirect to news activity
            Intent intent = new Intent(LoginActivity.this, NewsActivity.class);
            startActivity(intent);
        }
    }
}