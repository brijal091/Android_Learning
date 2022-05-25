package com.example.multiple_activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        msg = findViewById(R.id.textView);
//        getting intent from the MainActivity
        Intent intent = getIntent();
        String user_msg = intent.getStringExtra(MainActivity.EXTRA_NAME);
        msg.setText("Your message is: " + user_msg);
    }
}