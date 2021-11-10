/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud7ex11introducirnummostarartablamultiplicacion;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ud7ex11IntroducirNumMostararTablaMultiplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realiza un programa que escriba la tabla de multiplicar de un número 
        introducido por teclado. Para ello implementa una función que reciba 
        como parámetro un número entero y muestre por pantalla la tabla de 
        multiplicar de dicho número.*/
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la tabla que quieres que te muestre: ");
        num = sc.nextInt();
        tablaMultiplicacion(num);
    }

    public static void tablaMultiplicacion(int num) {
        int cont, resultado;
        for (cont = 0; cont <= 10; cont++) {
            resultado = cont * num;
            System.out.println("For: " + num +" * " + cont + " = " + resultado);
        }
    }
    
}
