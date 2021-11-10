/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercici5circumfenrecia;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercici5circumfenrecia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dibuja un ordinograma que toma como dato de entrada un número que 
        corresponde a la longitud de un radio y nos escribe la longitud de la 
        circunferencia, el área del círculo y el volumen de la esfera que c
        orresponden con dicho radio.*/
        double radio, pi, longitud, area, volumen;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca radio: ");
        radio = teclado.nextDouble();
        pi = 3.1416;
        longitud = 2 * radio * pi;
        area = pi * radio * radio;
        volumen = 4/3 * pi * radio * radio * radio;
        System.out.println("La longitud es: " + longitud + ", la area es: " + area + ", el volumen es: " + volumen);
    }
    
}
