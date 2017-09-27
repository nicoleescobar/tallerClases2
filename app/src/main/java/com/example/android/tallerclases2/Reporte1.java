package com.example.android.tallerclases2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Reporte1 extends AppCompatActivity {
    private TableLayout tabla;
    private ArrayList<celular> celulares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte1);

        tabla = (TableLayout)findViewById(R.id.tabla);
        celulares = datos.obtener();
        int position = 0;
        int menor_precio = 999999999;

        for (int i = 0; i < celulares.size() ; i++){
            String marca = celulares.get(i).getMarca();
            String color = celulares.get(i).getColor();
            String so = celulares.get(i).getSistema();
            int precio = celulares.get(i).getPrecio();
            if (( precio < menor_precio) && ( marca.equalsIgnoreCase("huawei") ) && (color.equalsIgnoreCase("blanco")) && (so.equalsIgnoreCase("android"))) {
                position = i;
            }
        }

        TableRow fila = new TableRow(this);
        TextView c1 = new TextView(this);
        TextView c2 = new TextView(this);
        TextView c3 = new TextView(this);
        TextView c4 = new TextView(this);
        TextView c5 = new TextView(this);

        c1.setText(""+1);
        c2.setText(celulares.get(position).getMarca());
        c3.setText(celulares.get(position).getColor());
        c4.setText(celulares.get(position).getSistema());
        c5.setText(""+celulares.get(position).getPrecio());

        fila.addView(c1);
        fila.addView(c2);
        fila.addView(c3);
        fila.addView(c4);
        fila.addView(c5);

        tabla.addView(fila);

    }
}
