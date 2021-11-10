/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unoadoscientospares;

/**
 *
 * @author regig
 */
public class UnoADOscientosPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realiza un programa que muestre los números pares comprendidos entre
        el 1 y el 200. Esta vez utiliza un contador sumando de 1 en 1. */
        int cont;
        
        for (cont = 0; cont <= 200; cont++) {
            if(cont%2==0){
                System.out.println("Par: " + cont);
            }/*
            else{
                System.out.println("No par");
            }*/
        }
    }
    
}
