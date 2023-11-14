package ejercicios.impares;
import java.util.Scanner;
public class Ejercicio_3 {
    public static void main(String[] args) {
                int num1,num2,num3,max;
        Scanner dato=new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        num1 = dato.nextInt();
        System.out.println("Ingrese segundo numero");
        num2 = dato.nextInt();
        System.out.println("Ingrese tercer numero");
        num3 = dato.nextInt();
        if (num1>num3) {
            max=num1;  
        }
        else
            max=num3;
        if (max>num2) {
            System.out.println("El mayor es: "+max);
        }
        else
            System.out.println("El mayor es: "+num2);
    }
    
}
