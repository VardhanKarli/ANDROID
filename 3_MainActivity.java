package com.example.greetingapp;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private  EditText editText;
    private  Button button;
    private  TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialization for UI
        initializeUI();

        //textview configuration
        configureTextview();

        //setupButtonClickListener
        button.setOnClickListener(v -> handleSubmit());
    }
        //modular initialization for UI
        private  void initializeUI() {

            editText = findViewById(R.id.editText);
            button = findViewById(R.id.button);
            textView = findViewById(R.id.textView);
        }
        //configure textview appearance
        private void configureTextview() {
            textView.setTextColor(ContextCompat.getColor(this, R.color.primarycolor));
            textView.setTextSize(18);
            textView.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD);
            textView.setPadding(30, 20, 30, 20);
            textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        }

        private  void handleSubmit() {
            String name = editText.getText().toString().trim();
            // Validate the form input
            if (validateForm(name)) {
                textView.setText("Hello" +" "+ name + "!");
            } else {
                textView.setText("please Enter your name");
            }
        }
        //validate form input
            private boolean validateForm(String name) {
                return !name.isEmpty();
            }
    }