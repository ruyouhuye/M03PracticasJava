/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.parar0negativopositivo;

import java.util.Scanner;

/**
 *
 * @author regig
 */
public class Parar0negativoPositivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realiza un programa que lea una secuencia de números no nulos hasta 
        que se introduzca un 0, y luego muestre si ha leído algún número 
        negativo, cuantos positivos y cuantos negativos. */
        int num, postivos=0, negativos = 0;
        Scanner teclado = new Scanner(System.in);
        
        do{
            System.out.print("Introduce un numero: ");
            num = teclado.nextInt();
            if(num != 0){
                if(num<0){
                    negativos++;
                }
                else{
                    postivos++;
                }
            }
        }while(num != 0);
        if(negativos != 0){
            System.out.println("Hay numeros negativos");
            System.out.println("Negativos: " + negativos);
        }                            
        System.out.println("Positivos: " + postivos);
    }
    
}
