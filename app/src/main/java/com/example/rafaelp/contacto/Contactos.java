package com.example.rafaelp.contacto;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

import java.util.Date;

public class Contactos extends AppCompatActivity {
    public CalendarView calendario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactos);
        TextView nombre= (TextView) findViewById(R.id.nombre);
        calendario=(CalendarView) findViewById(R.id.calendario);
        TextView numero=(TextView) findViewById(R.id.telefono);
        TextView email=(TextView) findViewById(R.id.email);
        TextView descripcion=(TextView) findViewById(R.id.Descripción);
        Button boton=(Button) findViewById(R.id.boton);
        Intent intento=new Intent(Contactos.this,Persona.class);
        intento.putExtra("nombre",nombre.getText().toString());
        intento.putExtra("telefono",numero.getText().toString());
        intento.putExtra("email",email.getText().toString());
        intento.putExtra("descipcion",descripcion.getText().toString());

    }

}
