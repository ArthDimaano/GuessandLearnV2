package com.example.guessandlearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Difficulties extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulties);

        Button easy = (Button) findViewById(R.id.easy);
        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEasy();
            }
        });

        Button normal = (Button) findViewById(R.id.normal);
        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNormal();
            }
        });

        Button hard = (Button) findViewById(R.id.hard);
        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHard();
            }
        });

    }

    private void openHard() {
        Intent intent = new Intent(this, hard.class);
        startActivity(intent);
    }

    private void openNormal() {
        Intent intent = new Intent(this, Normal.class);
        startActivity(intent);
    }

    private void openEasy() {
        Intent intent = new Intent(this, Easy.class);
        startActivity(intent);
    }
}