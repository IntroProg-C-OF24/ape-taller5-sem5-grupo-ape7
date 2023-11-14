package ejercicios.impares;
import java.util.Scanner;
public class Ejercici0_5 {
    public static void main(String[] args) {
                int anio;
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese el año");
        anio = dato.nextInt();
        if (anio % 4 == 0) {
            if (anio % 400 == 0 & anio % 100 == 0) {
                System.out.println("El año es bisiesto");
            } else {
                if (anio % 400 != 0 & anio % 100 != 0) {
                    System.out.println("El año es bisiesto");
                } else {
                    System.out.println("El año no es bisiesto");
                }
            }
        } else {
            System.out.println("El año no es bisiesto");
        }

    }
    
}
