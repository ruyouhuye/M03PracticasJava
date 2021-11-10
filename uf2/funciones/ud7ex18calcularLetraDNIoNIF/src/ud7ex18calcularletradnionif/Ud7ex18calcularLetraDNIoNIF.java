/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud7ex18calcularletradnionif;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ud7ex18calcularLetraDNIoNIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*El NIF (o letra asociada a un DNI) se obtiene de la siguiente manera: 
        Se divide el número de DNI entre 23 y el resto es codificado por una 
        letra según la siguiente equivalencia:
        0: "T", 1: "R", 2: "W", 3: "A", 4: "G", 5: "M", 6: "Y", 7: "F", 8: "P", 
        9: "D",10:"X", 11: "B", 12: "N", 13: "J", 14: "Z", 15: "S", 16: "Q", 
        17: "V", 18: "H", 19: "L", 20: "C", 21: "K", 22: "E".
        Escribe un programa que pida el DNI y muestre por pantalla la letra 
        asociada. Para ello se deberá crear una función a la que se le pase el 
        número y devuelva la letra.
        Ejemplo: para el DNI 56321122 el NIF es ‘X’.
        */
        int dni;
        char letraDniNif;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el DNI/NIF: ");
        dni = sc.nextInt();
        letraDniNif = decirLetra(dni);
        System.out.println("La letra de tu DNI/NIF es: " + letraDniNif);
    }

    public static char decirLetra(int dni) {
        char letraDniNif=' ';
        int residuo;
        residuo = dni%23;
        switch (residuo) {
            case 0:
                letraDniNif='T';
                break;
            case 1:
                letraDniNif='R';
                break;
            case 2:
                letraDniNif='W';
                break;
            case 3:
                letraDniNif='A';
                break;
            case 4:
                letraDniNif='G';
                break;
            case 5:
                letraDniNif='M';
                break;
            case 6:
                letraDniNif='Y';
                break;
            case 7:
                letraDniNif='F';
                break;
            case 8:
                letraDniNif='P';
                break;
            case 9:
                letraDniNif='D';
                break;
            case 10:
                letraDniNif='X';
                break;
            case 11:
                letraDniNif='B';
                break;
            case 12:
                letraDniNif='N';
                break;
            case 13:
                letraDniNif='J';
                break;
            case 14:
                letraDniNif='Z';
                break;
            case 15:
                letraDniNif='S';
                break;
            case 16:
                letraDniNif='Q';
                break;
            case 17:
                letraDniNif='V';
                break;
            case 18:
                letraDniNif='H';
                break;
            case 19:
                letraDniNif='L';
                break;
            case 20:
                letraDniNif='C';
                break;
            case 21:
                letraDniNif='K';
                break;
            case 22:
                letraDniNif='E';
                break;
            default:
                break;
        }
        return letraDniNif;
    }
    
}
