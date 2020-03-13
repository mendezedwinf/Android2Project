package com.example.application_corte1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculadora extends AppCompatActivity {
    EditText et1, et2;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        et1=(EditText) findViewById(R.id.editText2);
        et2=(EditText) findViewById(R.id.editText4);
        tv=(TextView) findViewById(R.id.textView12);
    }

    public void Suma (View v){
        try {
            double a=Double.parseDouble(et1.getText().toString());
            double b=Double.parseDouble(et2.getText().toString());
            tv.setText("Total: " +(a+b));
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Ingrese un dato", Toast.LENGTH_LONG).show();
        }
    }
    public void Resta (View v){
        try {
            double a=Double.parseDouble(et1.getText().toString());
            double b=Double.parseDouble(et2.getText().toString());
            tv.setText("Total: " +(a-b));
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Ingrese un dato", Toast.LENGTH_LONG).show();
        }
    }
    public void Multiplica (View v){
        try {
            double a=Double.parseDouble(et1.getText().toString());
            double b=Double.parseDouble(et2.getText().toString());
            tv.setText("Total: " +(a*b));
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Ingrese un dato", Toast.LENGTH_LONG).show();
        }
    }
    public void Divide (View v){
        try {
            double a=Double.parseDouble(et1.getText().toString());
            double b=Double.parseDouble(et2.getText().toString());
            if (b <= 0)
                Toast.makeText(this, "No puede dividir por cero", Toast.LENGTH_LONG).show();
            else
                tv.setText("Total: " +(a/b));
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Ingrese un dato", Toast.LENGTH_LONG).show();
        }
    }
    public void Volver (View v){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
