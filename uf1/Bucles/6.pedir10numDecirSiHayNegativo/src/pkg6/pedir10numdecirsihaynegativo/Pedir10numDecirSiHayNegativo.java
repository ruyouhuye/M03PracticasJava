/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6.pedir10numdecirsihaynegativo;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Pedir10numDecirSiHayNegativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*pedir 10 nums y decir si hay algun negativo*/
        int num, cont;
        boolean negativo=false;
        Scanner teclado = new Scanner(System.in);
        
        for (cont = 1; cont <= 10; cont++) {
            System.out.print("Introduce un numero: ");
            num = teclado.nextInt();
            if(num<0){
                negativo=true;
            }
        }
        if(negativo == true){
            System.out.println("Hay un numero negativo.");
        }
        else{
            System.out.println("Todos los numeros son positivos");
        }
    }
    
}
