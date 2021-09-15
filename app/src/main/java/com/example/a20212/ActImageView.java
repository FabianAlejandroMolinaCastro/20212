package com.example.a20212;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ActImageView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_image_view);
        ((Button)findViewById(R.id.button15)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ImageView)findViewById(R.id.logo)).setImageResource(R.drawable.lion);
            }
        });
        ((Button)findViewById(R.id.button16)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ImageView)findViewById(R.id.logo)).setImageResource(R.drawable.monkey);
            }
        });
    }

   /* public void hola(){
        ((ImageView)findViewById(R.id.logo)).setImageResource(R.drawable.hola);
    }*/
}