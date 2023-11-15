/* Problema 2
Día de la Semana: Mostrar el nombre del día de la semana en función del número 
ingresado (1 para lunes, 2 para martes, etc.).
*/
package taller_5;
import java.util.Scanner;
public class Problema_2 {
    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese un numero");
        num = teclado.nextInt();
        if (num == 1)
            System.out.println("Lunes");
        else 
            if (num == 2)
                System.out.println("Martes");
            else 
                if (num == 3)
                    System.out.println("Miércoles");
                else 
                    if (num == 4)
                        System.out.println("Jueves");
                    else 
                        if (num == 5)
                            System.out.println("Viernes");
                        else
                            if (num == 6)
                                System.out.println("Sabado");
                            else 
                                if (num == 7)
                                    System.out.println("Domingo");
    }
}
