/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud7ex13calcularel.dedescuento;

import java.util.Scanner;

/**
 *
 * @author regig
 */
public class Ud7ex13calcularElDeDescuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realiza un programa que calcule el porcentaje de descuento que nos han
        hecho al comprar algo. Se debe solicitar la cantidad sin descuento y la 
        cantidad con el descuento aplicado. Se debe crear una función a la que 
        le pasemos ambos valores y nos devuelva el descuento.*/
        double cantidadSinDescuento, cantidadConDescuento, descuento;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el precio sin descuento: ");
        cantidadSinDescuento = sc.nextDouble();
        System.out.println("Introduce el precio con descuento: ");
        cantidadConDescuento = sc.nextDouble();
        
        descuento = porcentajeDescuento(cantidadSinDescuento, cantidadConDescuento);
        System.out.println("Te han descontado " + descuento + " %.");
    }

    public static double porcentajeDescuento(double cantidadSinDescuento, double cantidadConDescuento) {
        double descuento;
        descuento = 100-((cantidadConDescuento/cantidadSinDescuento)*100);
        return descuento;
    }
    
}
