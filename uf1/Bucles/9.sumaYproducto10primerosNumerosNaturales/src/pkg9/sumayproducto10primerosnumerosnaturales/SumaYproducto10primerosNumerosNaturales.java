/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg9.sumayproducto10primerosnumerosnaturales;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class SumaYproducto10primerosNumerosNaturales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realiza un programa que calcule y escriba la suma y el producto de 
        los 10 primeros números naturales.*/
        int num, cont, suma10=0, producto10=1;
        Scanner teclado = new Scanner(System.in);
        
        for (num = 1; num <= 10; num++) {
            System.out.println(suma10 + " + " + num);
            suma10 = suma10 + num;
            System.out.println(producto10 +"*" + num);
            producto10 = producto10 * num;
            System.out.println("Fin vuelta");
        }
        
        System.out.println("La suma total es: " + suma10);
        System.out.println("El protucto total es: " + producto10);
    }
    
}
