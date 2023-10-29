package com.example;
import  java.util.List;
import java.util.ArrayList;

public class EliminarArray {

    public static void main(String[] args) {
        
        List<Enteros> lista = new ArrayList<Enteros>();
        lista.add(new Enteros(2));
        lista.add(new Enteros(10));
        lista.add(new Enteros(80));
        lista.add(new Enteros(45));
        lista.add(new Enteros(1));

        int size = lista.size();
        for (int i = 0; i < size; i++) {
            lista.remove(0);
        }
        
        System.out.println("-----12.Lista eliminada------");
        System.out.println("La lista queda asi: ");
        System.out.println(lista);


        
    }
    
}
