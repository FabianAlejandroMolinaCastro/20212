package com.example.a20212;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
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
                    Toast.makeText(getApplicationContext(),"Se ha escrito correctamente en la SD",Toast.LENGTH_LONG).show();

        }catch (IOException error){
            Toast.makeText(getApplicationContext(),"Error al escribir en la SD",Toast.LENGTH_LONG).show();
        }
    }
    public void leerFicheroMemoriaExterna(){
       String[] archivos=fileList();

       if(existe(archivos,"ficheroprueba.txt")){
           try{
               InputStreamReader archivo= new InputStreamReader(openFileInput("ficheroprueba.txt"));
               BufferedReader br= new BufferedReader(archivo);
               String linea= br.readLine();
               String todo="";
               while (linea!=null){
                   todo=todo+linea+"\n";
                   linea=br.readLine();
               }
               br.close();
               archivo.close();
               tbtexto.setText(todo);
           }catch (IOException e){
               Toast.makeText(getApplicationContext(),"Error de lectura",Toast.LENGTH_LONG).show();

           }
       }

    }
    private boolean existe( String[] archivos,String arcbuscar){
for (int f=0; f< archivos.length;f++)
    if(arcbuscar.equals((archivos[f])))
        return true;
    return false;
    }
}