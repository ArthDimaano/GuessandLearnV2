package com.example.guessandlearn;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class pronouns extends AppCompatActivity {

    private ImageButton btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronouns);

        btn = (ImageButton) findViewById(R.id.java);
        final MediaPlayer java = MediaPlayer.create(this, R.raw.java_easy);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                java.start();
            }
        });

        btn = (ImageButton) findViewById(R.id.printer);
        final MediaPlayer printer = MediaPlayer.create(this, R.raw.printer_easy);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                printer.start();
            }
        });

        btn = (ImageButton) findViewById(R.id.virus);
        final MediaPlayer virus = MediaPlayer.create(this, R.raw.virus_easy);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                virus.start();
            }
        });

        btn = (ImageButton) findViewById(R.id.mouse);
        final MediaPlayer mouse = MediaPlayer.create(this, R.raw.mouse_easy);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mouse.start();
            }
        });

        btn = (ImageButton) findViewById(R.id.block);
        final MediaPlayer block = MediaPlayer.create(this, R.raw.block_easy);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                block.start();
            }
        });

        btn = (ImageButton) findViewById(R.id.variable);
        final MediaPlayer variable = MediaPlayer.create(this, R.raw.variable_easy);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                variable.start();
            }
        });

    }
}