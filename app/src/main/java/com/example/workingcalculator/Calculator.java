package com.example.workingcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        EditText ed1,ed2,ed3;
        TextView v1;
        Button btn;
        btn = (Button) findViewById(R.id.cal1);
        ed1 = (EditText) findViewById(R.id.editTextNumber1);
        ed2 = (EditText) findViewById(R.id.editTextNumber2);
        ed3 = (EditText) findViewById(R.id.operator);
        v1 = (TextView) findViewById(R.id.textView);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(ed1.getText().toString());
                int n2 = Integer.parseInt(ed2.getText().toString());
                String op = ed3.getText().toString();

                switch (op){
                    case "+":
                    {
                        int res = n1+n2;
                        v1.setText("The Sum is :" + res);
                    }
                    break;
                    case "-":
                    {
                        int res = n1-n2;
                        v1.setText("The Sub is :" + res);
                    }
                    break;
                    case "*":
                    {
                        int res = n1*n2;
                        v1.setText("The Pro is :" + res);
                    }
                    break;
                    case "/":
                    {
                        int res = n1/n2;
                        v1.setText("The div is :" + res);
                    }
                    break;
                    default:
                    {
                        v1.setText("Invalid Operator");
                    }


                }



            }
        });




    }
}