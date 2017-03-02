package com.example.rafaelp.contacto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

public class Contactos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactos);
        TextView nombre= (TextView) findViewById(R.id.nombre);
        CalendarView calendario=(CalendarView) findViewById(R.id.calendario);
        TextView numero=(TextView) findViewById(R.id.telefono);

    }

}
