
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Herlin
 */
public class ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        Scanner entrada = new Scanner(System.in);

        // Pedir al usuario que escriba una letra
        System.out.print("Escribe una letra: ");
        char letraIngresada = entrada.next().toLowerCase().charAt(0);

        // Verificar si es una vocal o no
        if (letraIngresada == 'a' || letraIngresada == 'e' || letraIngresada == 'i' || 
            letraIngresada == 'o' || letraIngresada == 'u') {
            System.out.println("La letra es una vocal.");
        } else {
            System.out.println("La letra es una consonante.");
        }
    }
}
    
//CAMBIOS PARA LA COMPUTADOR VIRTUAL
//SOLO PRUEBA