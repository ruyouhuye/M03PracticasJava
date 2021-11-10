/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7.perdir10numesdecircuantospositivosnegativos;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Perdir10numesDecirCuantosPositivosNegativos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*pedir 10 nums y decir si hay algun negativo*/
        int num, cont, postivos=0, negativos = 0;
        Scanner teclado = new Scanner(System.in);
        
        for (cont = 1; cont <= 10; cont++) {
            System.out.print("Introduce un numero: ");
            num = teclado.nextInt();
            if(num<0){
                negativos++;
            }
            else{
                postivos++;
            }
        }
        System.out.println("Negativos: " + negativos);
        System.out.println("Positivos: " + postivos);
    }
    
}
