package com.example;
import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistCadenas {
    public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Lapiz");
        arrayList.add("Borrador");
        arrayList.add("Sacapuntas");
        
        
        String[] array = arrayList.toArray(new String[arrayList.size()]);

        System.out.println("-----14.Array de cadenas-----");
        System.out.println("Array de cadenas:");
        System.out.println(Arrays.toString(array));


        String elemento1 = arrayList.get(0);
        System.out.println("----16.Primer Elemento(Array cadenas)-----");
        System.out.println("El primer elemento es: "+elemento1);



        String elemento2 = arrayList.get(2);
        System.out.println("----17.Ultimo Elemento(Array cadenas)-----");
        System.out.println("El ultimo elemento es: "+elemento2);


        System.out.println("----19.Reemplazar elementos----");
        for (int i=0;i<arrayList.size();i++){
            arrayList.set(i,"Hola");

        }

        System.out.println("La lista queda asi: "+arrayList);
    }
}

