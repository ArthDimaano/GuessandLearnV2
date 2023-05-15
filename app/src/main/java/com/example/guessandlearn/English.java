package com.example.guessandlearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class English extends AppCompatActivity {

    private Button normal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);

        normal = (Button) findViewById(R.id.english_normal);
        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                normalEnglish();
            }
        });
    }

    private void normalEnglish() {
        Intent intent = new Intent(this, English_normal.class);
        startActivity(intent);
    }
}