/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici17horasminutossegundos;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici17horasminutossegundos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dibuja un ordinograma que recibe como datos de entrada una hora 
        expresada en horas, minutos y segundos que nos calcula y escribe la 
        hora, minutos y segundos que serán, transcurrido un segundo.*/
        int horas, minutos, segundos;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce las horas: ");
        horas = teclado.nextInt();
        
        System.out.println("Introduce los minutos: ");
        minutos = teclado.nextInt();
        
        System.out.println("Introduce los segundos: ");
        segundos= teclado.nextInt();
        
        segundos = segundos + 1;// segundos++; //segundos +=1;
        if(segundos == 60){
            segundos = 0;
            minutos = minutos + 1;
            if(minutos == 60){
                minutos = 0;
                horas = horas + 1;
                if(horas == 24){
                    horas = 0;
                    System.out.println(horas + ":" + minutos + ":" + segundos);
                }
                else{//si no he pasado de 24 horas
                System.out.println(horas + ":" + minutos + ":" + segundos);
                }
            }
            else{//si no he pasado 60 minutos
            System.out.println(horas + ":" + minutos + ":" + segundos);
            }
        }
        else{//si no he pasado 60 segundos
            System.out.println(horas + ":" + minutos + ":" + segundos);
        }
    }
    
}
