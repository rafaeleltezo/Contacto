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

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Contactos extends AppCompatActivity {
    public CalendarView calendario;
    Intent intento;
    public TextView nombre,numero,email,descripcion;
    String currentdate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactos);
        nombre= (TextView) findViewById(R.id.Cnombre);
        calendario=(CalendarView) findViewById(R.id.Ccalendario);
        Calendar c=Calendar.getInstance();
        SimpleDateFormat ss = new SimpleDateFormat("dd-MM-yyyy");
        Date d=new Date(calendario.getDate());
        currentdate= ss.format(d);
        numero=(TextView) findViewById(R.id.Ctelefono);
        email=(TextView) findViewById(R.id.Cemail);
        descripcion=(TextView) findViewById(R.id.CDescripción);
        Button boton=(Button) findViewById(R.id.boton);
        intento=new Intent(Contactos.this,Persona.class);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intento.putExtra("nombre",nombre.getText().toString());
                intento.putExtra("fecha",currentdate);
                intento.putExtra("telefono",numero.getText().toString());
                intento.putExtra("email",email.getText().toString());
                intento.putExtra("descripcion",descripcion.getText().toString());
                startActivity(intento);


            }
        });
        try {
            Bundle b=getIntent().getExtras();
            nombre.setText(b.getString("nombre"));
            numero.setText(b.getString("numero"));
            email.setText(b.getString("email"));
            descripcion.setText(b.getString("descripcion"));
        }catch (NullPointerException w){

        }

    }

}