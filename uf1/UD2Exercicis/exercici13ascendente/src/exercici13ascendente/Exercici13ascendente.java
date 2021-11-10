/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici13ascendente;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici13ascendente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dibuja un ordinograma de un programa que lee dos números 
        y los visualiza en orden ascendente.*/
        double num1, num2;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduzca un numero: ");
        num1 = teclado.nextDouble();
        
        System.out.println("Introduce otro numero");
        num2 = teclado.nextDouble();
        
        if(num1 > num2){
            System.out.println("Orden ascendente: "+ num2 + " , " + num1);
        }
        else{
            System.out.println("Orden ascendente: "+ num1 + " , " + num2);
        }
    }
    
}
