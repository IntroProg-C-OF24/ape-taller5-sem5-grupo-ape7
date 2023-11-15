/*
Problema-8
Calculadora de IMC: Calcular el índice de masa corporal (IMC) de una persona y 
clasificarla en función de su valor (bajo peso, peso normal, sobrepeso, etc.).
 */
package taller_5;

import java.util.Scanner;

public class Problema_8 {

    public static void main(String[] args) {
        double peso, altura, imc;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese peso en Kg");
        peso = teclado.nextDouble();
        System.out.println("Ingrese altura en metros");
        altura = teclado.nextDouble();
        imc = peso / (Math.pow(altura, 2));
        System.out.println("Su masa corporal es: " + imc);
        if (imc > 30) {
            System.out.println("Obesidad");
        } else {
            if (imc > 26) {
                System.out.println("Sobrepeso");
            } else {
                if (imc > 20) {
                    System.out.println("Saludable");
                } else {
                    System.out.println("Bajo peso");
                }
            }
        }
    }
}
