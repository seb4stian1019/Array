package com.example;
import java.util.ArrayList;
import java.util.List;

public class Array5 {
    public static void main(String[] args) {
        
        List<ArrayList<Object>> listaPrincipal = new ArrayList<>();

       
        listaPrincipal.add(new ArrayList<>());
        listaPrincipal.add(new ArrayList<>());
        listaPrincipal.add(new ArrayList<>());

       System.out.println("-----20. 3 Array dentro de otro ArrayList-----");
        System.out.println("ArrayList principal: " + listaPrincipal);
    }
}
