package com.example.saieswar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText userInputEditText;
    private Button nextPageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInputEditText = findViewById(R.id.userInputEditText);
        nextPageButton = findViewById(R.id.nextPageButton);
        nextPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = userInputEditText.getText().toString();

                // Create Intent to start MainActivity2
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("USER_INPUT", userInput);
                startActivity(intent);
            }
        });
    }
}
