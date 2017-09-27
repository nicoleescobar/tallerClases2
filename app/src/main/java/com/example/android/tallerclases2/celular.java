package com.example.android.tallerclases2;

/**
 * Created by android on 26/09/2017.
 */

public class celular {
    private String marca;
    private String sistema;
    private String color;
    private int precio;

    public celular(String marca, String sistema, String color, int precio) {
        this.marca = marca;
        this.sistema = sistema;
        this.color = color;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void guardar (){
        datos.guardar(this);
    }
}
