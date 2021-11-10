/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici2descuentos;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici2Descuentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int despesa, descuento;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce las despesa: ");
        despesa = teclado.nextInt();
        
        if(despesa < 800){
            descuento = (despesa*0)/100;
            despesa = despesa - descuento;
            System.out.println("Despesa a pagar:" + despesa);
        }
        else if(despesa >= 800 && despesa < 1500){
            descuento = (despesa*6)/100;
            despesa = despesa - descuento;
            System.out.println("Despesa a pagar:" + despesa);
        }
        else if(despesa >= 1500 && despesa < 3000){
            descuento = (despesa*8)/100;
            despesa = despesa - descuento;
            System.out.println("Despesa a pagar:" + despesa);
        }
        else if(despesa > 3000){
            descuento = (despesa*10)/100;
            despesa = despesa - descuento;
            System.out.println("Despesa a pagar:" + despesa);
        }
        
    }
    
}
