package com.example.pavel.srafficlight;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import static com.example.pavel.srafficlight.R.color.red;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void changeBackgroundToRed(View view){
        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.BG);
        linearLayout.setBackgroundColor(this.getResources().getColor(R.color.red));
    }
    public void changeBackgroundToYellow(View view){
        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.BG);
        linearLayout.setBackgroundColor(this.getResources().getColor(R.color.yellow));
    }
    public void changeBackgroundToGreen(View view){
        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.BG);
        linearLayout.setBackgroundColor(this.getResources().getColor(R.color.green));
    }
}
