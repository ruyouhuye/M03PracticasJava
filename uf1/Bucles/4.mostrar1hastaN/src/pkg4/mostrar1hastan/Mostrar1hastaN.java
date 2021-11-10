/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4.mostrar1hastan;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Mostrar1hastaN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*mostar 1 hasta numero introducido*/
        int tope, cont;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce hasta donde quieres contar: ");
        tope = teclado.nextInt();
        
        for (cont = 0; cont <= tope; cont++) {
            System.out.println("Numero: " + cont);
        }
    }
    
}
