package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView2);
        editText = findViewById(R.id.editText);

/*
        This is Easy to use onClickListener here but for we are trying to use Alternative that's why i have commented this
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Hello, Click setOnClickListener Worked", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                int kg = Integer.parseInt(s);
//                Toast.makeText(MainActivity.this, "KG got" + kg, Toast.LENGTH_SHORT).show();
                double pound = 2.205 * kg;
                textView.setText("Ans: " + pound + " pound");
            }
        });
*/

    }

//    This is the alternative method of onClickLisener For that we need to go to the button and search for onClick, there you need to call this method on that button click
    public void calculate(View view){
        String s = editText.getText().toString();
        int kg = Integer.parseInt(s);
        double pound = 2.205 * kg;
        textView.setText("Ans: " + pound + " pound");

    }
}