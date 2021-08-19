package com.itca.lab2_daute;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ControlListWiew extends AppCompatActivity {
    private String [] paises = {"Argentina", "Chile", "Paraguay", "Bolivia", "Peru", "Ecuador", "Brasil", "Colombia", "Venezuela"};
    private  String [] habitantes = {"40000000", "1700000", "6500000", "1000000", "29000000", "6500000", "2500000", "8500000", "4500000"};
    private TextView tv1;
    private ListView lv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_list_wiew);
            tv1=findViewById(R.id.poblacion);
            lv1=findViewById(R.id.ListView);
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, paises);
        lv1.setAdapter(adapter);


        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                tv1.setText("La poblacion de" + lv1.getItemAtPosition(position) + " es "+ habitantes[position]);
            }
        });

    }
}