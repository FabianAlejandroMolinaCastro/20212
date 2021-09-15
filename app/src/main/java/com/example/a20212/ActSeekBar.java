package com.example.a20212;
/*Este contiene 3 instantes el inicio, el mediante y el stop*/
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class ActSeekBar extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
SeekBar seekBar;
TextView start, stop, actual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_seek_bar);
        seekBar = ((SeekBar)findViewById(R.id.seekBar));
        start = ((TextView) findViewById(R.id.textView8));
        actual = ((TextView) findViewById(R.id.textView9));
        stop = ((TextView) findViewById(R.id.textView10)); // identificamos el elemento y lo tragimos

        seekBar.setOnSeekBarChangeListener(this); //Le asignamos el evento
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        actual.setText("Valor actual: "+ i);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        start.setText("Inicio:"+ seekBar.getProgress());
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        stop.setText("Final:"+ seekBar.getProgress());
    }
}