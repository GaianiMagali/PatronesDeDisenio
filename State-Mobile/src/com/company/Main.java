package com.company;

public class Main {

    public static void main(String[] args) {

        EstadoAlerta estadoAlerta = new EstadoAlerta();

        estadoAlerta.alerta();

        estadoAlerta.setEstado(new Silenciado());

        estadoAlerta.alerta();

    }
}
