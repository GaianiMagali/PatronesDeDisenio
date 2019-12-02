package com.company;

public class Reproduccion implements Modo {
    private Mp3 mp3;

    public Reproduccion(Mp3 mp3) {
        this.mp3 = mp3;
    }

    @Override
    public String reproducir(int numeroCancion) {
        return "Reproduciendo " +  mp3.getCancionEnReproduccion().getNombre();
    }

    @Override
    public String pausar() {
        mp3.setModo(mp3.getPausa());
        return "Cancion en pausa";
    }

    @Override
    public void parar() {
        mp3.setModo(mp3.getSeleccion());
    }


    @Override
    public String toString() {
        return "Reproduccion";
    }
}
