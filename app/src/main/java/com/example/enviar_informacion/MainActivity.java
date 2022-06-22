package com.example.enviar_informacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    EditText nombre,apellido,edad,correo;
    Button btnenviar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText) findViewById(R.id.inpNombre);
        apellido= (EditText) findViewById(R.id.inpApellido);
        edad= (EditText) findViewById(R.id.inpEdad);
        correo= (EditText) findViewById(R.id.inpCorreo);
        btnenviar= (Button)findViewById(R.id.btnEnviar);

        btnenviar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(getApplicationContext(), MostrarInformacion.class);
                intent.putExtra("nombre",nombre.getText().toString());
                intent.putExtra("apellido",apellido.getText().toString());
                intent.putExtra("edad",edad.getText().toString());
                intent.putExtra("correo",correo.getText().toString());
                startActivity(intent);

            }
        });


    }
}