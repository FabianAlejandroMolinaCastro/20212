package com.example.a20212;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class ActToggleButton extends AppCompatActivity {
ToggleButton toggleButton;
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_toggle_button);
        toggleButton = (ToggleButton) findViewById(R.id.toggleButton);
        imageView = (ImageView)findViewById(R.id.foco);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    imageView.setImageResource(R.drawable.monkey);
                }
                else {
                    imageView.setImageResource(R.drawable.lion);
                }
            }
        });
    }
}
/*setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            // The toggle is enabled
        } else {
            // The toggle is disabled
        }
    }
});

This is how we can handle ToggleButton click events in android applications based on*/