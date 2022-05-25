package com.example.saygoodmorning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text, text1;
    EditText editText1, editText2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);
        text.setText("Good Morning");
//        Toast.makeText(this, "Good Morning", Toast.LENGTH_SHORT).show();

//        method 3 by oncreate Listener type method
        button = findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              editText1 = findViewById(R.id.editTextNumber3);
              editText2 = findViewById(R.id.editTextNumber4);
              int sum = Integer.parseInt(editText1.getText().toString()) + Integer.parseInt(editText2.getText().toString());
              text1 = findViewById(R.id.editTextTextPersonName6);
              text1.setText("Your Ans is: " + sum);
            }
        });
    }

//    To use thid method go to button and add "add" on onClick attribute of the button
//    public void add(View view){
////        This is my mehtod 1
////        editText1 = findViewById(R.id.editTextNumber3);
////        Editable num1 = editText1.getText();
////        int i = Integer.parseInt(String.valueOf(num1));
////        editText2 = findViewById(R.id.editTextNumber4);
////        Editable num2 = editText2.getText();
////        int y = Integer.parseInt(String.valueOf(num2));
////        text1 = findViewById(R.id.editTextTextPersonName6);
////        int z = i+y;
////        text1.setText("Ans is: " + z);
////        Toast.makeText(this, "Your Answer is :" + z, Toast.LENGTH_SHORT).show();
//
//
////        This is my mehtod 2
//        editText1 = findViewById(R.id.editTextNumber3);
//        editText2 = findViewById(R.id.editTextNumber4);
//        text1 = findViewById(R.id.editTextTextPersonName6);
//        int sum = Integer.parseInt(editText1.getText().toString()) + Integer.parseInt(editText2.getText().toString());
////        Toast.makeText(this, "sum" + sum, Toast.LENGTH_SHORT).show();
////        Toast.makeText(this, "text1 is: " + text1.getText(), Toast.LENGTH_SHORT).show();
//        text1.setText("Your ans is: " + sum);
//
//    }
}