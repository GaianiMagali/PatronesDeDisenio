package com.company;

public class Pausa implements Modo{
    private Mp3 mp3;

    public Pausa(Mp3 mp3) {
        this.mp3 = mp3;
    }

    @Override
    public String reproducir(int numeroCancion) {
        return mp3.getCancionEnReproduccion().reproducir();
    }

    @Override
    public String pausar() {
        return "Ya se encuentra en pausa";
    }

    @Override
    public void parar() {
        mp3.setModo(mp3.getSeleccion());
    }

    @Override
    public String toString() {
        return "Pausa" ;
    }
}
