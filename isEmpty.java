package com.example;
import java.util.ArrayList;
import java.util.List;

public class isEmpty {
    public static void main(String[] args) {
        
        List<Enteros> lista = new ArrayList<Enteros>();

        System.out.println("----2. y 8.Metodo isEmpty (Programa que verifica si un arreglo esta vacio o no)------");

        
        if (lista.isEmpty()) {
            System.out.println("El ArrayList está vacío.");
        } else {
            System.out.println("El ArrayList no está vacío.");
        }

       
        lista.add(new Enteros(4));
        lista.add(new Enteros(3));

        
        if (lista.isEmpty()) {
            System.out.println("El ArrayList está vacío.");
        } else {
            System.out.println("El ArrayList no está vacío.");
        }
    }
}
