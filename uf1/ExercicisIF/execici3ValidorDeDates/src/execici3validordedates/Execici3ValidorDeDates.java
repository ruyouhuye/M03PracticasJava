/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package execici3validordedates;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Execici3ValidorDeDates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Programa que demana dia , mes i any, i si algun dels paràmetres no té 
        un valor correcte, informar quin. Contar que tots els mesos tenen 30 
        dies. I que els anys sol pot ser a partir del any 1900
        Segona opció més difícil: Que avisi combinacions incorrectes, per 
        exemple febrer sol pot tenir 28, i que tingui en compte els mesos de 31
        dies.*/
        int dia, mes, año;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el dia: ");
        dia = teclado.nextInt();
        System.out.println("Introduce el mes: ");
        mes = teclado.nextInt();
        System.out.println("Introduce el año: ");
        año = teclado.nextInt();
        
    }
    
}
