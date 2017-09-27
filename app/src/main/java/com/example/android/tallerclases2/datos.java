package com.example.android.tallerclases2;

import java.util.ArrayList;

/**
 * Created by android on 26/09/2017.
 */

public class datos {
    private static ArrayList<celular> celulares = new ArrayList<>();

    public static void guardar(celular c){
        celulares.add(c);

    }

    public static  ArrayList<celular> obtener(){
        return celulares;
    }
}
