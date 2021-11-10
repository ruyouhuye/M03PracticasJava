/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici14numeromesgranigual;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici14numeromesgranigual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num1, num2;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduzca un numero: ");
        num1 = teclado.nextDouble();
        
        System.out.println("Introduce otro numero");
        num2 = teclado.nextDouble();
        
        if(num1 > num2){
            System.out.println("El "+ num1 + " es mayor que el " + num2);
        }
        else if(num2 > num1){
            System.out.println("El "+ num2 + " es mayor que el " + num1);
        }
        else if(num1 == num2){
            System.out.println("El "+ num1 + " es igual que el " + num2);
        }
    }
    
}
