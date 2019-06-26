package com.example.efkei.converter;

import android.service.autofill.FillEventHistory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnConvert=(Button)findViewById(R.id.convertBtn);
        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               try{ EditText num=(EditText)findViewById(R.id.milliEdit);
                double value=Integer.parseInt((num.getText()).toString());

                    EditText results = (EditText) findViewById(R.id.inchesEdit);
                    double value2 = calculateInches(value);
                    String value3 = String.format("%.2f", value2);
                    results.setText(value3);}
                 catch(Exception e){
                     EditText num=(EditText)findViewById(R.id.milliEdit);
                    num.setText("Input here the value to convert");
                }
            }
        });

        Button btnExit=(Button)findViewById(R.id.exitBtn);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               finish();
            }
        });

    }

    public double calculateInches(double value){
        return value*25.4;
    }
}
