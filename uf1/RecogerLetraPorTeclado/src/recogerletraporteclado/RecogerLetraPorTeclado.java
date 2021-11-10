/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recogerletraporteclado;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class RecogerLetraPorTeclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Eres mayor de edad?");
        char mayorEdad;
        int dinero;
        /*recoge la frase que pongas pero devuelve 
        la letra que esta en la primera posicion*/
        mayorEdad = teclado.nextLine().charAt(0);
        System.out.println("Has escogido " + mayorEdad);
        
        System.out.println("Cuanto dinero tienes?");
        dinero= teclado.nextInt();
        
        if(((mayorEdad == 's') || (mayorEdad == 'S')) && (dinero >= 10)){
            System.out.println("Cual es el cafe mas peligroso del mundo?\n" + "El ex-preso");
        }
        else if((mayorEdad == 'n') || (mayorEdad == 'N')){
            System.out.println("Que le dice un jaguar a otro?\n" + "Jaguar you");
        }
        else{
            System.out.println("Opcion incorrecta");
        }
    }
    
}
