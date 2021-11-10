/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici12positiunegatiu;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici12positiunegatiu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dibuja el ordinograma de un programa que lee un número y me dice si
        es positivo o negativo, consideraremos el cero como positivo.*/
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");// precio articulo lo que vale
        num = teclado.nextInt();
        if(num >= 0){
            System.out.println("El numero es postiu");
        }
        else{
            System.out.println("El numero es negatiu");
        }
    }
    
}
