/* Problema 4
Descuento en Compras: Calcular el precio final de un producto con un descuento 
del 10% si el precio original es mayor de $100; de lo contrario, no hay 
descuento.
 */
package taller_5;

import java.util.Scanner;

public class Problema_4 {

    public static void main(String[] args) {
        double precio, descuento, total;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese precio del producto");
        precio = teclado.nextInt();
        if (precio > 100) {
            descuento = precio * 0.1;
            total = precio - descuento;
        } else {
            total = precio;
        }
        System.out.println("Precio final: " + total);
    }
}
