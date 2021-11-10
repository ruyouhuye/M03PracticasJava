/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundofunciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class HolaMundoFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner teclado = new Scanner(System.in);
        helloworld();
        String nombre = "Ruyou Hu Ye";
        helloWorldNombre(nombre);
        int valor = 5;
        System.out.println("valor no clonado antes de la funcion: " + valor);
        aumentaEnDos(valor);
        System.out.println("valor no clonado despues de la funcion: " + valor);
    }
    /*
    -Funcion que muiestra por pantalla HelloWorld
    -Void no devuelve ningun valor al mail
    */
    public static void helloworld(){
        System.out.println("Hello World in funtions");
    }//helloworld
    /**
     * Escribira hello world acompañado del nombre
     * @param nom es la variable que contiene el nombre
     */
    public static void helloWorldNombre(String nom){
        System.out.println("Hello world. "+ nom + ", how are you?");
    }//helloWorldNombre
    /**
     * Aumentara el valor pasado en dos
     * @param valor tendra el numero que me pasa desde el main
     */
    private static void aumentaEnDos(int valor) {
        System.out.println("valor clonado antes de ningun cambio: " + valor);
        valor = valor + 2;
        System.out.println("valor clonado aumentado: " + valor);
        valor = valor * 2;
        System.out.println("valor clonado multiplicado: " + valor);
    }
    
}
