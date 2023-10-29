package com.example;

public class Enteros {
    
    private int numero;

    public Enteros(){

    }

    public Enteros(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    @Override
    public String toString() {
        
        return Integer.toString(numero);
    }
}
