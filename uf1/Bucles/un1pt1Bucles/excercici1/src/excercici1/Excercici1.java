/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excercici1;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Excercici1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escriberará cuando lleve 3(1,25pt) números introducidos que
sean superiores a 10 y menores que 20.
Al terminar, debe mostrar, cuántos números has introducido(1pt), hasta que ha
parado, y debe mostrar la suma de los 3 números superior a 10 y menor que 20(1)*/
        int num , contNum=0, numEntre10y20=0, sumaEntre10y20=0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Introduce un numero: ");
            num = sc.nextInt();
            if(num >= 10 && num <= 20){
                numEntre10y20++; 
                sumaEntre10y20 = num + sumaEntre10y20;
            }
            contNum++;
        }while(numEntre10y20 != 3);
        System.out.println("Numeros introducidos: " + contNum);
        System.out.println("La suma entre los numeros superior a 10 y inferior a 20 es: " + sumaEntre10y20);
    }
    
}
