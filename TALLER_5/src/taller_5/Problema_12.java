/*
Problema 12
Solución que imprima el costo de un pedido de un artículo del cual se tiene la 
descripción, la cantidad que se requiere y el precio unitario. Si la cantidad 
pedida excede de 50 unidades, se hace un descuento de 15%.
 */
package taller_5;

import java.util.Scanner;

public class Problema_12 {

    public static void main(String[] args) {
        int cantidad;
        double precio, costo;
        String descripcion;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Descripcion del articulo: ");
        descripcion = teclado.nextLine();
        System.out.print("Cantidad requerida: ");
        cantidad = teclado.nextInt();
        System.out.print("Ingrese precio unitario: ");
        precio = teclado.nextDouble();
        costo = cantidad * precio;
        if (cantidad > 50) {
            costo *= 0.85;
            System.out.println("Se aplica descuento, el costo final de los: " + cantidad + descripcion + " es de " + costo);
        } else {
            System.out.println("El costo de los  " + cantidad + descripcion + " es de " + costo);
        }
    }
}
