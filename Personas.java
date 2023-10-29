package com.example;

public class Personas implements Comparable<Personas> {

    private String nombre;

    public Personas(){

    }

    public Personas(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public int compareTo(Personas perso2) {
        return this.nombre.compareTo(perso2.nombre);
        
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Personas personas = (Personas) obj;
        return nombre.equals(personas.nombre);
    
    }
}
