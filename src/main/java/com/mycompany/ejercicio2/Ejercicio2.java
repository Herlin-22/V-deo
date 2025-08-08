/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Herlin
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("Herlin de Leon");
                Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese  número ");
        int numero = sc.nextInt();
        if (numero < 0) {
            System.out.println("Error: el número debe ser positivo");
        } else if (numero < 10) {
            System.out.println("El numero tiene 1 cifra");
        } else if (numero < 100) {
            System.out.println(" El numero tiene 2 cifrs");
        } else if (numero < 1000) {
            System.out.println(" El numero tiene 3 cifrs");
        } else {
            System.out.println("Error: el número tiene más de 3 cifrs");
        }
    }
}
    

