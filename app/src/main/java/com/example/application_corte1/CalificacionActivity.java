package com.example.application_corte1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalificacionActivity extends AppCompatActivity {
    EditText ed1;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calificacion);
        ed1=(EditText) findViewById(R.id.editText3);
        tv=(TextView) findViewById(R.id.textView8);
    }

    public void Volver (View v){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

    public void Calcular (View v){
        double a=Double.parseDouble(ed1.getText().toString());
        if((a<0) || (a>5))
            Toast.makeText( this, "Error, Nota no valida",Toast.LENGTH_LONG).show();
        if((a>=0) && (a<=2))
            tv.setText("Deficiente " +a);
        if((a>2) && (a<=3))
            tv.setText("Regular " +a);
        if((a>3) && (a<=4))
            tv.setText("Bueno " +a);
        if((a>4) && (a<=5))
            tv.setText("Excelente " +a);
    }
}
