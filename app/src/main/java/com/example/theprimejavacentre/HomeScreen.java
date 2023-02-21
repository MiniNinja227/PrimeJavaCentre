package com.example.theprimejavacentre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {
    public Button TutBtn, BegBtn, AdvBtn, ExtBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        //Assigning buttons
        TutBtn = (Button) findViewById(R.id.TutLessonBtn);
        BegBtn = (Button) findViewById(R.id.BegLessonBtn);
        AdvBtn = (Button) findViewById(R.id.AdvLessonBtn);
        ExtBtn = (Button) findViewById(R.id.ExtLessonBtn);

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