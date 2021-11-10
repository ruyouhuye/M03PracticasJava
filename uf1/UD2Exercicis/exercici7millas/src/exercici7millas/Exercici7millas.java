/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici7millas;

import java.util.Scanner;

/**
 *
 * @author regig
 */
public class Exercici7millas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dibuja un ordinograma que lea un valor correspondiente a una 
        distancia en millas marinas y escriba la distancia en metros. 
        Sabiendo que una milla marina equivale a 1.852 metros.*/
        double metros, millas;
        final double millamarina = 1852;//final para que sea invariable
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca las millas: ");// precio articulo lo que vale
        millas = teclado.nextDouble(); 
        metros = millas * millamarina;
        System.out.println(millas + " Millas marinas son: " + metros + "metros");
    }
    
}
