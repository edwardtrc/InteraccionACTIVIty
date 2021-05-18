package com.example.interaccionactivity;

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

    public void CALCoperacion(View view) {
        Intent ioperacion = new Intent(MainActivity.this,Operaciones.class);
        startActivity(ioperacion);
    }

    public void calcSALUD(View view) {
        Intent isalud = new Intent(MainActivity.this,Salud.class);
        startActivity(isalud);
    }

    public void salida(View view) {
        finish();
    }

}
