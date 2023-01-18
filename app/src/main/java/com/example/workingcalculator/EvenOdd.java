package com.example.workingcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EvenOdd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_even_odd);

        EditText ed1;
        TextView v1;
        Button btn;
        btn = (Button) findViewById(R.id.Obutton2);
        ed1 = (EditText) findViewById(R.id.OeditTextNumber3);
        v1 = (TextView) findViewById(R.id.OtextView2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(ed1.getText().toString());
                if(n1%2 == 0){
                    v1.setText("Even Number");
                }
                else{
                    v1.setText("Odd Number");
                }
            }
        });
    }
}