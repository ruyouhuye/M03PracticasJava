/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg11.sumaparesimpares;

/**
 *
 * @author regig
 */
public class SumaParesImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realiza un programa que sume independientemente los pares y los 
        impares de los números comprendidos entre 100 y 200, y luego muestra por
        pantalla ambas sumas*/
        int cont, sumaPar=0, sumaImpar=0;
        
        for (cont = 100; cont <= 200; cont++) {
            System.out.println("Numeros: " + cont);
            if(cont%2==0){
                sumaPar = sumaPar + cont;
            }
            else{
                sumaImpar = sumaImpar + cont;
            }
        }
        System.out.println("La suma de todos los pares es: " + sumaPar);
        System.out.println("La suma de todos los impares es: " + sumaImpar);
    }
    
}
