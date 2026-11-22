package com.example.ocp.ejemplo2;

public class Caja {
    public void cobrar(MetodoPago metodo, double monto) {
        metodo.pagar(monto);
    }
}
