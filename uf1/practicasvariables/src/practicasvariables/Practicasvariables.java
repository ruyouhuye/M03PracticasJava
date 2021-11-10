/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicasvariables;

/**
 *
 * @author alumne
 */
public class Practicasvariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //tipo de dato(int,float,...) nombre=valor;
        int numero;
        double numeroConDecimal;
        double x=9.2;
        boolean cierto_falso;
        numero=10;
        numeroConDecimal=9.5;
        int doble;
        doble = numero*2;
        cierto_falso= numeroConDecimal != x;
        System.out.println("numero -> " + numero);
        System.out.println("el doble del numero es "+ doble);
        System.out.println("numero con decimales -> " + numeroConDecimal);
        System.out.println("x vale ->" + x);
        System.out.println("el booleano vale " + cierto_falso);
    }
    
}
