/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud7ex17pedirhasta0decirprimo;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ud7ex17PedirHasta0DecirPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realiza un programa que nos pida número enteros hasta que se 
        introduzca el 0, diciéndonos, para cada número introducido si es primo o
        no. Hay que recordar que un número es primo si es divisible por si mismo
        y por 1. El 1 no es primo por convenio. Se debe crear una función que 
        pasándole un número entero devuelva si es primo o no. */
        int num;
        boolean es_primo;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Introduce un numero: ");
            num = sc.nextInt();
            if(num!=0){//para que no entre en la funcion si el num introducido es 0
                es_primo = funcionSiEsPrimo(num);
                //si es true es primo, sino no lo es
                if(es_primo==true){
                    System.out.println("Numero es primo");
                }
                else{
                    System.out.println("No es primo");
                }
            }   
        }while(num != 0);//sigue mientra el num introducido no sea 0   
        System.out.println("Saliendo programa...");
    }
    /**
     * mira si el numero es primo o sea que no c puede dividir por ninguno que 
     * no sea el mismo o el numero 1
     * @param num que quiero saber si es primo
     * @return true = numero primo, false = numero no es primo
     */
    public static boolean funcionSiEsPrimo(int num) {
        for (int i = 2; i < num -1; i++) {
            if(num%i==0){//lo divide por lo tanto no es primo
                return false;
            }
            /*si no lo divide aun no puedo informar porque tengo que probar todos
            los numeros hasta el terminar el bucle para saber s es primo*/
        }
        return true;/*numca he entrado en el if, por tanto ningun numero divide 
                    el num de entrada*/
    }
    
}
