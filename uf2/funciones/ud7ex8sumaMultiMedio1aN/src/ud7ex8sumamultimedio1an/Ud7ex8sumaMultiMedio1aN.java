/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud7ex8sumamultimedio1an;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ud7ex8sumaMultiMedio1aN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribe un programa que pida un valor N entero y luego muestre: el 
        sumatorio des 1 a N, el productorio de 1 a N y el valor intermedio entre
        1 y N. Implementa y utiliza las funciones:
        int suma1aN(int n) // Devuelve la suma de enteros de 1 a n
        int producto1aN(int n) // Devuelve el producto de enteros de 1 a n
        double intermedio1aN(int n) // Devuelve el valor intermedio entre 1 y n*/
        int num, suma, multi;
        double medio;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un numero: ");
        num = sc.nextInt();
        
        suma = sumaNum(num);
        System.out.println("La suma de 1 a "+num+" es: "+suma);
        
        multi = multiNum(num);
        System.out.println("La multiplicacion de 1 a "+num+" es: "+multi);
        
        medio = medioNum((double)num);
        System.out.println("El medio de 1 a "+num+" es: "+medio);
    }
    /**
     * calcula la suma de 1 hasta N es decir 1+2+3+4+..(hasta)..+N
     * @param num
     * @return 
     */
    public static int sumaNum(int num) {
        int resultadoSuma=0;
        for (int i = 1; i <= num; i++) {
            resultadoSuma = i + resultadoSuma;
        }
        return resultadoSuma;
    }
    /**
     * calcula la multi de 1 hasta N es decir 1*2*3*4*..(hasta)..*N
     * @param num
     * @return 
     */
    public static int multiNum(int num) {
        int resultadoMulti=1;
        for (int i = 1; i <= num; i++) {
            resultadoMulti = i * resultadoMulti;
        }
        return resultadoMulti;
    }

    public static double medioNum(double num) {
        double resultadoMedio;
        resultadoMedio = (1 + num)/2;
        return resultadoMedio;
    }
    
}
