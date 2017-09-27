package com.example.android.tallerclases2;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.content.res.Resources;

import java.util.ArrayList;

public class Reporte3 extends AppCompatActivity {

    private TableLayout tabla;
    private TextView text;
    private ArrayList<celular> celulares;
    private Resources resources;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte3);

        resources = this.getResources();
        tabla = (TableLayout)findViewById(R.id.tabla);
        text = (TextView) findViewById(R.id.prom);
        celulares = datos.obtener();
        int position = 0;
        String prom;
        int sum = 0;

        for (int i = 0; i < celulares.size() ; i++){
            String marca = celulares.get(i).getMarca();
            if ( ( marca.equalsIgnoreCase("nokia") ) ) {
                position = position + 1;

                sum = sum + celulares.get(i).getPrecio();

                TableRow fila = new TableRow(this);
                TextView c1 = new TextView(this);
                TextView c2 = new TextView(this);
                TextView c3 = new TextView(this);

                c1.setText(""+position);
                c2.setText(celulares.get(i).getMarca());
                c3.setText(""+celulares.get(i).getPrecio());

                fila.addView(c1);
                fila.addView(c2);
                fila.addView(c3);

                tabla.addView(fila);

            }
        }

        prom = " " + (sum / position);
        text.setText(resources.getString(Integer.parseInt(R.string.prom + ": " + prom)));

    }
}
