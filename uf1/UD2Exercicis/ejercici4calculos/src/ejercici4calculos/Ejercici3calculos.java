/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercici4calculos;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercici3calculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Dibuja un ordinograma que lea dos números, calcule y muestre el valor de sus 
        //suma, resta, producto y división.
        double num1, num2, suma, resta, multi, divi;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        num1 = teclado.nextDouble();
        
        System.out.println("Introduzca otro numero: ");
        num2 = teclado.nextDouble();
        //poniento (int) o (double) delante puedes cambiar el "valor" del resultadp
        suma = (int)num1 + num2;
        resta = num1 - num2;
        multi = num1 * num2;
        divi = num1 / num2;
        System.out.println("La suma es: "+suma+", la resta es: "+resta+", la multiplicacion es: "+multi+ ", la divison es: "+divi);
    }
    
}
