package com.example.android.tallerclases2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Reporte2 extends AppCompatActivity {
    private TableLayout tabla;
    private ArrayList<celular> celulares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte2);

        tabla = (TableLayout)findViewById(R.id.tabla);
        celulares = datos.obtener();
        int position = 0;

        for (int i = 0; i < celulares.size() ; i++){
            String marca = celulares.get(i).getMarca();
            String color = celulares.get(i).getColor();
            if ( ( marca.equalsIgnoreCase("apple") ) && (color.equalsIgnoreCase("negro")) ) {
                position = position + 1;

                TableRow fila = new TableRow(this);
                TextView c1 = new TextView(this);
                TextView c2 = new TextView(this);
                TextView c3 = new TextView(this);
                TextView c4 = new TextView(this);
                TextView c5 = new TextView(this);

                c1.setText(""+position);
                c2.setText(celulares.get(i).getMarca());
                c3.setText(celulares.get(i).getColor());
                c4.setText(celulares.get(i).getSistema());
                c5.setText(""+celulares.get(i).getPrecio());

                fila.addView(c1);
                fila.addView(c2);
                fila.addView(c3);
                fila.addView(c4);
                fila.addView(c5);

                tabla.addView(fila);

            }
        }



    }
}
