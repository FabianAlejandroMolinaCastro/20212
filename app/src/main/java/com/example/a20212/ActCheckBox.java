package com.example.a20212;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class ActCheckBox extends AppCompatActivity {
    CheckBox chkRojo, chkVerde, chkAzul;
    Button button;
    TextView editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_check_box);
        chkRojo = (CheckBox) findViewById(R.id.checkBox);
        chkVerde = (CheckBox) findViewById(R.id.checkBox2);
        chkAzul = (CheckBox)  findViewById(R.id.checkBox3);
        button = (Button)  findViewById((R.id.button8));

        editText = (TextView) findViewById(R.id.textView3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer result = new StringBuffer();/*se define una variable StringBuffer que
                me permita concatenar una cadena*/
                result.append("Rojo= ").append(chkRojo.isChecked());//mirar si el seleccionado es de ese color
                result.append(" Verde= ").append(chkVerde.isChecked());
                result.append(" Azul= ").append(chkAzul.isChecked());
                editText.setText(result.toString());
            }
        });
    }
}