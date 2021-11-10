/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package refuerzo7asciidea.z;

/**
 *
 * @author alumne
 */
public class Refuerzo7ASCIIdeAZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escriu un programa que mostri el codi ASCII dels caràcters des de l'A 
        fins la Z*/
        char letra;
        int codigoASCII;
        
        for(letra = 'a'; letra <= 'z'; letra++){
            codigoASCII = (int) letra;
            System.out.println(letra +" - "+ codigoASCII);
        }      
    }
    
}
