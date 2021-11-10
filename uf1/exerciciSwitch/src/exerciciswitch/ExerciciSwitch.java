/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciswitch;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ExerciciSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("1.-Nueva partida.");
        System.out.println("2.-Cargar partida guardada.");
        System.out.println("3.-Ver records.");
        System.out.println("0.-Salir.");
        
        System.out.println("Escoge opcion: ");  
        opcion = teclado.nextInt();
        
        switch (opcion){
            case 1:
                System.out.println("Creando nueva partida...");
                break;
            case 2:
                System.out.println("Cargando partida guardada...");
                break;
            case 3:
                System.out.println("Lista records...");
                break;
            case 0:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opcion incorrecta!!!");
                break;
        }
    }
    
}
