/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conocermayorfunciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ConocerMayorFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int valor1, valor2;
        int mayor;
        System.out.print("Pon valor: ");
        valor1 =  sc.nextInt();
        System.out.print("Pon otro valor: ");
        valor2 = sc.nextInt();

        mayor = numeroMasGrande(valor1,valor2);
        System.out.println("El mayor valor es: "+ mayor);
    }

    /**
     * numeroMasGrande
     * funcion que apartir de 2 numero Retorn el mas grande
     * @param v1
     * @param v2
     * @return devulve el numero (valor) mas grande de los 2 entrada
     */
    private static int numeroMasGrande(int valor1, int valor2) {
        int masGrande=0;
        if(valor1>=valor2){
        masGrande = valor1;
        }
        else{
        masGrande = valor2;
        }
        return masGrande;//despues de esta linea la variable masGrande deja de existir  
    }
}
