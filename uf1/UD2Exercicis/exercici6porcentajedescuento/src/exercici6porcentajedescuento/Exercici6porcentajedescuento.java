/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici6porcentajedescuento;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici6porcentajedescuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dibuja un ordinograma que dado el precio de un artículo y el precio 
        de venta real nos muestre el porcentaje de descuento realizado.*/
        double precioarticulo, precioventa, descuento;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca precio articulo: ");// precio articulo lo que vale
        precioarticulo = teclado.nextDouble();
        
        System.out.println("Introduzca precio venta: ");// precio venta precio al que lo vendiste
        precioventa = teclado.nextDouble();
        
        descuento = (((precioarticulo - precioventa)*100)/precioarticulo);
        
        System.out.println("El descuento es de : " + descuento + "%");
    }
    
}
