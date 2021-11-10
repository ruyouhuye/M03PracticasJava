/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici15mayordetresnums;

import java.util.Scanner;

/**
 *
 * @author regig
 */
public class Exercici15mayordetresnums {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dibuja un ordinograma que lea tres números distintos y nos diga 
        cuál es el mayor.*/
        double n1, n2, n3;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primer numero: ");
        n1 = teclado.nextDouble();

        System.out.println("Introduce el segundo numero: ");
        n2 = teclado.nextDouble();

        System.out.println("Introduce el tercer numero: ");
        n3 = teclado.nextDouble();

        if ((n1 >= n2) && (n1 >= n3)) {
            System.out.println("El mayor numero es: " + n1);
        } else if ((n2 >= n1) && (n2 >= n3)) {
            System.out.println("El mayorr numero es: " + n2);
        } else {
            System.out.println("El mayorrr numero es: " + n3);
        }
    }

}
