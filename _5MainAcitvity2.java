package com.example.saieswar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Get the intent that started this activity and extract the string
        Intent intent = getIntent();
        String userInput = intent.getStringExtra("USER_INPUT");

        // Display the string in TextView
        TextView textView = findViewById(R.id.userInputTextView);
        textView.setText(userInput);
    }
}
