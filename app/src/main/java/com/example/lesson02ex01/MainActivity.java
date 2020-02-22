package com.example.lesson02ex01;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int i;
    Button btn;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        iv = findViewById(R.id.imageScreen);
        i = 0;
    }

    public void randomNum(View view) {
        i = (int) (Math.random()*3)+1;
        btn.setText(" "+i);

        switch (i) {
            case 1: {
                iv.setImageResource(R.drawable.img11);
            }
            break;

            case 2: {
                iv.setImageResource(R.drawable.img12);
            }
            break;

            case 3: {
                iv.setImageResource(R.drawable.img13);
            }
            break;
            default: {
            }

        }
        }
    }

