package com.example.a20212;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ActMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_menu);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.opcion1) {
            Toast.makeText(getApplicationContext(), "seleccionasta la opcion 1", Toast.LENGTH_LONG).show();
            return true;
        }
        if (id == R.id.opcion2) {
            Toast.makeText(getApplicationContext(), "seleccionasta la opcion 2", Toast.LENGTH_LONG).show();
            return true;
        }
        if (id == R.id.opcion3) {
            Toast.makeText(getApplicationContext(), "seleccionasta la opcion 3", Toast.LENGTH_LONG).show();
            return true;
        }
        if (id == R.id.opcion4) {
            Toast.makeText(getApplicationContext(), "seleccionasta la opcion 4", Toast.LENGTH_LONG).show();
            return true;
        }
        if (id == R.id.opcion5) {
            Toast.makeText(getApplicationContext(), "seleccionasta la opcion 5", Toast.LENGTH_LONG).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}