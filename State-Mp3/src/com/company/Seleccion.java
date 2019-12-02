package com.company;

public class Seleccion implements Modo {
    private Mp3 mp3;

    public Seleccion(Mp3 mp3) {
        this.mp3 = mp3;
    }

    @Override
    public String reproducir(int numeroCancion) {
        mp3.seleccionarCancion(numeroCancion);
        mp3.setModo(mp3.getReproduccion());
        return  mp3.getCancionEnReproduccion().reproducir();
    }

    @Override
    public String pausar() {
        return "Todavia no se selecciono cancion a reproducir";
    }

    @Override
    public void parar() {
        System.out.println("Todavia no se selecciono cancion a reproducir");
    }

    @Override
    public String toString() {
        return "Seleccion";
    }
}
