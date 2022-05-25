package com.example.multiple_activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText msg;
    public static final String EXTRA_NAME = "com.example.multiple_activites.extra.NAME";
//    public static final String EXTRA_NAME = "com.example.multiple_activites.extra.key";    // The way to set extra
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openActivity(View view){
        Toast.makeText(this, "I am Going to Next Activity", Toast.LENGTH_SHORT).show();
//        creating an intent for MainActivity2
        Intent intent = new Intent(this,MainActivity2.class);
        msg = findViewById(R.id.editTextTextPersonName);
        String str_msg = msg.getText().toString();
//        using putExtra to send the message to MainActivity2 which will be used there by using getStringExtra
//        Here not one thing that EXTRA_NAME is something unique key we are sending whcih have value, in that value it's our message there. we have declared that above
//        Again one thing to note that message should be must be in a string format to send it, so have converted it above
        intent.putExtra(EXTRA_NAME, str_msg);
//        Starting new activity
        startActivity(intent);
    }
}