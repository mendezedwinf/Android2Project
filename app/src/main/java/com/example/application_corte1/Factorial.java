package com.example.application_corte1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Factorial extends AppCompatActivity {
    EditText num;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factorial);
        num = (EditText) findViewById(R.id.editText3);
        resultado = (TextView) findViewById(R.id.textView11);
    }

    public void Calcular (View v) {
        try {
            int a = Integer.parseInt(num.getText().toString());
            int f = 1;
            for (int i = 2; i <= a; i++) {
                f = f * i;
            }
            resultado.setText("El factorial es " + f);
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Ingrese un dato", Toast.LENGTH_LONG).show();
        }
    }
    public void Volver (View v){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);

    }
}
