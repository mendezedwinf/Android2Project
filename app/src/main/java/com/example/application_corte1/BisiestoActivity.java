package com.example.application_corte1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BisiestoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bisiesto);
    }

    public void volver (View v){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);

    }
}
