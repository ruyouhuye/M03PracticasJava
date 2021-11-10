/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package formultiplicacion;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ForMultiplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont, resultado, multi;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la tabla: ");
        multi = teclado.nextInt();
        
        for (cont = 0; cont <= 10; cont++) {
            resultado = cont * multi;
            System.out.println("For: " + multi +" * " + cont + " = " + resultado);
        }
        //while
        cont = 0;
        while(cont<=10){
            resultado = cont * multi;
            System.out.println("While: " + multi +" * " + cont + " = " + resultado);
            cont =  cont+1;
        }
        //do while
        cont = 0;
        do{
            resultado = cont * multi;
            System.out.println("Do while: " + multi +" * " + cont + " = " + resultado);
            cont =  cont+1;
        }
        while(cont<=10);
        
    }
    
}
