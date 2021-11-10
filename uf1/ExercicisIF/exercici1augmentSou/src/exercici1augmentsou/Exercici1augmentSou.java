/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici1augmentsou;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici1augmentSou {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sou, aumento;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce tu sueldo anual: ");
        sou = teclado.nextInt();
        
        if(sou < 18000){
            aumento = (sou*12)/100;
            sou = sou + aumento;
            System.out.println("Tu sueldo aumentado sera: " + sou);
        }
        else if(sou >=18000 && sou <30000){
            aumento = (sou*10)/100;
            sou = sou + aumento;
            System.out.println("Tu sueldo aumentado sera: " + sou);
        }
        else if(sou >=30000 && sou <45000){
            aumento = (sou*8)/100;
            sou = sou + aumento;
            System.out.println("Tu sueldo aumentado sera: " + sou);
        }
        else if(sou >=45000){
            aumento = (sou*6)/100;
            sou = sou + aumento;
            System.out.println("Tu sueldo aumentado sera: " + sou);
        }
    }
    
}
