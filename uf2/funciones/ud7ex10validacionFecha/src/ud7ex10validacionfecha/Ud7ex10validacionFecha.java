/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud7ex10validacionfecha;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ud7ex10validacionFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realiza un programa que lea una fecha introduciendo el día, mes y año 
        por separado y nos diga si la fecha es correcta o no. Supondremos que 
        todos los meses tienen 30 días y año mayor de 1900. Se debe crear una 
        función donde le pasemos los datos y devuelva si es correcta o no.*/
        int dia, mes, anyo;
        boolean fechaCorrecta=true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el dia: ");
        dia = sc.nextInt();
        System.out.print("Introduce el mes: ");
        mes = sc.nextInt();
        System.out.print("Introduce el año: ");
        anyo = sc.nextInt();
        
        fechaCorrecta = validacionFecha(dia, mes, anyo);
        if(fechaCorrecta == true){
            System.out.println("Fecha correcta");
        }
        else if(fechaCorrecta ==false){
            System.out.println("Fecha incorrecta");
        }
    }

    public static boolean validacionFecha(int dia, int mes, int anyo) {
       boolean validacion;
       if(dia<0 || mes <0 || anyo < 1900){
           validacion = false;
       }
       else if(dia<=30 && mes <=12 && anyo > 1900){
            validacion = true;
       }
       else{
           validacion = false;
       }
       return validacion;
    }
    
}
