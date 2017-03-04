package com.example.rafaelp.contacto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;
import java.util.TimeZone;

public class Persona extends AppCompatActivity {
    public Intent intento;
    public Bundle b;
    TextView nombre;
    TextView fecha;
    TextView numero;
    TextView email;
    TextView descripcion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persona);
        b=getIntent().getExtras();
        nombre=(TextView)findViewById(R.id.nombre);
        fecha=(TextView)findViewById(R.id.fecha);
        numero=(TextView)findViewById(R.id.numero);
        email=(TextView)findViewById(R.id.email);
        descripcion =(TextView)findViewById(R.id.descripcion);
        //Definiedo contenido de campos

        nombre.setText(b.getString("nombre"));
        fecha.setText(b.getString("fecha"));
        numero.setText(b.getString("telefono"));
        email.setText(b.getString("email"));
        descripcion.setText(b.getString("descripcion"));
        Button boton=(Button)findViewById(R.id.boton);
        intento=new Intent(Persona.this,Contactos.class);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               setCampos();

            }
        });

    }
    public void setCampos(){
        intento.putExtra("nombre",nombre.getText().toString());
        intento.putExtra("numero",numero.getText().toString());
        intento.putExtra("email",email.getText().toString());
        intento.putExtra("descripcion",descripcion.getText().toString());
        startActivity(intento);
    }
}
