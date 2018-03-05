package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {
    TextView result;
    Button share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        result = findViewById(R.id.share_text);
        share = findViewById(R.id.shareButton);
        final int score = getIntent().getExtras().getInt("score");
        result.setText("Your score is: " + score);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "I scored " + score + " in a Quiz App, check it out from PlayStore");
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
            }
        });
    }
}
