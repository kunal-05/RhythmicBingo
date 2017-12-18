package com.example.kmand.rhythmicbingo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen_2 extends AppCompatActivity {

    private Button btn5,btn6,btn8,btn9,btn2,btn,btn3,btn10,btn11,btn12,btn13,btn14,btn15,btn17;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_2);
        btn5=(Button)findViewById(R.id.button5);
        btn6=(Button)findViewById(R.id.button6);
        btn3=(Button)findViewById(R.id.button3);
        btn2=(Button)findViewById(R.id.button2);
        btn=(Button)findViewById(R.id.button);
        btn8=(Button)findViewById(R.id.button8);
        btn9=(Button)findViewById(R.id.button9);
        btn10=(Button)findViewById(R.id.button10);
        btn11=(Button)findViewById(R.id.button11);
        btn12=(Button)findViewById(R.id.button12);
        btn13=(Button)findViewById(R.id.button13);
        btn14=(Button)findViewById(R.id.button14);
        btn15=(Button)findViewById(R.id.button15);
        btn17=(Button)findViewById(R.id.button17);




        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn5.setBackgroundColor(Color.RED);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn3.setBackgroundColor(Color.RED);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2.setBackgroundColor(Color.RED);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn.setBackgroundColor(Color.RED);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn6.setBackgroundColor(Color.RED);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn8.setBackgroundColor(Color.RED);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn9.setBackgroundColor(Color.RED);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn10.setBackgroundColor(Color.RED);
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn11.setBackgroundColor(Color.RED);
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn12.setBackgroundColor(Color.RED);
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn13.setBackgroundColor(Color.RED);
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn14.setBackgroundColor(Color.RED);
            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn15.setBackgroundColor(Color.RED);
            }
        });
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn17.setBackgroundColor(Color.RED);
            }
        });

    }

}



