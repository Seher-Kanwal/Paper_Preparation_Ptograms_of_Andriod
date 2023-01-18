package com.example.workingcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrimeCheck extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prime_check);

        EditText ed1;
        TextView v1;
        Button btn;
        btn = (Button) findViewById(R.id.pbtn);
        ed1 = (EditText) findViewById(R.id.peditTextNumber);
        v1 = (TextView) findViewById(R.id.ptV);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(ed1.getText().toString());
                int i = 2;
                int count = 0;

                for(i=2;i<n1;i++){
                    if((n1%i) == 0){
                        count++;

                        // if the count get incremented that's means the number is not prime
                        // so no need to check it
                        break;
                    }
                }
                if(count == 0){
                    v1.setText("Prime Number");
                }
                else{
                    v1.setText("Not a Prime Number");
                }
            }
        });
    }
}