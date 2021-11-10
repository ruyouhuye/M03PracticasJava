/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.mostrarfactorial;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class MostrarFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realiza un programa que lea un número positivo N y calcule y 
        visualice su factorial N*/
        int num, i;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el numero a factorizar: ");
        num = teclado.nextInt();
        for (i = num; i >= num; i--) {
            System.out.println(i);
        }
    }
    
}
