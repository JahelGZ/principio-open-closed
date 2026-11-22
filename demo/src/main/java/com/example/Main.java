package com.example;

import com.example.ocp.ejemplo1.Gato;
import com.example.ocp.ejemplo1.Perro;
import com.example.ocp.ejemplo1.ReproductorSonido;
import com.example.sinocp.ejemplo1.SonidoAnimalMalo;

public class Main {
    public static void main(String[] args) {
        System.out.println("OCP - Ejemplo 1: Sonidos de animales");

        ReproductorSonido reproductor = new ReproductorSonido();
        reproductor.reproducir(new Perro());
        reproductor.reproducir(new Gato());

        System.out.println();
        System.out.println("SINOCP - Ejemplo 1: Sonidos de animales");
        SonidoAnimalMalo animalMalo = new SonidoAnimalMalo();
        animalMalo.emitirSonido("PERRO");
        animalMalo.emitirSonido("GATO");
    }
}