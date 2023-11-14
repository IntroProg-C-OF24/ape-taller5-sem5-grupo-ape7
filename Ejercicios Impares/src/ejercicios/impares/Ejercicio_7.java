package ejercicios.impares;

import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int calificacionu ;
        System.out.println("Ingrese su calificacion");
        calificacionu = tc.nextInt();
        if (calificacionu >= 90 && calificacionu <= 100) 
            System.out.println("Tu calificacion es A"); 
        else 
            if (calificacionu >= 80 && calificacionu <= 89) 
                System.out.println("Tu calificacion es B"); 
            else
                if (calificacionu >= 70 && calificacionu <= 79) 
                    System.out.println("Tu calificacion es C");
                else
                    if (calificacionu >= 60 && calificacionu <= 69) 
                        System.out.println("Tu calificacion es D");
                    else
                        if (calificacionu >= 50 && calificacionu <= 59) 
                            System.out.println("Tu calificacion es E");
                        
    }
}