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

        btn = (ImageButton) findViewById(R.id.mobo);
        final MediaPlayer mobo = MediaPlayer.create(this, R.raw.motherboard_normal);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mobo.start();
            }
        });

    }
}