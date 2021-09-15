package com.example.a20212;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ActRadioButton extends AppCompatActivity {
RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_radio_button);

        radioGroup = ((RadioGroup) findViewById(R.id.PrimeraPregunta));

        //REcogemos los valores enviados
        Intent intent = getIntent();//Recogemos el "intent" que me enviaron
        Bundle bundle = intent.getExtras();/*Con Bundle recogeremos en bundle la informacion del
        objeto intent.getExtras*/
        if(bundle!= null){
            ((TextView) findViewById(R.id.textView5)).setText("Nombres ="+bundle.get("Nombres")+
                    " Estado= "+ bundle.get("Estado"));/* Recogimos la informacion y la ponemos con
                    set text para ponerla en el texviw5*/
        }
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == R.id.radioButton){
                    Toast.makeText(getApplicationContext(),"Alto",Toast.LENGTH_LONG).show();
                }
                else if (checkedId == R.id.radioButton2){
                    Toast.makeText(getApplicationContext(),"Medio",Toast.LENGTH_LONG).show();
                }
                else if (checkedId == R.id.radioButton3){
                    Toast.makeText(getApplicationContext(),"Bajo",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}