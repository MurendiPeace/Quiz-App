package com.example.android.quizapp;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Memo extends AppCompatActivity {


    TextView answer_one;
    TextView answer_two;
    TextView answer_three;
    TextView answer_four;
    TextView answer_five;
    TextView answer_six;

    Button send;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo);

        answer_one = (TextView) findViewById(R.id.one);
        answer_two = (TextView) findViewById(R.id.two);
        answer_three = (TextView) findViewById(R.id.three);
        answer_four = (TextView) findViewById(R.id.four);
        answer_five = (TextView) findViewById(R.id.five);
        answer_six = (TextView) findViewById(R.id.six);

        send = (Button) findViewById(R.id.submit_answer);


    }

    public void getMemo(View view) {

        ImageView flagimage = (ImageView) findViewById(R.id.flag);
        flagimage.setImageResource(R.drawable.theflag);

        answer_one.setText("Answer 1: South Africa is located in the continent of Africa");
        answer_two.setText("Answer 2: Colors present in the South African National flag are, Red, Green, White, Black, Orange and Blue");
        answer_three.setText("Answer 3: The president of South Africa is Mr. Cyril Ramaphosa");
        answer_four.setText("Answer 4: South African National flag has 6 colors in total");
        answer_five.setText("Answer 5: South Africa has 3 capital cities i.e Pretoria, Cape Town and Bloemfontein");
        answer_six.setText("Answer 6: Bill Gates was not born in South Africa");


    }

    public void submitQuiz(View view) {


        Intent sendEmail = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "murendinemakundani4@gmail.com", null));
        sendEmail.putExtra(Intent.EXTRA_SUBJECT, "Quiz about South Africa");
        sendEmail.putExtra(Intent.EXTRA_TEXT, "Quiz submitted");

        try {
            startActivity(Intent.createChooser(sendEmail, "Send email"));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(Memo.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
        sendEmail.setType("message/rfc822");


    }

}


