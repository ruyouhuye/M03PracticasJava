/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici3;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un programa que pida al usuario cuánto mide cada habitación de su casa e
irá sumando cada habitación hasta que se indique que no hay más habitaciones.
Ejemplo Ejecución*/
        Scanner sc = new Scanner(System.in);
        int metrosHabitacion , metrosTotal=0;
        char tienesHabitacion;
        do{
            System.out.print("Introduce metros cuadrados de tu habitacion: ");
            metrosHabitacion = sc.nextInt();
            metrosTotal = metrosTotal + metrosHabitacion;
            sc.nextLine(); //limpiar lo scaneado para scanear lo siguiente
            System.out.println("Tienes mas habitaciones? Si(s) / No(n)");
            tienesHabitacion = sc.nextLine().charAt(0);
            if(tienesHabitacion != 's' && tienesHabitacion != 'n'){
                System.out.println("Opcion invalida");
            }
        }while(tienesHabitacion != 'n');//seguir cuando no es 'n'
        System.out.println("Metros total: " + metrosTotal);
    }
    
}
