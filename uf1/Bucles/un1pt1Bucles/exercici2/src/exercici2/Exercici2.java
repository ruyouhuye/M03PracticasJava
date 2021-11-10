/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici2;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Mostrar un menu
        -Si el usuario elige una opción no correcta deberá aparecer el mensaje: 
        “Opcion No Valida”. (0,25 pts)
        -Opción 0 el programa acabará(0,5 pt). 
        -Opción 1 escribir 10 veces: (0,5pt)
        Deberá escribir 10 veces en pantalla: “A clase se viene a trabajar”, 
        mostrando cada frase en una línea diferente y con el número delante 
        (utilizar bucle):
        -Opción 2. Cuenta atrás timbre: muestra por pantalla, en la misma linia,    
        una cuenta atrás de 10 hasta 0 y al acabar escribirá “RIIIIINGGGG!!!!!” 
        en la misma línea, si no puedes en lineas diferentes. (1 pts)
        10 9 8 7 6 5 4 3 2 1 0 RIIIIIING!!!!!
        -Opción 3. Números pares entre dos valores: el programa te pedirá dos 
        números y mostrará por pantalla los números pares que hay entre los dos 
        (del más pequeño al más grande).(1,25pts)
        Numero1: 5    
        Numero2: 13
        6 8 10 12 
        */
        int opcion;
        Scanner sc = new Scanner(System.in);
        int grande, peque;
        do{
        System.out.println("****Menu****");
        System.out.println("0-Salir");
        System.out.println("1-Escribir 10 veces");
        System.out.println("2-Cuenta atras timbre");
        System.out.println("3-Numeros pareces 2 valores");
        System.out.println("Elige tu opcion: ");
        opcion = sc.nextInt();
        if(opcion==1){
            for (int cont = 1; cont <= 10; cont++) {
            System.out.println(cont+" A clase se viene a trabajar");
            }
        }
        else if(opcion==2){
            int cont = 10;
            while(cont>=0){
                System.out.print(cont+" ");
                cont = cont-1;
            }
            System.out.println("RIIIIINGGGG!!!!!");
            /*
            for (int i = 10; i > 0; i--) {
                System.out.print(i + " ");
            }
            System.out.println("RIIIIINGGGG!!!!!");
            */
        }
        else if(opcion==3){
           int num1, num2;
           System.out.println("Introduce un numero: ");
           num1 = sc.nextInt();
           System.out.println("Introduce otro numero: ");
           num2 = sc.nextInt();
           if (num1<num2){
               grande = num2;
               peque = num1;
           }
           else{
               grande = num1;
               peque = num2;
           }
           for (int numero = peque+1; numero < grande; numero++) {
                if(numero%2==0){
                System.out.println(numero+ " ");
               }
           }
                
        }
        }while(opcion!=0);//sigue mientras opcion no sea 0
        System.out.println("Adios uwu");
        

        }
        
        
    }
    

