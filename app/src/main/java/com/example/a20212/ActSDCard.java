package com.example.a20212;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class ActSDCard extends AppCompatActivity {
Button btnEscibir, btnLeer;
EditText tbtexto;
private boolean DisponibleSD, AccesoEscrituraSD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_sdcard);
        btnEscibir=(Button) findViewById(R.id.button);
        btnLeer=(Button) findViewById(R.id.button2);
        tbtexto=(EditText) findViewById(R.id.Nombre);

        btnEscibir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                comprobarSD();
                if (DisponibleSD && AccesoEscrituraSD){
                    escribirFicheroMemoriaExterna();
                }
            }
        });
        btnLeer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                leerFicheroMemoriaExterna();
            }
        });
    }
    public void comprobarSD(){
      String estado = Environment.getExternalStorageState();
      if(estado.equals(Environment.MEDIA_MOUNTED)){
          DisponibleSD=true;
          AccesoEscrituraSD=true;
          return;
      }
        if(estado.equals(Environment.MEDIA_MOUNTED_READ_ONLY)){
            DisponibleSD=true;
            AccesoEscrituraSD=false;
            return;
        }else{
            DisponibleSD=false;
            AccesoEscrituraSD=false;
        }

    }
    public void escribirFicheroMemoriaExterna(){
        try {
            OutputStreamWriter archivo = new OutputStreamWriter(openFileOutput("ficheroprueba.txt", Activity.MODE_PRIVATE));
                    archivo.write(tbtexto.getText().toString());
                    archivo.flush();
                    archivo.close();
                    Toast.makeText(getApplicationContext(),"Error de escritura en la SD",Toast.LENGTH_LONG).show();

        }catch (Exception error){
            Toast.makeText(getApplicationContext(),"Error al escribir en la SD",Toast.LENGTH_LONG).show();
        }
    }
    public void leerFicheroMemoriaExterna(){

    }
}