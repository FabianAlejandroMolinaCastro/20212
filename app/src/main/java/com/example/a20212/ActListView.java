package com.example.a20212;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ActListView extends AppCompatActivity {
String[] nombres = {"Jose","Pedro","María","Juan","Mateo","Lucas","Sofia",};
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_list_view);
        listView = ((ListView) findViewById(R.id.listView));
        ArrayAdapter<String> adapter = new ArrayAdapter<String>/*se crea un arrayAdaptaer para con
        catenar la lista*/
                (this,android.R.layout.simple_expandable_list_item_1,nombres);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                /*Toast.makeText(getApplicationContext(),String.valueOf(i),Toast.LENGTH_LONG).show();
                le digo que cada ves que de click sobre uno de los items en la lista muestreme la
                posicion a la que corresponde
                 */
                Toast.makeText(getApplicationContext(),listView.getItemAtPosition(i).toString(),Toast.LENGTH_LONG).show();
                /*le digo que cada ves que de click sobre uno de los items en la lista muestreme el
                nombre que seleccionamos de la lista*/
            }
        });
    }
}