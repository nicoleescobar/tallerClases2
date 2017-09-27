package com.example.android.tallerclases2;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class crearCelular extends AppCompatActivity {
    private EditText marca, sistema, color, precio;
    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_celular);

        marca = (EditText)findViewById(R.id.marca);
        sistema = (EditText)findViewById(R.id.sistema);
        color = (EditText)findViewById(R.id.color);
        precio = (EditText)findViewById(R.id.precio);
        resources = this.getResources();
    }

    public void guardar(View view){
        String Marca;
        String SO;
        String Color;
        int Precio;

        Marca = marca.getText().toString();
        SO = sistema.getText().toString();
        Color = color.getText().toString();
        Precio = Integer.parseInt(precio.getText().toString());


        celular c = new celular(Marca, SO, Color, Precio);
        c.guardar();
        Toast.makeText(this, R.string.done, Toast.LENGTH_SHORT).show();
    }
}
