package ejercicios.impares;
import java.util.Scanner;
public class Ejercicio_1 {
    public static void main(String[] args) {
        int edad;
        Scanner dato=new Scanner(System.in);
        System.out.println("Ingrese su edad");
        edad = dato.nextInt();
        if (edad >= 18) {
            System.out.println("Puede votar");
        }
        else 
            System.out.println("No puede votar");
    }
    
}
