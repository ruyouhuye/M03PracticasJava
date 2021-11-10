/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle0hasta5;

/**
 *
 * @author alumne
 */
public class Bucle0hasta5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont;
        
        for (cont = 0; cont < 6; cont++) {
            System.out.println("Numero for: " + cont);
        }
        //while
        cont = 0;
        while(cont<=5){
            System.out.println("Numero while: " + cont);
            cont = cont+1;
        }
    }
    
}
