package com.example;

import java.util.List;
import java.util.ArrayList;

public class ArraylistNum2 {
    public static void main(String[] args) {
        
        List<Enteros> num = new ArrayList<Enteros>();
        num.add(new Enteros(5));
        num.add(new Enteros(10));
        num.add(new Enteros(15));
        
        System.out.println("-----18.Array numeros----");
        System.out.println("Lista: ");
        for (Enteros n: num){
            System.out.println(n.getNumero());
        }
    }

}
