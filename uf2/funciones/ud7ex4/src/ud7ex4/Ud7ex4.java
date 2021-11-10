/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud7ex4;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ud7ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribe un programa que pida un número entero por teclado y muestre 
        por pantalla si es positivo, negativo o cero. Implementa y utiliza la función:
        int dimeSigno(int a) // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo*/
        int num;
        int signo;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        num = sc.nextInt();
        signo = saberSigno(num);
        if(signo == 0){
            System.out.println("El numero es zero.");
        }
        else if (signo == -1){
            System.out.println("El numero es negativo.");
        }
        else if (signo == 1){
            System.out.println("El numero es positivo.");
        }
    }

    public static int saberSigno(int num) {
        int signo=0, zero=0, negativo=-1, positivo=1;
        if(num==0){
            signo = zero;
        }
        else if(num<0){
            signo = negativo;
        }
        else if(num>0){
            signo = positivo;
        }
        return signo;
    }
    
}
