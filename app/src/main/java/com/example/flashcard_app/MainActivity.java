package com.example.flashcard_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView question = findViewById(R.id.flashcard_question);
        TextView answer = findViewById(R.id.flashcard_answer);
        TextView choice1 = findViewById(R.id.choice1);
        TextView choice2 = findViewById(R.id.choice2);
        TextView choice3 = findViewById(R.id.choice3);

        question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question.setVisibility(View.INVISIBLE);
                answer.setVisibility(View.VISIBLE);
            }
        });

        answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setVisibility(View.INVISIBLE);
                question.setVisibility(View.VISIBLE);
            }
        });

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice1.setBackgroundColor(getResources().getColor(R.color.my_red_color,null));
                choice3.setBackgroundColor(getResources().getColor(R.color.my_green_color,null));
            }
        });

        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice2.setBackgroundColor(getResources().getColor(R.color.my_red_color,null));
                choice3.setBackgroundColor(getResources().getColor(R.color.my_green_color,null));
            }
        });

        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice3.setBackgroundColor(getResources().getColor(R.color.my_green_color,null));
            }
        });
    }
}