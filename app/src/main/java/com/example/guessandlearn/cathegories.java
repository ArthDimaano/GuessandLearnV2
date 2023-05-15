package com.example.guessandlearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cathegories extends AppCompatActivity {

    private Button english, korean, japanese, thai, back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cathegories);

        back = (Button) findViewById(R.id.button_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gobackbitch();
            }
        });

        english = (Button) findViewById(R.id.button_english);
        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEnglish();
            }
        });

        korean = (Button) findViewById(R.id.button_korean);
        korean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openKorean();
            }
        });

        japanese = (Button) findViewById(R.id.button_japanese);
        japanese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openJapanese();
            }
        });

        thai = (Button) findViewById(R.id.button_thai);
        thai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openThai();
            }
        });

    }

    private void gobackbitch() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void openThai() {
        Intent intent = new Intent(this, Thai.class);
        startActivity(intent);
    }

    private void openJapanese() {
        Intent intent = new Intent(this, Japanese.class);
        startActivity(intent);
    }

    private void openKorean() {
        Intent intent = new Intent(this, Korean.class);
        startActivity(intent);
    }

    private void openEnglish() {
        Intent intent = new Intent(this, English.class);
        startActivity(intent);
    }
}