package com.example.workingcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ArmstrongCheck extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_armstrong_check);

        EditText ed1;
        TextView v1;
        Button btn;
        btn = (Button) findViewById(R.id.Abutton);
        ed1 = (EditText) findViewById(R.id.AeditTextNumber);
        v1 = (TextView) findViewById(R.id.AtextView2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(ed1.getText().toString());
                int number= n1;
                int p = 0;
                while(number > 0)
                {
                    int rem = number%10;
                    p = p + (rem*rem*rem);
                    number = number/10;
                }

                if(p== n1){
                    v1.setText("ArmStrong Number");
                }
                else{
                    v1.setText("Not an Armstrong Number");
                }

            }
        });
    }
}