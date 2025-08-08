
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Herlin
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        // Pedir el monto de la compra al usuario
        System.out.print("¿Cuánto fue el total de tu compra? Q");
        double monto = sc.nextDouble();
        double descuento;

        // Determinar el porcentaje de descuento según el monto
        if (monto < 500) {
            descuento = 0;
        } else if (monto <= 1000) {
            descuento = 0.05;
        } else if (monto <= 7000) {
            descuento = 0.11;
        } else if (monto <= 15000) {
            descuento = 0.18;
        } else {
            descuento = 0.25;
        }

        // Calcular el total a pagar aplicando el descuento
        double total = monto - (monto * descuento);

        // Mostrar los resultados al usuario
        System.out.println("Tienes un descuento del " + (descuento * 100) + "%");
        System.out.println("El total que debes pagar es: Q" + total);
    }
}
    
