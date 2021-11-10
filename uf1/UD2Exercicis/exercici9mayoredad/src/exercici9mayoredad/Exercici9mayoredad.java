/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici9mayoredad;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici9mayoredad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca tu edad: ");// precio articulo lo que vale
        edad = teclado.nextInt();
        if(edad >= 18){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Eres menor de edad");
        }
    }
    
}
