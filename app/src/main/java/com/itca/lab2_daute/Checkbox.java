package com.itca.lab2_daute;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.CheckBox;



public class Checkbox extends AppCompatActivity {
    private EditText et1,et2;
    private TextView tv3;
    private CheckBox checkbox1, checkbox2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        et1=(EditText) findViewById(R.id.et1);
        et2=(EditText) findViewById(R.id.et2);
        tv3=(TextView) findViewById(R.id.tv3);
        checkbox1 = findViewById(R.id.cBox1);
        checkbox2 = findViewById(R.id.cBox2);

    }
    public void operar(View view){
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        int nro1=Integer.parseInt(valor1);
        int nro2=Integer.parseInt(valor2);
        String resu="";
        if (checkbox1.isChecked()==true) {
            int suma=nro1+nro2;
            resu=resu + "La suma es:"+ suma;
        }
        if (checkbox2.isChecked()==true) {
            int resta=nro1-nro2;
            resu=resu + "La resta es:"+ resta;
        }
        tv3.setText(resu);
    }
}