package com.example.pavelkulkov.calculator;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    public final static String KEY = "com.example.pavelkulkov.calculator";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addition(View view){

        Intent intent = new Intent (this,AnswerActivity.class);

        EditText firstNumber = (EditText)findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText)findViewById(R.id.secondNumber);
        int tmp = 0;
        String answer="";
        try{
             tmp = Integer.parseInt(firstNumber.getText().toString())
                    + Integer.parseInt(secondNumber.getText().toString());
            if(Integer.parseInt(secondNumber.getText().toString()) < 0 ){
                answer = firstNumber.getText().toString() + "+ (" + secondNumber.getText().toString()+") ="+tmp;
            }else {
                answer = firstNumber.getText().toString() + "+" + secondNumber.getText().toString() + "=" + tmp;
            }
        }catch (Exception ex){
            answer = "Неверные данные";
        }
        intent.putExtra(KEY, answer);
        startActivity(intent);
    }
}
