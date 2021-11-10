/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pt1partbconversormoneda;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Pt1partBconversorMoneda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Menu de opciones: ");
        System.out.println("1. Bitcoin a euros. ");
        System.out.println("2. XMR a euros");
        int opcion, bitcoin, xmr;
        double eurosTienes;
        final double unbitcoin=49.561;
        final double unxmr=233.81;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce la opcion: ");
        opcion = teclado.nextInt();
        if(opcion == 1){
            System.out.println("Introduce cuantos Bitcoins tienes: ");
            bitcoin = teclado.nextInt();
            eurosTienes = unbitcoin * bitcoin;
            System.out.println(bitcoin + " Bitcoin son : " + eurosTienes + " euros.");
        }
        else if(opcion == 2){
            System.out.println("Introduce cuantos XMR tienes: ");
            xmr = teclado.nextInt();
            eurosTienes = unxmr * xmr;
            System.out.println(xmr + " XMR son : " + eurosTienes + " euros.");
        }
        else{
            System.out.println("OPCION INVALIDA!!!");
        }
    }
    
}
