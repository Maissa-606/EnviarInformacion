package com.example.enviar_informacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MostrarInformacion extends AppCompatActivity
{



    EditText inpNom,inpAp,inpEd,inpCor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_informacion);

        inpNom= (EditText) findViewById(R.id.inpN);
        inpAp= (EditText) findViewById(R.id.inpA);
        inpEd= (EditText) findViewById(R.id.inpE);
        inpCor= (EditText) findViewById(R.id.inpC);


        inpNom.setText(getIntent().getExtras().getString("nombre"));
        inpAp.setText(getIntent().getExtras().getString("apellido"));
        inpEd.setText(getIntent().getExtras().getString("edad"));
        inpCor.setText(getIntent().getExtras().getString("apellido"));


    }
}