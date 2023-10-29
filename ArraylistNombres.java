package com.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraylistNombres {

    public static void main(String[] args) {

        List <Personas> nombres = new ArrayList<Personas>();
        nombres.add(new Personas("Sebastian"));
        nombres.add(new Personas("Julia"));
        nombres.add(new Personas("Carlos"));
        nombres.add(new Personas("Juan"));
        nombres.add(new Personas("Camila"));


        System.out.println("----6.Cambiar segundo elemto por 'Ana'------");
        nombres.get(1).setNombre("Ana");
        System.out.println("La nueva lista es: ");
        for (Personas x: nombres){

            System.out.println(x.getNombre());
        }


        System.out.println("-----7.Lista sin el primer elemento-------");
        nombres.remove(0);
        System.out.println("La lista queda asi: ");
        for (Personas y : nombres){
            System.out.println(y.getNombre());

        }


        System.out.println("------9.Verificar si esta Carlos------");
        String nombreBuscado = "Carlos";
        Personas personaBuscada = new Personas(nombreBuscado);
        
        if (nombres.contains(personaBuscada)) {
            System.out.println(nombreBuscado + " está presente en la lista de personas.");
        } else {
            System.out.println(nombreBuscado + " no está presente en la lista de personas.");
        }


        System.out.println("-----13.Añadir Pedro-----");
        Personas pedro = new Personas("Pedro");
        nombres.add(1,pedro);
        System.out.println("La nueva lista es: ");
        for (Personas n: nombres){
            
            System.out.println(n.getNombre());
        }

        System.out.println("-----15.Orden Afabeticamente-----");
        Collections.sort(nombres);
        for (Personas nombre: nombres) {
            System.out.println(nombre.getNombre());
        }


        

    }
    
}
