package com.example.application_corte1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BisiestoActivity extends AppCompatActivity {
    EditText year;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bisiesto);
        year=(EditText)findViewById(R.id.editText);
        resultado=(TextView) findViewById(R.id.textView3);
    }
    public void Calcular (View v){
        String yearString = year.getText().toString();
        if (!yearString.equals("")){
            int yearInt = Integer.parseInt(yearString);
            if (IsLeapYear(yearInt)){
                resultado.setText(yearInt + " es bisiesto.");
            }else{
                resultado.setText(yearInt + " no es bisiesto.");
            }
        }
        else{
            Toast.makeText(this, "Ingrese un año", Toast.LENGTH_LONG).show();
        }

    }
    private boolean IsLeapYear(int year){
        if (year % 4 != 0){
            return false;
        }else if (year %100 !=0){
            return true;
        }else if (year %400 !=0){
            return false;
        }else{
            return false;
        }
    }

    public void Volver (View v){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);

    }
}
