/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionesdevuelvenvalores;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class FuncionesDevuelvenValores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorDoble, valorTriplicado;
        System.out.println("Pon un valor y lo doblare por 2, luego el resultado lo multiplicare por 3: ");
        int num = sc.nextInt();
        
        valorDoble = doblarNumero(num);//poner el resultado de la funcion dentro de variable valorDoble
        System.out.println("Numero: " + num + " y el doblado: "+ valorDoble);
        
        valorTriplicado = triplicarValor(valorDoble);
        System.out.println("El doblado es: "+valorDoble+" y triplicado es: "+valorTriplicado);
    }
    /**
     * Funcion que dobla cualquier valor
     * @param valor de entrada que sera doblado
     * @return el doble del valor entrada
     */
    public static int doblarNumero(int valor){
        int doble = valor * 2;
        return doble;
    }
    /**
     * funcion que triplica cualquier valor
     * @param valor de entrada que sera triplicado
     * @return el triple del valor de entrada
     */
    public static int triplicarValor(int valor){
        int triple = valor * 3;
        return triple;
    }
}
