package com.example.a20212;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActButton extends AppCompatActivity implements View.OnClickListener/*implementeme sonbre esta
actidad el evento listener y pongo el metodo OnClick*/ {
    LinearLayout fondo;
    Button btnred, btngreen, btnblue;//definimos unas variables de tipo Button para poder manipular los botones
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_button);/*cargueme la actividad Button "No puedo
        tener acceso a la vista sino la pongo*/
        btnred =(Button) findViewById(R.id.button15);// Agamelo igual a un Button y busque el boton que se le asigno
        btngreen =(Button) findViewById(R.id.button16);// Agamelo igual a un Button y busque el boton que se le asigno
        btnblue =(Button) findViewById(R.id.button3);// Agamelo igual a un Button y busque el boton que se le asigno
        fondo = (LinearLayout) findViewById(R.id.fondo);// Agamelo igual a LinearLayout y busque el fondo que se le asigno
        textView = (TextView) findViewById(R.id.textView);

        btnred.setOnClickListener(this);/*le voy a asginar el evento de "escucha del click" y sobre que elemento que
        va escuchar"this" es para escuchar la clase de ActButon*/
        btngreen.setOnClickListener(this);//lo mismo Con set es para que y tambien es un objeto sobre una clase
        btnblue.setOnClickListener(this);// lo mismo y llamo la clase OnClick; ademas es un objeto sobre una clase

        ((Button) findViewById(R.id.button4)).setOnClickListener(this);/* Estoy accesando directamente a esa variables
        por lo que no tengo necesidad de declarar una variable de tipo Button*/

        ((Button) findViewById(R.id.button5)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fondo.setBackgroundColor(Color.MAGENTA);
                //textView.setText("Seleccionaste el color magenta");
                ((TextView) findViewById(R.id.textView)).setText("Seleccionaste el color magenta");/*
                Estoy ingresando al textView sin la necesidad de pasar por la definicion de definir una variables y sin
                la necesidad de recoger una variable o signar el valor a esa varibale ; entramos directamente al control
                 asignandole directamente la propiedad o ese metodo que yo deseo*/

            }
        });/*Crear ese metodo OnClick sobre ese objeto, "se recomienda utilizar este metodo cuando se tiene
        pocos botones"*/
        ((Button) findViewById(R.id.button7)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.textView)).setText("Hola "+((EditText) findViewById(R.id.editText)).getText());
                /*Recordemos que set es para poner el valor y get para adquirir el valor*/
            }
        });
    }

    @Override
    public void onClick(View view)/*necesito que me diga a que le estoy haciendo click
     */ {
        switch (view.getId())/* tomeme el Id del objeto al que le estoy haciendo click*/{
            case R.id.button15:
                fondo.setBackgroundColor(Color.RED);//pongame el color de fondo RED
                textView.setText("Seleccionaste el color Rojo");
                break;
            case R.id.button16:
                fondo.setBackgroundColor(Color.GREEN);
                textView.setText("Seleccionaste el color verde");
                break;
            case R.id.button3:
                fondo.setBackgroundColor(Color.BLUE);
                textView.setText("Seleccionaste el color azul");
                break;
            case R.id.button4:
                fondo.setBackgroundColor(Color.WHITE);
                textView.setText("Seleccionaste el color blanco");
            default:

                break;
        }
    }//se recomiendo para cuando tenga mas de un elemento en la vista
    public void cambiarColor(View view){
        fondo.setBackgroundColor(Color.YELLOW);
        ((TextView) findViewById(R.id.textView)).setText("Seleccionaste el color amarillo");
        /*Lo que hacemos es hacer la llamada con el metodo Onclick desde activity_act_buton por lo
        cual toca crear el metodo con el mismo nombre que le pusimos en el otro lado*/
    }
    }