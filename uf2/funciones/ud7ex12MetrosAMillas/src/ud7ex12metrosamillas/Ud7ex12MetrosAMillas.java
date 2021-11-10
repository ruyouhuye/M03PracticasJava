/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud7ex12metrosamillas;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ud7ex12MetrosAMillas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realiza un programa que dado un valor en kilómetros nos lo traduce a
        millas. El programa debe tener una función que reciba como parámetro una
        cantidad en kilómetros y nos la devuelva en millas*/
        double kilometros, millasTotal;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce las millas: ");
        kilometros = sc.nextInt();
        
        millasTotal = convertirKmsAMillas(kilometros);
        System.out.println(kilometros+" kilometros, son: "+millasTotal+" millas.");
    }

    public static double convertirKmsAMillas(double kilometros) {
        double millasTotal;
        double unaMilla=1.60934;
        millasTotal = kilometros * unaMilla;
        return millasTotal;
    }
    
}
