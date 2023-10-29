package com.example;

import java.util.List;
import java.util.ArrayList;

public class Arraylist {

    public static void main(String[] args) {
        
        List <Enteros> lista = new ArrayList <Enteros> ();
        lista.add(new Enteros(5));
        lista.add(new Enteros(20));
        lista.add(new Enteros(58));
        lista.add(new Enteros(69));
        lista.add(new Enteros(10));

        System.out.println("----10.Lista de numeros----");
        for (Enteros n:lista){
            System.out.println(n.getNumero());
        
        }

        for (int i=0; i<lista.size(); i++){
            int numOriginal = lista.get(i).getNumero();
            int numDuplicado = numOriginal *2;
            lista.get(i).setNumero(numDuplicado);
        }
        System.out.println("------11.Duplicar elementos------");
        System.out.println("ArrayList después de duplicar los elementos:");
        System.out.println(lista);






        int numeroMasGrande = lista.get(0).getNumero();

        for (Enteros num: lista){
            if (num.getNumero()>numeroMasGrande){
                numeroMasGrande = num.getNumero();
            }

        }
        System.out.println("-----3.Numero mas grande-----");
        System.out.println("El numero mas grande es: "+ numeroMasGrande);

        System.out.println("-----5.Tercer elemento------");
        int TercerElemento = lista.get(2).getNumero();
        System.out.println("El tercer numero es: "+ TercerElemento);


        for (int i = lista.size()-1; i >= 0; i--){
            int n = lista.get(i).getNumero();

            if (n % 2 == 0){
                lista.remove(i);
            }
        }
        System.out.println("----4.Lista sin pares----");
        System.out.println("Lista despues de quitar numeros pares: "+lista);

    }
    
}
