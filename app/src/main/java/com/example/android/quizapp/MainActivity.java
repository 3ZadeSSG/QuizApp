package com.example.android.quizapp;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /*
    Since Radio buttons can be selected only one out of 4 we don't need to initialized all radio buttons
    Instead of that we will only initialized the Radio Group and only radio button which corresponds to correct answer
    Clearing whole Radio Group is more efficient that clearing every single button one by one.
    All these RadioGroup, CheckBox etc. will be initialized in the onCreate method, so this way more optimized since all
    views will be initialized once.
    */
    CheckBox question1_a, question1_b, question1_c, question1_d;
    RadioGroup question2;
    RadioButton question2_answer;
    RadioGroup question3;
    RadioButton question3_answer;
    RadioGroup question4;
    RadioButton question4_answer;
    RadioGroup question5;
    RadioButton question5_answer;
    RadioGroup question6;
    RadioButton question6_answer;
    RadioGroup question7;
    RadioButton question7_answer;
    RadioGroup question8;
    RadioButton question8_answer;
    RadioGroup question9;
    RadioButton question9_answer;
    EditText question_10;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        question1_a = findViewById(R.id.check_question_1_a);
        question1_b = findViewById(R.id.check_question_1_b);
        question1_c = findViewById(R.id.check_question_1_c);
        question1_d = findViewById(R.id.check_question_1_d);
        question2 = findViewById(R.id.radiogrp_2);
        question2_answer = findViewById(R.id.radio_question_2_d);
        question3 = findViewById(R.id.radiogrp_3);
        question3_answer = findViewById(R.id.radio_question_3_d);
        question4 = findViewById(R.id.radiogrp_4);
        question4_answer = findViewById(R.id.radio_question_4_b);
        question5 = findViewById(R.id.radiogrp_5);
        question5_answer = findViewById(R.id.radio_question_5_b);
        question6 = findViewById(R.id.radiogrp_6);
        question6_answer = findViewById(R.id.radio_question_6_a);
        question7 = findViewById(R.id.radiogrp_7);
        question7_answer = findViewById(R.id.radio_question_7_b);
        question8 = findViewById(R.id.radiogrp_8);
        question8_answer = findViewById(R.id.radio_question_8_c);
        question9 = findViewById(R.id.radiogrp_9);
        question9_answer = findViewById(R.id.radio_question_9_c);
        question_10 = findViewById(R.id.question_10_text);


    }

    //Reset methods will clear all options when RESET button pressed
    public void reset(View view) {
        question1_a.setChecked(false);
        question1_b.setChecked(false);
        question1_c.setChecked(false);
        question1_d.setChecked(false);
        question2.clearCheck();
        question3.clearCheck();
        question4.clearCheck();
        question5.clearCheck();
        question6.clearCheck();
        question7.clearCheck();
        question8.clearCheck();
        question9.clearCheck();
        question_10.getText().clear();
        score = 0;
    }

    public void submit(View view) {
        if (question2_answer.isChecked()) {
            score++;
        }
        if (question3_answer.isChecked()) {
            score++;
        }
        if (question4_answer.isChecked()) {
            score++;
        }
        if (question5_answer.isChecked()) {
            score++;
        }
        if (question6_answer.isChecked()) {
            score++;
        }
        if (question7_answer.isChecked()) {
            score++;
        }
        if (question8_answer.isChecked()) {
            score++;
        }
        if (question9_answer.isChecked()) {
            score++;
        }
        if (question1_a.isChecked() && question1_b.isChecked() && question1_c.isChecked() && !question1_d.isChecked()) {
            score++;
        }
        String s = question_10.getText().toString();
        //string is compared with uppercase because user can input in amy order
        if (s.toUpperCase().equals("DECISION TREE")) {
            score++;
        }
      /*
      New intent to launch the share screen
       */
        Intent shareIntent = new Intent(MainActivity.this, ShareActivity.class);
        shareIntent.putExtra("score", score);
        startActivity(shareIntent);
    }
}
