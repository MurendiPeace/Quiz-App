package com.example.android.quizapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.quizapp.R;

public class MainActivity extends AppCompatActivity {


    EditText username;
    EditText question3;
    EditText question5;

    String name;
    String answer3;
    String answer5;

    RadioButton continentRadioBtn;
    RadioButton colorsRadioBtn;
    RadioButton billGatesRadioBtn;

    RadioGroup continentRadioGroup;
    RadioGroup billgatesRadioGroup;
    RadioGroup colorsRadioGroup;

    CheckBox whiteColor;
    CheckBox greenColor;
    CheckBox redColor;
    CheckBox pinkColor;
    CheckBox grayColor;

    TextView answer_1;
    TextView answer_2;
    TextView answer_3;
    TextView answer_4;
    TextView answer_5;
    TextView answer_6;

    Button submit;

    int points = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        continentRadioBtn = (RadioButton) findViewById(R.id.button4);
        colorsRadioBtn = (RadioButton) findViewById(R.id.button9);
        billGatesRadioBtn = (RadioButton) findViewById(R.id.button11);

        colorsRadioGroup = (RadioGroup) findViewById(R.id.colorsGroup);
        continentRadioGroup = (RadioGroup) findViewById(R.id.continentGroup);
        billgatesRadioGroup = (RadioGroup) findViewById(R.id.billGatesGroup);

        whiteColor = (CheckBox) findViewById(R.id.checkbox1);
        greenColor = (CheckBox) findViewById(R.id.checkbox2);
        redColor = (CheckBox) findViewById(R.id.checkbox4);
        pinkColor = (CheckBox) findViewById(R.id.checkbox3);
        grayColor = (CheckBox) findViewById(R.id.checkbox5);

        answer_1 = (TextView) findViewById(R.id.answer_1);
        answer_2 = (TextView) findViewById(R.id.answer_2);
        answer_3 = (TextView) findViewById(R.id.answer_3);
        answer_4 = (TextView) findViewById(R.id.answer_4);
        answer_5 = (TextView) findViewById(R.id.answer_5);
        answer_6 = (TextView) findViewById(R.id.answer_6);

        submit = (Button) findViewById(R.id.submit_answer);

    }


    public void submitAnswers(View v) {


        question3 = (EditText) findViewById(R.id.question3);
        answer3 = question3.getText().toString();

        if (answer3.equals("Cyril Ramaphosa") || answer3.equals("Mr Cyril Ramaphosa")) {

            points = points + 1;


        }

        question5 = (EditText) findViewById(R.id.question5);
        answer5 = question5.getText().toString();

        if (answer5.equals("Pretoria") || answer5.equals("Cape Town") || answer5.equals("Bloemfontein")) {

            points = points + 1;
        }

        if (continentRadioBtn.isChecked()) {

            points = points + 1;

        }

        if (colorsRadioBtn.isChecked()) {

            points = points + 1;

        }

        if (billGatesRadioBtn.isChecked()) {

            points = points + 1;

        }

        if (whiteColor.isChecked() && greenColor.isChecked() && redColor.isChecked() && !grayColor.isChecked() && !pinkColor.isChecked()) {

            points = points + 1;

        }


        if (TextUtils.isEmpty(question3.getText())) {

            question3.setError("Answer is required!");

        }

        if (TextUtils.isEmpty(question5.getText())) {

            question5.setError("Answer is required!");

        }


        username = (EditText) findViewById(R.id.name_textField);
        name = username.getText().toString();

        if (TextUtils.isEmpty(username.getText())) {

            username.setError("Enter name");

        }

        if (continentRadioGroup.getCheckedRadioButtonId() == -1) {

            Toast.makeText(this, "Select one answer on question 1", Toast.LENGTH_SHORT).show();
        }

        if (colorsRadioGroup.getCheckedRadioButtonId() == -1) {

            Toast.makeText(this, "Select one answer on question 4", Toast.LENGTH_SHORT).show();
        }

        if (billgatesRadioGroup.getCheckedRadioButtonId() == -1) {

            Toast.makeText(this, "Select one answer on question 6", Toast.LENGTH_SHORT).show();

        }
        if (!whiteColor.isChecked() && !greenColor.isChecked() && !redColor.isChecked() && !grayColor.isChecked() && !pinkColor.isChecked()) {

            Toast.makeText(this, "Select correct answers on question 2", Toast.LENGTH_SHORT).show();

        }

         else{

            Toast.makeText(MainActivity.this, name + ", You got " + points + " answers correct out of 6 questions", Toast.LENGTH_LONG).show();
            points = 0;
            Intent memo = new Intent(this, Memo.class);
            startActivity(memo);
        }
    }

}





