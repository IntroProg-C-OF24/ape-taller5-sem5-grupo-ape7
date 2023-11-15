/* 
Problema 14
En una hosteria de la ciudad de Loja se hace un descuento del 10% si el cliente 
se hospeda más de 5 días, del 15% si se hospeda más de 10 días y del 20% si se 
hospeda más de 15 días. Elaborar un solución que pida como datos de entrada el 
número de días y el precio diario de la habitación y luego calcule e imprima el 
subtotal por pagar, el descuento y el total por pagar.
 */
package taller_5;

import java.util.Scanner;

public class Problema_14 {

    public static void main(String[] args) {
        int dias;
        double descuento, precioHabitacion, subTotal;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantos dias se queda?");
        dias = teclado.nextInt();
        System.out.println("Precio de la habitacion");
        precioHabitacion = teclado.nextDouble();
        if (dias > 5) {
            descuento = dias * 0.1;
        } else if (dias > 10) {
            descuento = dias * 0.15;
        } else if (dias > 15) {
            descuento = dias * 0.2;
        } else {
            descuento = 0;
        }
        subTotal = (dias * precioHabitacion) - descuento;
        System.out.println("Precio total es: " + subTotal);
    }

}
