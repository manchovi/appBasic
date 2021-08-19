package com.itca.lab2_daute;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Radio extends AppCompatActivity {
private EditText et1,et2;
private TextView tv3;
private RadioButton r1,r2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        tv3=findViewById(R.id.tv3);
        r1=findViewById(R.id.r1);
        r2=findViewById(R.id.r2);
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
            Toast.makeText(this, "Clic en pantalla 1", Toast.LENGTH_SHORT).show();
           Intent intent = new Intent(Radio.this, MainActivity3.class);
           startActivity(intent);
            return true;
        }else if(id == R.id.action_pantalla2){
            Toast.makeText(this, "Clic en pantalla 2", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Radio.this, MainActivity2.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
public void operar (View View){
        String valor1 =et1.getText().toString();
    String valor2 =et2.getText().toString();
   int nro1=Integer.parseInt(valor1);
   int nro2=Integer.parseInt(valor2);
   if (r1.isChecked()==true){
       int suma=nro1+nro2;
       String resu =String.valueOf(suma);
       tv3.setText(resu);
   }else
   if (r2.isChecked()==true){
       int resta=nro1-nro2;
       String resu =String.valueOf(resta);
       tv3.setText(resu);
   }


}
}