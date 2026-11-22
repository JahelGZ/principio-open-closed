package com.example;

import com.example.ocp.ejemplo1.Gato;
import com.example.ocp.ejemplo1.Perro;
import com.example.ocp.ejemplo1.ReproductorSonido;
import com.example.ocp.ejemplo2.Caja;
import com.example.ocp.ejemplo2.PagoEfectivo;
import com.example.ocp.ejemplo2.PagoTarjeta;
import com.example.sinocp.ejemplo1.SonidoAnimalMalo;
import com.example.sinocp.ejemplo2.PagoMalo;

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

        System.out.println();
        System.out.println("OCP - Ejemplo 2: Metodos de pago");

        Caja caja = new Caja();
        caja.cobrar(new PagoEfectivo(), 25000);
        caja.cobrar(new PagoTarjeta(), 80000);

        System.out.println();
        System.out.println("SINOCP - Ejemplo 2: Metodos de pago");

        PagoMalo pagoMalo = new PagoMalo();
        pagoMalo.procesar("EFECTIVO", 25000);
        pagoMalo.procesar("TARJETA", 80000);
    }
}
