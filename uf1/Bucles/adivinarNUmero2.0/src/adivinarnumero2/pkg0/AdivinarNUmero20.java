/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivinarnumero2.pkg0;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author regig
 */
public class AdivinarNUmero20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        Scanner teclado = new Scanner(System.in);
        int numRandom = r.nextInt(50)+1;
        int numIntroducido, contIntentos=0;
        System.out.println("El numero random es: " + numRandom);
        do{
            System.out.println("Adivina el numero: " );
            numIntroducido = teclado.nextInt();
            if(numIntroducido > numRandom){
                System.out.println("El numero es menor a -> " + numIntroducido);
            }
            else if(numIntroducido < numRandom){
                System.out.println("El numero es mayor a -> " + numIntroducido);
            }
            contIntentos++;
        }while(numIntroducido != numRandom && contIntentos <= 8);
        if(numIntroducido == numRandom){
            System.out.println("Has acertado el numero es: " + numRandom);
            System.out.println("Numero de intentos: " + contIntentos);
        }
        else{
            System.out.println("Loser!!!!");
        }
        
    }
    
}
