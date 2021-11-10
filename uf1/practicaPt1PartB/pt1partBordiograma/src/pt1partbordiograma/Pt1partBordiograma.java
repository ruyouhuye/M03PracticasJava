/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pt1partbordiograma;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Pt1partBordiograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un numero: ");
        num = teclado.nextInt();
        if(num%2==0){
            if(num%3==0){
                System.out.println("El numero es par y divisible entre 3.");
            }
            else{
                System.out.println("El numero es par.");
            }
        }
        else{
            System.out.println("El numero es impar.");
        }
    }
    
}
