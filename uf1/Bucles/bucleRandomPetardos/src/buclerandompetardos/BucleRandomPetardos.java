/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buclerandompetardos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author regig
 */
public class BucleRandomPetardos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        {/*La primera opció del joc sol serà numèric, el programa demana a 
        l'usuari que triï quin petardo escolleix de 3. El programa assignarà els
        valors aleatoris entre 0 i 20, a cada petard i si el que heu elegit, és 
        el més gran dels 3 (valdrà que sigui valor igual a un altre), hauràs 
        guanyat, en cas contrari perdràs. Mostrar el valor dels 3 petards al 
        acabar, per saber que realment funciona be el programa.*/}
        Random r = new Random();
        int numBengala;
        int bengala1 = r.nextInt(20)+1;
        int bengala2 = r.nextInt(20)+1;
        int bengala3 = r.nextInt(20)+1;
        /*
        System.out.println("B1: " + bengala1);
        System.out.println("B2: " + bengala2);
        System.out.println("B3: " + bengala3);
        */
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escoge tu bengala: 1, 2 o 3: ");
        numBengala = teclado.nextInt();
        System.out.println("Escogido: " + numBengala);
        //--Visual Bengalas--
        int lineaPintada=0;
        System.out.println("B1    B2    B3");
        while(lineaPintada<bengala1 || lineaPintada<bengala2 || lineaPintada<bengala3){
            if(lineaPintada<bengala1){
                System.out.print("*     ");
            }
            else{
                System.out.print("      ");
            }
            if(lineaPintada<bengala2){
                System.out.print("*     ");
            }
            else{
                System.out.print("      ");
            }
            if(lineaPintada<bengala3){
                System.out.println("*     ");
            }
            else{
                System.out.println("      ");
            }
            //System.out.println("lineas: "+lineaPintada);
            Thread.sleep(1000);
            lineaPintada++;
        }
        //--Decir si has ganado--
        if(numBengala == 1 && bengala1>=bengala2 && bengala1>=bengala3){
            System.out.println("Tu bengala "+numBengala+" a ganado!! Ha volado "+bengala1+" metros.");
        }
        else if(numBengala == 2 && bengala2>=bengala1 && bengala2>=bengala3){
            System.out.println("Tu bengala "+numBengala+" a ganado!! Ha volado "+bengala2+" metros.");
        }
        else if(numBengala == 3 && bengala3>=bengala1 && bengala3>=bengala2){
            System.out.println("Tu bengala "+numBengala+" a ganado!! Ha volado "+bengala3+" metros.");
        }
        else{
            System.out.println("Has perdido :(");
        }
        
    }
    
}
