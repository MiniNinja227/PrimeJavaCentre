package com.example.theprimejavacentre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.theprimejavacentre.ui.login.LoginActivity;
import com.example.theprimejavacentre.ui.login.RegisterActivity;

public class MainActivity extends AppCompatActivity {
    public Button RegisterBtn, LoginBtn, HomeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assigning Buttons
        LoginBtn = (Button) findViewById(R.id.Login);
        RegisterBtn = (Button) findViewById(R.id.Register);
        HomeBtn = (Button) findViewById(R.id.Home);

        //Login Action
        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent LoginIntent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(LoginIntent);
            }
        });

        //Register Action
        RegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent RegisterIntent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(RegisterIntent);
            }
        });

        //Home Action
        HomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent HomeIntent = new Intent(MainActivity.this, HomeScreen.class);
                startActivity(HomeIntent);
            }
        });
    }
}