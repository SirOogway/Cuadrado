package com.innova.cuadrado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvResultado;
    EditText etLado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResultado = (TextView) findViewById(R.id.tvResultado);
        etLado = (EditText) findViewById(R.id.etLado);

    }

    public void calcular (View view){
        Cuadrado cuad = new Cuadrado ();

        double dato = 0;
        try {
            dato = Double.parseDouble(etLado.getText().toString());

        }catch (Exception e) {

        }
        Boolean exito = cuad.setLado(dato);

        double lado = cuad.getLado();
        double area = cuad.area();
        double perimetro = cuad.perimetro();

        if (!exito) {
            etLado.setText(lado + "");
        }

        String respuesta = "Para un cuadrado con lados de " + lado + " le corresponden los siguientes datos.\n\nArea: " + area + "\nPerimetro: " + perimetro;
        tvResultado.setText(respuesta);


    }

}