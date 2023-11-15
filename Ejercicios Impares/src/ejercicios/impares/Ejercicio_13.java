package ejercicios.impares;

import java.util.Scanner;

public class Ejercicio_13 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        String marca, origen;
        double costo, impuesto = 0;
        System.out.println("Ingresa las caracteristicas de tu vehiculo");
        System.out.println("Ingresa su marca");
        marca = tc.nextLine();
        System.out.println("Ingresa el pais de origen del vehiculo");
        origen = tc.nextLine();
        System.out.println("Ingresa su costo");
        costo = tc.nextDouble();
        if (origen.equals("Alemania")) {
            impuesto = costo * 0.2;
            costo = costo + impuesto;
        } else {
            if (origen.equals("Japon")) {
                impuesto = costo * 0.3;
                costo = costo + impuesto;
            } else {
                if (origen.equals("Italia")) {
                    impuesto = costo * 0.15;
                    costo = costo + impuesto;
                } else {
                    if (origen.equals("USA")) {
                        impuesto = costo * 0.08;
                        costo = costo + impuesto;
                    }
                }
            }
            System.out.println("IMPUESTO " + marca + ": " + impuesto);
            System.out.println("TOTAL: " + costo);
        }
    }
}    
