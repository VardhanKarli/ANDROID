package com.example.myexp7;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Load Fragment1 into fragment1_container
        FirstFragment fragment1 = new FirstFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment1_container, fragment1)
                .commit();

        // Load Fragment2 into fragment2_container
        SecondFragment fragment2 = new SecondFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment2_container, fragment2)
                .commit();
    }
}
