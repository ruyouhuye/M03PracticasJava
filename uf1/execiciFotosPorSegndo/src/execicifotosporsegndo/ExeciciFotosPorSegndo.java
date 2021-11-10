/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package execicifotosporsegndo;

import java.util.Scanner;

/**
 *
 * @author regig
 */
public class ExeciciFotosPorSegndo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int fotos, segundosporfoto, segundostotal, minutos, segundosrestante;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce la cantidad de fotos: ");
        fotos = teclado.nextInt();
        
        System.out.println("Introduce los segundos por foto: ");
        segundosporfoto = teclado.nextInt();
        
        segundostotal = fotos * segundosporfoto;
        minutos = segundostotal / 60;
        segundosrestante = segundostotal % 60;
        
        System.out.println("La presentacion durara: " + minutos + " minutos y: " + segundosrestante + "segundos");
    }
    
}
