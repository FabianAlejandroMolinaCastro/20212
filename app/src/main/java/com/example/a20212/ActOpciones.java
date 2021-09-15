package com.example.a20212;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class ActOpciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_opciones);
        ((Button) findViewById(R.id.button9)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ActRadioButton.class);
                /*Los intent se dividen en dos implicitos y explisitos
                 * Los implicitos son aquellos para hacer llamados en la misma aplicacion
                 * Los explicitos son aquellos para hacer llamados en otra aplicacion "externos" */
                startActivity(intent);
            }
        });

        ((Button) findViewById(R.id.button10)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ActSeekBar.class);
                startActivity(intent);
            }
        });

        ((Button) findViewById(R.id.button11)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ActListView.class);
                startActivity(intent);
            }
        });
        ((Button)findViewById(R.id.button12)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActRadioButton.class);/*intent es un
                paquete Donde le podemos enviar lo que queremos*/
                String nombres= ((EditText)findViewById(R.id.Nombres)).getText().toString();
                intent.putExtra("Nombres",nombres); /*permite enviar las variables, nombres es el
                que esta arriba*/
                intent.putExtra("Estado", true);
                startActivity(intent);
            }
        });
        //Toast
        ((Button) findViewById(R.id.button13)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"hola como estas",Toast.LENGTH_LONG).show();
                /*envia una notificacion de alerta*/
            }
        });
        //Snackbar
        ((Button) findViewById(R.id.button14)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Snackbar.make(view,"Aca viene la pregunta",Snackbar.LENGTH_LONG)
                        .setAction("action",null).show();_ Nos muestra una notificacion mas eficiente*/
                Snackbar.make(view,"aca viene la pregunta",Snackbar.LENGTH_INDEFINITE).
                        setAction("Ok", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getApplicationContext(),"Estoy dentro del Snackbar",
                                Toast.LENGTH_LONG).show();
                        /*envia una notificacion de alerta*/
                    }
                }).show();
            }
        });
    }
}