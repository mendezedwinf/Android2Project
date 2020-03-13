package com.example.application_corte1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Bisiesto(View v){
        Bundle b = new Bundle();
        Intent i = new Intent(this, BisiestoActivity.class);
        i.putExtras(b);
        startActivity(i);
        finish();
    }

    public void Calculadora(View v){
        Bundle b = new Bundle();
        Intent i = new Intent(this, Calculadora.class);
        i.putExtras(b);
        startActivity(i);
        finish();
    }

    public void Calificacion(View v){
        Bundle b = new Bundle();
        Intent i = new Intent(this, CalificacionActivity.class);
        i.putExtras(b);
        startActivity(i);
        finish();
    }

    public void Factorial(View v){
        Bundle b = new Bundle();
        Intent i = new Intent(this, Factorial.class);
        i.putExtras(b);
        startActivity(i);
        finish();
    }

    public void NumeroMayor(View v){
        Bundle b = new Bundle();
        Intent i = new Intent(this, NumeroMayor.class);
        i.putExtras(b);
        startActivity(i);
        finish();
    }

}
