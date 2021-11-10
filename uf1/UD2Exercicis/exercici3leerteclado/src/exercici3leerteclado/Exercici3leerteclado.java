/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici3leerteclado;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici3leerteclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Dibuja un ordinograma que calcule el área de un cuadrado 
        //cuyo lado se introduce por teclado.
        double lado, area;
        Scanner teclado = new Scanner(System.in);
        /* sirve para recoger datos por teclado
        y lo devuelve */
        System.out.println("Introduzca el lado: ");
        lado = teclado.nextDouble();
        area = lado*lado;
        System.out.println("El lado del cuadrado es: " + lado);
        System.out.println("Su area es: " + area);
    }
    
}
