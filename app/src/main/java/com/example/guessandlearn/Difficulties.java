package com.example.guessandlearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Difficulties extends AppCompatActivity {

    private Button easy, normal, hard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulties);

        easy = (Button) findViewById(R.id.easy);
        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEasy();
            }
        });

        normal = (Button) findViewById(R.id.normal);
        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNormal();
            }
        });

        hard = (Button) findViewById(R.id.hard);
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
        Intent intent = new Intent(this, normal.class);
        startActivity(intent);
    }

    private void openEasy() {
        Intent intent = new Intent(this, Easy.class);
        startActivity(intent);
    }
}