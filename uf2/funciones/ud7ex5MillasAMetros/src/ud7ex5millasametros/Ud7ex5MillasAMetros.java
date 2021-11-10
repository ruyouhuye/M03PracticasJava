/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud7ex5millasametros;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ud7ex5MillasAMetros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribe un programa que pida un valor entero en millas y muestre su 
        equivalente en kilómetros.Recuerda que una milla son 1,60934 kilómetros.
        Implementa y utiliza la función:
        double millas_a_kilometros(int millas) // Devuelve la conversión de millas a kilómetros*/
        double millas, kilometrosTotal;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce las millas: ");
        millas = sc.nextInt();
        
        kilometrosTotal = convertirMillasAKms(millas);
        System.out.println(millas+" millas, son: "+kilometrosTotal+" kilometros");
        
    }
    /**
     * coge las millas y las multiplica por los kilometros que equivale una milla y da los kilometros
     * @param millas
     * @return 
     */
    public static double convertirMillasAKms(double millas) {
        double kilometrosTotal;
        double unaMilla=1.60934;
        kilometrosTotal = millas * unaMilla;
        
        return kilometrosTotal;
    }
    
}
