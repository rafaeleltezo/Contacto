package com.example.rafaelp.contacto;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class Contactos extends AppCompatActivity {
    public CalendarView calendario;
    Intent intento;
    public TextView nombre,numero,email,descripcion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactos);
        nombre= (TextView) findViewById(R.id.Cnombre);
        calendario=(CalendarView) findViewById(R.id.Ccalendario);
        numero=(TextView) findViewById(R.id.Ctelefono);
        email=(TextView) findViewById(R.id.Cemail);
        descripcion=(TextView) findViewById(R.id.CDescripción);
        Button boton=(Button) findViewById(R.id.boton);
        intento=new Intent(Contactos.this,Persona.class);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intento.putExtra("nombre",nombre.getText().toString());
                intento.putExtra("telefono",numero.getText().toString());
                intento.putExtra("email",email.getText().toString());
                intento.putExtra("descipcion",descripcion.getText().toString());
                startActivity(intento);

            }
        });
    }
}