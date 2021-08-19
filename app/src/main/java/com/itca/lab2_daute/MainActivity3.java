package com.itca.lab2_daute;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {
    private Button btn1, btn2, btn3, btn4;
    private TextView lblx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);

        lblx = findViewById(R.id.lblx);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn1:
                lblx.setText("Has cliqueado el boton 1");
                Toast.makeText(this, "Has cliqueado el boton 1", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn2:
                lblx.setText("Has cliqueado el boton 2");
                Toast.makeText(this, "Has cliqueado el boton 2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn3:
                lblx.setText("Has cliqueado el boton 3");
                Toast.makeText(this, "Has cliqueado el boton 3", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn4:
                lblx.setText("Has cliqueado el boton 4");
                Toast.makeText(this, "Has cliqueado el boton 4", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
    }
}