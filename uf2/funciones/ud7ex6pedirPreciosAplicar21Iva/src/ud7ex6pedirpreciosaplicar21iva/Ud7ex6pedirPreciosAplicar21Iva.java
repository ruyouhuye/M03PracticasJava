/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud7ex6pedirpreciosaplicar21iva;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ud7ex6pedirPreciosAplicar21Iva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribe un programa que pida cinco precios y muestre por pantalla el 
        precio de venta de cada uno tras aplicarle un 21% de IVA. Implementa y 
        utiliza la función:
        double precioConIVA(double precio) // Devuelve el precio tras sumarle un 21% de IVA*/
        double precio, precioCon21iva;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.print("Dime un precio: ");
            precio = sc.nextDouble();
            precioCon21iva = aplicar21iva(precio);
            System.out.println("El precio desde de aplicar el 21% de IVA es: "+ precioCon21iva);
        }
        
    }
    /**
     * sumar al precio introducido el 21% de IVA
     * @param precio
     * @return 
     */
    public static double aplicar21iva(double precio) {
        double precioMas21iva;
        precioMas21iva = precio + (precio*0.21);
        return precioMas21iva;
    }
    
}
