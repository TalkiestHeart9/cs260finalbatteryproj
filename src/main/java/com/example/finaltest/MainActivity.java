package com.example.finaltest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView iv;
    Button plusButton, minusButton;
    int tmp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {

        iv = findViewById(R.id.imageView);

        plusButton = findViewById(R.id.button);
        plusButton.setOnClickListener( this );

        minusButton = findViewById(R.id.button2);
        minusButton.setOnClickListener( this );

        tmp = 7;
    }

    @Override
    public void onClick(View v) {

        if( v.getId() == R.id.button2 ) {

            if (tmp == 0) {
                tmp = 1;
                iv.setImageResource(R.drawable.ic_battery_20_black_24dp);
            }
            else if (tmp == 1) {
                tmp = 2;
                iv.setImageResource(R.drawable.ic_battery_30_black_24dp);
            }
            else if (tmp == 2) {
                tmp = 3 ;
                iv.setImageResource(R.drawable.ic_battery_50_black_24dp);
            }
            else if (tmp == 3) {
                tmp = 4;
                iv.setImageResource(R.drawable.ic_battery_60_black_24dp);
            }
            else if (tmp == 4) {
                tmp = 5;
                iv.setImageResource(R.drawable.ic_battery_80_black_24dp);
            }
            else if (tmp == 5) {
                tmp = 6;
                iv.setImageResource(R.drawable.ic_battery_90_black_24dp);
            }
            else {
                tmp = 7;
                iv.setImageResource(R.drawable.ic_battery_full_black_24dp);
            }
        }

        else {
            if (tmp == 7) {
                tmp = 6;
                iv.setImageResource(R.drawable.ic_battery_90_black_24dp);
            }
            else if (tmp == 6) {
                tmp = 5;
                iv.setImageResource(R.drawable.ic_battery_80_black_24dp);
            }
            else if (tmp == 5) {
                tmp = 4;
                iv.setImageResource(R.drawable.ic_battery_60_black_24dp);
            }
            else if (tmp == 4) {
                tmp = 3;
                iv.setImageResource(R.drawable.ic_battery_50_black_24dp);
            }
            else if (tmp == 3) {
                tmp = 2;
                iv.setImageResource(R.drawable.ic_battery_30_black_24dp);
            }
            else if (tmp == 2) {
                tmp = 1;
                iv.setImageResource(R.drawable.ic_battery_20_black_24dp);
            }
            else {
                tmp = 0;
                iv.setImageResource(R.drawable.ic_battery_alert_black_24dp);
            }
        }

    }
}