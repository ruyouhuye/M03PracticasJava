/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud7ex9pedir3valorescomparar2valorenfuncion;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ud7ex9pedir3valoresComparar2valorEnFuncion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realiza un programa que pida introducir tres valores enteros y nos 
        diga cuál de ellos es el más elevado. Impleméntalo creando únicamente 
        una función a la que le pasemos dos valores (no tres) y nos devuelva el 
        máximo de los dos valores.*/
        int v1, v2, v3;
        int masElevado;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un primer valor: ");
        v1 = sc.nextInt();
        System.out.print("Introduce un segundo valor: ");
        v2 = sc.nextInt();
        System.out.print("Introduce un tercer valor: ");
        v3 = sc.nextInt();
        
        masElevado =mayorDe2valor(v1, v2);
        masElevado = mayorDe2valor(masElevado, v3);
        System.out.println("El mas valor elevado es: " + masElevado);
    }

    public static int mayorDe2valor(int v1, int v2) {
        int mayor;
        if(v1>v2){
            mayor = v1;
        }
        else{
            mayor = v2;
        }
        return mayor;
    }
}
