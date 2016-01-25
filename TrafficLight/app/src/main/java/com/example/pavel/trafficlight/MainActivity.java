package com.example.pavel.trafficlight;

import android.content.Context;
import android.graphics.Color;
import android.os.PersistableBundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.pavel.srafficlight.R;

import static com.example.pavel.srafficlight.R.color.red;

public class MainActivity extends AppCompatActivity {
    public final static String BG_COLOR = "com.example.pavelkulkov.trafficlight";
    private int color;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState != null){
            color = savedInstanceState.getInt(BG_COLOR);
            setBackGround();
        }
    }
    public void changeBackgroundToRed(View view){
        color = R.color.red;
        setBackGround();
    }
    public void changeBackgroundToYellow(View view){
        color = R.color.yellow;
        setBackGround();
    }
    public void changeBackgroundToGreen(View view){
        color = R.color.green;
        setBackGround();
    }
    public void setBackGround(){
        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.BG);
        Context context = getApplicationContext();
        linearLayout.setBackgroundColor(ContextCompat.getColor(context, color));
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt(BG_COLOR, color);
        super.onSaveInstanceState(savedInstanceState);
    }
}
