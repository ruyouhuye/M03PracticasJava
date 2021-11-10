/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buclehastaintroducir0;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class BucleHastaIntroducir0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*control+shift+c = comentar varias lineas slecionadas*/
//        int num, acumulandoSuma=0;
//        Scanner teclado = new Scanner(System.in);
//        
//        do{
//            System.out.println("Introduce un numeros (pon -1 para terminar): ");
//            num = teclado.nextInt();
//            if(num != -1){
//                acumulandoSuma = acumulandoSuma + num;
//                System.out.println("Acumulad parcial: " + acumulandoSuma);
//            }
//        }
//        while(num!=-1);
//        System.out.println("El total de las sumas es: " + acumulandoSuma);
//        //System.out.println("Has escrito 0, el programa se termina");
        
        //Salir de un bucle
//        int num, acumulandoSuma=0;
//        boolean finalBucle = false;
//        Scanner teclado = new Scanner(System.in);
//        
//        do{
//            System.out.println("Introduce un numeros (pon -1 para terminar): ");
//            num = teclado.nextInt();
//            if(num != -1){
//                acumulandoSuma = acumulandoSuma + num;
//                System.out.println("Acumulad parcial: " + acumulandoSuma);
//            }
//            else{
//                finalBucle=true;
//            }
//        }
//        while(!finalBucle);
//        System.out.println("El total de las sumas es: " + acumulandoSuma);
//        //System.out.println("Has escrito 0, el programa se termina");
        
        //Que sume hasta pasar de 100
        int num, acumulandoSuma=0;
        boolean finalBucle = false;
        Scanner teclado = new Scanner(System.in);
        
        do{
            System.out.println("Introduce un numeros y parare hasta que sume mas de 100 : ");
            num = teclado.nextInt();
            if(num>0){
                acumulandoSuma = acumulandoSuma + num;
                System.out.println("Acumulad parcial: " + acumulandoSuma);
            }
            else{
                System.out.println("El numero es 0 o negativo, no lo sumo");
            }
            if(acumulandoSuma >= 100){
                finalBucle=true;//lo hacemos true para que en el while no niegue y salga del bucle
            }
        }
        while(!finalBucle);
        System.out.println("El total de las sumas es: " + acumulandoSuma);
        //System.out.println("Has escrito 0, el programa se termina");
    }
    
}
