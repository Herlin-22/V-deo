
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Herlin
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner lector = new Scanner(System.in);
        char opcion;
        int num1, num2;

        System.out.println("-- OPERACIONES --");
        System.out.println("S = Sumar | R = Restar | M = Multiplicar | D = Dividir");
        opcion = lector.next().charAt(0);

        if (opcion == 'S' || opcion == 's' || opcion == 'R' || opcion == 'r' || opcion == 'M' || opcion == 'm' || opcion == 'D' || opcion == 'd') {
            System.out.print("Ingrese primer número: ");
            num1 = lector.nextInt();
            System.out.print("Ingrese segundo número: ");
            num2 = lector.nextInt();

            if (opcion == 'S' || opcion == 's')
                System.out.println("Resultado: " + (num1 + num2));
            else if (opcion == 'R' || opcion == 'r')
                System.out.println("Resultado: " + (num1 - num2));
            else if (opcion == 'M' || opcion == 'm')
                System.out.println("Resultado: " + (num1 * num2));
            else if (opcion == 'D' || opcion == 'd') {
                if (num2 != 0)
                    System.out.println("Resultado: " + (num1 / num2));
                else
                    System.out.println("No se puede dividir entre cero.");
            }
        } else {
            System.out.println("Opción no válida.");
        }
    }
}
    
