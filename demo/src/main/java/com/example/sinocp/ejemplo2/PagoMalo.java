package com.example.sinocp.ejemplo2;

public class PagoMalo {
    public void procesar(String metodo, double monto) {
        if (metodo.equals("EFECTIVO")) {
            System.out.println("Pagando $" + monto + " en efectivo");
        } else if (metodo.equals("TARJETA")) {
            System.out.println("Pagando $" + monto + " con tarjeta");
        }
    }
}
