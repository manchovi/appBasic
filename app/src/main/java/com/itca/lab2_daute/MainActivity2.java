package com.itca.lab2_daute;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private Button btn1, btn2;
    private TextView lblresultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn1 = findViewById(R.id.btnSaludar);
        btn2 = findViewById(R.id.btnAbout);
        lblresultado = findViewById(R.id.lblres);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblresultado.setText("Has hecho clic en boton Saludo.");
                Toast.makeText(MainActivity2.this, "Has hecho clic en boton saludo.", Toast.LENGTH_LONG).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblresultado.setText("Has hecho clic en boton About.");
                Toast.makeText(MainActivity2.this, "Has hecho clic en boton About.", Toast.LENGTH_SHORT).show();
            }
        });

    }




}