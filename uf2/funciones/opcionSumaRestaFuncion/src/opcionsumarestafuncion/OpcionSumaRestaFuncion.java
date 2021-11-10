/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package opcionsumarestafuncion;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class OpcionSumaRestaFuncion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1, valor2;
        int resultado = 0; //operacion 
        int opcion;
        System.out.println("Pon el primer valor: ");
        valor1 = sc.nextInt();
        System.out.println("Pon el segundo valor: ");
        valor2 = sc.nextInt();
        System.out.println("1.- Calcular suma");
        System.out.println("2.- Calcular resta");
        System.out.print("Pon opcion: ");
        opcion = sc.nextInt();
        
        if(opcion == 1){
            resultado = funcionSuma(valor1,valor2);
        }
        else if(opcion == 2){
            resultado = funcionResta(valor1,valor2);
        }
        else{
            System.out.println("Opcion invalida!!!");
        }
        System.out.println("El resultado de la operación elegida es: " + resultado);
    }
    /**
     * Entra en esta funcion si la opcion == 1
     * @param valor1
     * @param valor2
     * @return 
     */
    public static int funcionSuma(int valor1, int valor2) {
        int resultadoSuma;
        resultadoSuma = valor1 + valor2;
        return resultadoSuma;
    }
    /**
     * Entra en esta funcion si la opcion == 2
     * @param valor1
     * @param valor2
     * @return 
     */
    public static int funcionResta(int valor1, int valor2) {
        int resultadoResta;
        resultadoResta = valor1 - valor2;
        return resultadoResta;
    }
}
