package com.example.sinocp.ejemplo1;

public class SonidoAnimalMalo {
    public void emitirSonido(String animal) {
        if (animal.equals("PERRO")) {
            System.out.println("Guau!");
        } else if (animal.equals("GATO")) {
            System.out.println("Miau!");
        }
    }
}
