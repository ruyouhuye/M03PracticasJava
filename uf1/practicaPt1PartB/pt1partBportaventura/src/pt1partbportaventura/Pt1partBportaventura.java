/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pt1partbportaventura;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Pt1partBportaventura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double personasVan, adultos, menores, totalPagar;
        final int entAdulto = 20;
        final int entMenor = 10;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Cuantos van a port aventura? ");
        personasVan = teclado.nextInt();
        System.out.println("Cuantos son menores? ");
        menores = teclado.nextInt();
        
        adultos = personasVan - menores;
        
        if(personasVan < 10){
            totalPagar = adultos*entAdulto + menores*entMenor;
            System.out.println("Tienes que pagar: " + totalPagar + " euros.");
        }
        else if(personasVan >= 10 && personasVan < 25){
            totalPagar = (adultos*entAdulto + menores*entMenor)*0.75;
            System.out.println("Tienes que pagar: " + totalPagar + " euros incluido el descuento del 25%.");
        }
        else if(personasVan >= 25){
            totalPagar = (((adultos*entAdulto-entAdulto) + menores*entMenor)*0.75);
            System.out.println("Tienes que pagar: " + totalPagar + " euros incluido el descuento del 25% y una entrada gratis.");
        }
    }
    
}
