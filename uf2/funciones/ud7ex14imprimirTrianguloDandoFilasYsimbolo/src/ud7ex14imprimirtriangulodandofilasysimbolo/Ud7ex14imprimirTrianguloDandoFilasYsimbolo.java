/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud7ex14imprimirtriangulodandofilasysimbolo;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ud7ex14imprimirTrianguloDandoFilasYsimbolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribe una función que muestre por pantalla un triángulo como el del 
        ejemplo. Deberá recibir dos parámetros: el carácter que se desea 
        imprimir y el número de líneas del triángulo.
             a
            aaa
           aaaaa
          aaaaaaa
        */
        char caracter;
        int numLineas;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el caracter que deseas imprimir: ");
        caracter = sc.nextLine().charAt(0);
        System.out.println("Introduce el numero de lineas: ");
        numLineas = sc.nextInt();
    }
    
}
