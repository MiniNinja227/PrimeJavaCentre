package com.example.theprimejavacentre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.theprimejavacentre.ui.login.LoginActivity;

public class HomeScreen extends AppCompatActivity {
    public Button TutBtn, BegBtn, AdvBtn, ExtBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        //Assigning buttons
        TutBtn = (Button) findViewById(R.id.TutorialBtn);

        //Tutorial Lesson Action
        TutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent TutIntent = new Intent(HomeScreen.this, TutorialLessonHome.class);
                startActivity(TutIntent);
            }
        });

    }


}