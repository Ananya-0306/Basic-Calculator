package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etFirstvalue, etSecondvalue;
    TextView tvAnswr;
    Button add, subtract, Multiply, Divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstvalue = findViewById(R.id.etFirstvalue);
        etSecondvalue = findViewById(R.id.etSecondvalue);

        tvAnswr = findViewById(R.id.tvAnswr);

        add = findViewById(R.id.btnAdd);
        subtract = findViewById(R.id.btnMinus);
        Multiply = findViewById(R.id.btnMultiply);
        Divide = findViewById(R.id.btnDiv);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int firstvalue , secondvvalue , ans;
                firstvalue = Integer.parseInt(etFirstvalue.getText().toString());
                secondvvalue = Integer.parseInt(etSecondvalue.getText().toString());

                ans = firstvalue + secondvvalue;

                tvAnswr.setText("Ans is = "+ans);
            }
        });


        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int firstvalue , secondvvalue , ans;
                firstvalue = Integer.parseInt(etFirstvalue.getText().toString());
                secondvvalue = Integer.parseInt(etSecondvalue.getText().toString());

                ans = firstvalue - secondvvalue;

                tvAnswr.setText("Ans is = "+ans);
            }
        });


        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int firstvalue , secondvvalue , ans;
                firstvalue = Integer.parseInt(etFirstvalue.getText().toString());
                secondvvalue = Integer.parseInt(etSecondvalue.getText().toString());

                ans = firstvalue * secondvvalue;

                tvAnswr.setText("Ans is = "+ans);
            }
        });


        Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int firstvalue , secondvvalue , ans;
                firstvalue = Integer.parseInt(etFirstvalue.getText().toString());
                secondvvalue = Integer.parseInt(etSecondvalue.getText().toString());

                ans = firstvalue / secondvvalue;

                tvAnswr.setText("Ans is = "+ans);
            }
        });
    }
}
