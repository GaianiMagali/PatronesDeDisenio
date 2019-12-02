package com.Java.Ejercicio4;

import com.Java.Ejercicio4.Estados.Apagado;
import com.Java.Ejercicio4.Estados.Encendido;
import com.Java.Ejercicio4.Estados.EstadoTelevision;
import com.Java.Ejercicio4.Estados.Silenciado;

public class Television {
    public final static int VOLUMEN_MAXIMO = 100;
    public final static int VOLUMEN_MINIMO = 2;


    private int nivelVolumen;
    private EstadoTelevision estado;

    private EstadoTelevision apagado = new Apagado(this);
    private EstadoTelevision encendido = new Encendido(this);
    private EstadoTelevision silenciado = new Silenciado(this);



    public Television(){
        setEstadoApagado();
    }

    public void encender(){
        estado.encender();
    }

    public void apagar(){
        estado.apagar();
    }

    public void subirVolumen(int cantidad){
        estado.subirVolumen(cantidad);
    }

    public void bajarVolumen(int cantidad){
        estado.bajarVolumen(cantidad);
    }

    public void silenciar(){
        estado.silenciar();
    }

    public void activarSonido(){
        estado.activarSonido();
    }

    public void setEstadoApagado() {
        this.estado = apagado;
    }

    public void setEstadoEncendido() {
        this.estado = encendido;
    }

    public void setEstadoSilenciado() {
        this.estado = silenciado;
    }

    public int getNivelVolumen() {
        return nivelVolumen;
    }

    public void setNivelVolumen(int nivelVolumen) {
        this.nivelVolumen = nivelVolumen;
    }

    public EstadoTelevision getEstado() {
        return estado;
    }



/*
    public void encender() {
        if (!encendido) {
            encendido = true;
        }
        else {
            System.out.println("TV encendida");
        }
    };

    public void apagar() {
        if (encendido) {
            encendido = false;
        }
        else {
            System.out.println("TV apagada");
        }
    }

    public void subirVolumen(int cantidad) {
        if (encendido && !silenciado && (nivelVolumen < VOLUMEN_MAXIMO)) {
            nivelVolumen += cantidad;
            if (nivelVolumen > VOLUMEN_MAXIMO)
                nivelVolumen = VOLUMEN_MAXIMO;
        } else if (!encendido) {
            System.out.println("TV apagada");
        } if (nivelVolumen >= VOLUMEN_MAXIMO) {
            System.out.println("TV volumen máximo");
        } else {
            System.out.println("TV silenciada");
        }
    }

    public void bajarVolumen(int cantidad) {
        if (encendido && !silenciado && (nivelVolumen > VOLUMEN_MINIMO)) {
            nivelVolumen -= cantidad;
            if (nivelVolumen < VOLUMEN_MINIMO)
                nivelVolumen = VOLUMEN_MINIMO;
        } else if (!encendido) {
            System.out.println("TV apagada");
        } if (nivelVolumen >= VOLUMEN_MAXIMO) {
            System.out.println("TV volumen mínimo");
        } else {
            System.out.println("TV silenciada");
        }
    }

    public void silenciar() {
        if (encendido && !silenciado) {
            silenciado = true;
        } else if (!encendido) {
            System.out.println("TV apagada");
        } else {
            System.out.println("TV silenciada");
        }
    }

    public void activarSonido() {
        if (encendido && silenciado) {
            silenciado = false;
        } else if (!encendido) {
            System.out.println("TV apagada");
        } else {
            System.out.println("TV sonido activado");
        }
    }

 */

}
