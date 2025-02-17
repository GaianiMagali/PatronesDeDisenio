package com.company;

import java.util.ArrayList;
import java.util.List;

public class Mp3 {
    private List<Cancion> canciones;
    private Cancion cancionEnReproduccion;
    //Estados
    private Seleccion seleccion;
    private Pausa pausa;
    private Reproduccion reproduccion;
    //Estado del Mp3
    private Modo modo;

    public Mp3() {
        canciones = new ArrayList<>();
        seleccion = new Seleccion(this);
        pausa = new Pausa(this);
        reproduccion = new Reproduccion(this);
        modo = seleccion;
    }

    public void cargarCancion(Cancion cancion){
        canciones.add(cancion);
    }

    public void seleccionarCancion(int numero){
        cancionEnReproduccion = canciones.get(numero);
    }

    public Cancion getCancionEnReproduccion() {
        return cancionEnReproduccion;
    }

    public void setModo(Modo modo){
        this.modo = modo;
    }

    public Seleccion getSeleccion() {
        return seleccion;
    }

    public Pausa getPausa(){
        return pausa;
    }

    public Reproduccion getReproduccion(){
        return reproduccion;
    }

    public Modo getModo(){
        return modo;
    }

    public String reproducir(int numeroCancion){
        return modo.reproducir(numeroCancion);
    }

    public String pausar(){
        return modo.pausar();
    }

    public void parar(){
        modo.parar();
    }
}
