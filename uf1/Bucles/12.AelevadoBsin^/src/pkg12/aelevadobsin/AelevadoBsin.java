/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg12.aelevadobsin;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class AelevadoBsin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realiza un programa que calcule el valor A elevado a B (A^B) sin hacer
        uso del  operador  de potencia (^), siendo A y B valores introducidos 
        por teclado, y luego muestre el resultado por pantalla*/
        int base, exponente, cont, resultado=1;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce un numero: ");
        base = teclado.nextInt();
        System.out.print("Introduce exponente ^: ");
        exponente = teclado.nextInt();
        
        for (cont = 1; cont <= exponente; cont++) {
            resultado = resultado * base;    
        }
        System.out.println("El resultado es: " + resultado);
    }
    
}
