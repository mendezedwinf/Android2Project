package com.example.application_corte1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class NumeroMayor extends AppCompatActivity {
    EditText num1;
    EditText num2;
    EditText num3;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero_mayor);
        num1 = (EditText) findViewById(R.id.editText3);
        num2 = (EditText) findViewById(R.id.editText4);
        num3 = (EditText) findViewById(R.id.editText5);
        resultado = (TextView) findViewById(R.id.textView11);
    }
    public void Calcular (View v) {
        try {
            double n1 = Double.parseDouble(num1.getText().toString());
            double n2 = Double.parseDouble(num2.getText().toString());
            double n3 = Double.parseDouble(num3.getText().toString());
            if (n1 > n2) {
                if (n1 > n3) {
                    if (n1 % 1 == 0) {
                        resultado.setText("El número mayor es " + (int) n1);
                    } else {
                        resultado.setText("El número mayor es " + n1);
                    }
                } else {
                    if (n3 % 1 == 0) {
                        resultado.setText("El número mayor es " + (int) n3);
                    } else {
                        resultado.setText("El número mayor es " + n3);
                    }
                }
            } else {
                if (n2 > n3) {
                    if (n2 % 1 == 0) {
                        resultado.setText("El número mayor es " + (int) n2);
                    } else {
                        resultado.setText("El número mayor es " + n2);
                    }
                } else {
                    if (n3 % 1 == 0) {
                        resultado.setText("El número mayor es " + (int) n3);
                    } else {
                        resultado.setText("El número mayor es " + n3);
                    }
                }

            }
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Ingrese un dato", Toast.LENGTH_LONG).show();
        }
    }
    public void Volver (View v){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);

    }
}
