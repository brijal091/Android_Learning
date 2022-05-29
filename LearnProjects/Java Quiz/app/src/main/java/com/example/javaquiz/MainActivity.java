package com.example.javaquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button yes, no;
    TextView question;
    int score = 0, index = 0;
    String[] questions = {"java is programming language", "java is developed in 190000","java's father is Harsh"};
    boolean[] answers = {true, false, false};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        question = findViewById(R.id.question);
        question.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( index <= (questions.length - 1)) {
                    if (answers[index]){
                        score++;
                    }
                    index++;
                    if ( index <= (questions.length - 1)) {
                        question.setText(questions[index]);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "your Score is: " + score, Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(MainActivity.this, "Your Quiz is over, Restart the app to Play again", Toast.LENGTH_SHORT).show();
                }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( index <= (questions.length - 1)) {
                    if (!answers[index]){
                        score++;
                    }
                    index++;
                    if ( index <= (questions.length - 1)) {
                        question.setText(questions[index]);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "your Score is: " + score, Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(MainActivity.this, "Your Quiz is over, Restart the app to Play again", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}