/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generalaleatorios;

import java.util.Random;

/**
 *
 * @author alumne
 */
public class GeneralAleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
        int numAleatorio = r.nextInt(21)+20;//de 20 a 40
        System.out.println("El numero aleatorio generado es: " + numAleatorio);
        numAleatorio = r.nextInt(101)+500;
        System.out.println("500-600 aleatorio generado es: " + numAleatorio);
        numAleatorio = r.nextInt(3)+13;
        System.out.println("13-15 aleatorio generado es: " + numAleatorio);
    }
    
}
