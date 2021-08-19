package com.itca.lab2_daute;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class Spiner extends AppCompatActivity {
    private Spinner spinner1;
    private EditText et1, et2;
    private TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spiner);

        spinner1 = (Spinner)findViewById(R.id.spinner1);
        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);

        tv3 = (TextView)findViewById(R.id.tv3);

        String[] opciones = {"Seleccione", "Sumar", "Restar", "Multiplicar", "Dividir"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        spinner1.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_pantalla1) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void operar(View view) {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        int nro1 = Integer.parseInt(valor1);
        int nro2 = Integer.parseInt(valor2);
        String selec = spinner1.getSelectedItem().toString();
        //int n = spinner1.getSelectedItemPosition();
        if(selec.equals("Seleccione")){
            Toast.makeText(this, "Debe seleccionar una opcion", Toast.LENGTH_SHORT).show();
        }else if(selec.equals("Sumar")){
            int suma = nro1 + nro2;
            //String resu = String.valueOf(suma);
            tv3.setText(""+suma);

        }else if(selec.equals("Restar")){
            int resta = nro1 - nro2;
            tv3.setText(""+resta);

        }else if(selec.equals("Multiplicar")){
            int multiplicar = nro1 * nro2;
            tv3.setText(""+multiplicar);

        }else if(selec.equals("Dividir")){
            if(nro2 == 0){
                Toast.makeText(this, "Error, divisiòn entre cero", Toast.LENGTH_SHORT).show();
                et1.setText("0");
                et2.setText("0");
                tv3.setText("0");
            }else {
                int dividir = nro1 / nro2;
                tv3.setText("" + dividir);
            }
        }
    }
}