package ejercicios.impares;
import java.util.Scanner;
public class Ejercicio_11 {
    public static void main(String[] args) {
                double costokilov,kilovconsumido,resultado;
        int edad;
        Scanner dato=new Scanner(System.in);
        System.out.println("Ingrese el costo de kilovatio/hora");
        costokilov = dato.nextDouble();
        System.out.println("Ingrese el consumo de kilovatio en el mes");
        kilovconsumido = dato.nextDouble();
        System.out.println("Su edad");
        edad = dato.nextInt();
        resultado=costokilov*kilovconsumido;
        if (edad>=65) {
            double descuento=resultado*0.10;
            resultado=resultado - descuento;
            System.out.println("El valor a pagar es de: "+resultado);
        }
        else
            System.out.println("El valor a pagar es de: "+resultado);

    }
}
