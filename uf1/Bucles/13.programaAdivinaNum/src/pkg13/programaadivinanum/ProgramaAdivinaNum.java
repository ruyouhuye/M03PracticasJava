/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg13.programaadivinanum;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ProgramaAdivinaNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realiza un programa donde el usuario "piensa" un número del 1 al 100 y
        el ordenador intenta adivinarlo. Es decir, el ordenador irá proponiendo 
        números una y otra vez hasta adivinarlo (el usuario deberá indicarle al 
        ordenador si es mayor, menor o igual al número que ha pensado).*/
        int min=1, max=100;
        int numAdivinar;
        char respuesta='a';
        Scanner teclado = new Scanner(System.in);
        
        do{
            System.out.println("Piensa un numero del 1 al 100.");
            numAdivinar= (min+max+1)/2;
            System.out.println("El numero a adivinar es " + numAdivinar);
            System.out.println("Mayor(M), Inferior(F) o Igual(I) a-> " + numAdivinar);
            respuesta = teclado.nextLine().charAt(0);
            System.out.println("tu respuesta  es "+ respuesta);
            if (respuesta == 'M' || respuesta == 'm'){
                min = numAdivinar;
            }
            else if (respuesta == 'F' || respuesta == 'f'){
                max = numAdivinar;
            }
        }while(respuesta != 'I' || respuesta != 'i'); 
        
    }
    
}
