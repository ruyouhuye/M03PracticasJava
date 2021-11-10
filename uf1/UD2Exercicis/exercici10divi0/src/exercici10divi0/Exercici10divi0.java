/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici10divi0;

import java.util.Scanner;

/**
 *
 * @author regig
 */
public class Exercici10divi0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dibuja un ordinograma que lee dos números, calcula y muestra el valor 
        de su suma, resta, producto y división. (Ten en cuenta la división 
        por cero ).*/
        double num1, num2, suma, resta, multi, divi;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduzca un numero: ");
        num1 = teclado.nextDouble();
        
        System.out.println("Introduce otro numero");
        num2 = teclado.nextDouble();
        
        suma = num1 + num2;
        resta = num1 - num2;
        multi = num1 * num2;
        
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multi);
        
        if(num2 == 0){
            System.out.println("No puedo hacer la division");
            
        }
        else{
            divi = num1 / num2;
            System.out.println("La division es: " + divi);
        }
        
    }
    
}
