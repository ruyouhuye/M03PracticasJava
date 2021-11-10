/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciclasheleccioncartas;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ExerciciClashEleccionCartas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int  copas;
        char opcionLetra;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el numero de copas que tienes: ");
        copas = teclado.nextInt();
        
        teclado.nextLine();//limpiar el bufer(donde se quedan los datos)!!!!!!!!
        
        if(copas < 2000){
            System.out.println("Si quieres Mago Electrico(M/m) y si quieres Esbirro(E/e)");
            opcionLetra = teclado.nextLine().charAt(0);
        
            if((opcionLetra == 'M')||(opcionLetra == 'm')){
                System.out.println("Mago electrico");
            }
            else if ((opcionLetra == 'E')||(opcionLetra == 'e')){
                System.out.println("Esbirro");
            }
            else{
                System.out.println("Opcion incorrecta");
            }
        }
        else if(copas >= 2000 && copas <3000){
            System.out.println("Escoge Caballero(C) o Bandida(B)");
            opcionLetra = teclado.nextLine().charAt(0);
            if((opcionLetra == 'C')||(opcionLetra == 'c')){
                System.out.println("Caballero");
            }
            else if ((opcionLetra == 'B')||(opcionLetra == 'b')){
                System.out.println("Bandida");
            }
            else{
                System.out.println("Opcion incorrecta");
            }
        }
        else if(copas >= 3000){
            System.out.println("Escoge Ejercito Esqueletos(0) o Gigante Noble(1)");
            opcionLetra = teclado.nextLine().charAt(0);
            if((opcionLetra == 'E')||(opcionLetra == 'e')){
                System.out.println("Ejercito Esqueletos");
            }
            else if ((opcionLetra == 'G')||(opcionLetra == 'g')){
                System.out.println("Gigante Noble");
            }
            else{
                System.out.println("Opcion incorrecta");
            }
        }
    }
    
}
