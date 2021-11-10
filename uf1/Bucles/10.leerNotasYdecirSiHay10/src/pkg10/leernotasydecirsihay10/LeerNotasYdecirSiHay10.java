/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10.leernotasydecirsihay10;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class LeerNotasYdecirSiHay10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realiza un programa que lea una secuencia de notas (con valores que 
        van de 0 a 10)que termina con el valor -1 y nos dice si hubo o no alguna
        nota con valor 10. Y cuantas notas introduzco. Calcula la media de las notas.*/ 
        int contaNotas=0;
        double nota, sumaNotas=0, mediaNotas;
        boolean hubo10 = false;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.print("Introduce la nota: ");
            nota = teclado.nextDouble();
            
            if(nota != -1){
                contaNotas++;
                sumaNotas = sumaNotas + nota;/*Sumando notas a cada vuelta*/
                if(nota==10){/*si hay 10 se vuelve true y entra por la linea donde 
                            if(hubo10==true)*/
                hubo10=true;
                }
            }
            
        }while(nota != -1);
        mediaNotas = sumaNotas / contaNotas;
        if(hubo10==true){
            System.out.println("Pusiste un 10.");
        }
        else{
            System.out.println("No hubo 10.");
        }
        System.out.println("Pusistes " + contaNotas + " notas.");
        System.out.println("La media de tus notas es: " + mediaNotas);
    }
    
}
