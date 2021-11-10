/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivinarnumero;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class AdivinarNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
        Scanner teclado = new Scanner(System.in);
        int numRandom = r.nextInt(50)+1;
        int numIntroducido;
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
        }while(numIntroducido == numRandom);
        System.out.println("Has acertado el numero es: " + numRandom);
    }
    
}
