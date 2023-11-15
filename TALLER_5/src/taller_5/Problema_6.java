/*
Problema-6
Categoría de Edad: Clasificar a una persona en una categoría de edad
(niño, adolescente, adulto) en función de su edad.
 */
package taller_5;

import java.util.Scanner;

public class Probelma_6 {

    public static void main(String[] args) {
        int edad;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la edad");
        edad = teclado.nextInt();
        if (edad < 11) {
            System.out.println("Ninio");
        } else if (edad > 18) {
            System.out.println("Adulto");
        } else {
            System.out.println("Adolescente");
        }
    }
}
