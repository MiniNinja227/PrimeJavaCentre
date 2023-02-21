package com.example.theprimejavacentre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class TutorialLessonHome extends AppCompatActivity {
    public Button ReturnToHomeBtn, Section1Btn, ConcBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial_lesson_home);

        //Assigning buttons
        ReturnToHomeBtn = (Button) findViewById(R.id.ReturnToHome);
        Section1Btn = (Button) findViewById(R.id.TutSection1Btn);
        ConcBtn = (Button) findViewById(R.id.TutConcBtn);

        //Return To Home Button Action


        //Section 1 Button Action


        //Conclusion Button Action

    }
}