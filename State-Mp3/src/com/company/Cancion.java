package com.company;

public class Cancion {
    private String nombre;

    public Cancion(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public String reproducir(){
        return "Reproduciendo" + this.getNombre() + " en pausa";
    }

    public String pausar(){
        return "Cancion " + this.getNombre() + " en pausa";
    }

}
