/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package opcinessumarestamultidivi;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class OpcinesSumaRestaMultiDivi {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int valor1, valor2;
        double resultado = 0; //operacion 
        int opcion;
        
        System.out.println("Valor 1");
        valor1 = valorPositivo(sc);//llama funcion que pide numero en positivo
        System.out.println("Valor 2");
        valor2 = valorPositivo(sc);//llama funcion que pide numero en positivo
        
        mostarMenu();//llama la funcion mostrarMenu y muestra las opciones
        opcion = validarOpcion(sc);//llamar funcion para que el valor sea de 1 a 4
        
        if(opcion == 1){
            resultado = funcionSuma(valor1,valor2);
        }
        else if(opcion == 2){
            resultado = funcionResta(valor1,valor2);
        }
        else if(opcion == 3){
            resultado = funcionMulti(valor1, valor2);
        }
        else if(opcion == 4){
            resultado = funcionDivi(valor1, valor2);
        }
        else{
            System.out.println("Opcion invalida!!!");
        }
        System.out.println("El resultado de la operación elegida es: " + resultado);
    }
    
    /**
     * Muestra menu
     */
    public static void mostarMenu() {
        System.out.println("1.- Calcular suma");
        System.out.println("2.- Calcular resta");
        System.out.println("3.- Calcular multiplicacion");
        System.out.println("4.- Calcular division"); 
    }
    /**
     * Pedirte la opciond de la calculadora y solo aceta de 1 a 4 y sino volvera a pedir
     * @param <error>
     * @param sc
     * @return 
     * @throws java.lang.InterruptedException 
     */
    public static int validarOpcion(Scanner sc) throws InterruptedException {
        int opcion;
        do{
            System.out.print("Pon opcion menu(1-4): ");
            opcion = sc.nextInt();
            if (opcion < 1 || opcion > 4) {
                System.out.println("Opcion incorrecta!!");
                Thread.sleep(1000);
                mostarMenu();
            }
        }while(opcion < 1 || opcion > 4);//salir opcion >= 1 && opcion <=4
        return opcion;
    }
        /**
     * Funcion que sirve para que solo coja numeros positivos
     * @param sc
     * @return
     * @throws InterruptedException 
     */
    public static int valorPositivo(Scanner sc) throws InterruptedException {
        int valorPositivo;
        do{
            System.out.println("Introduce un valor: ");
            valorPositivo = sc.nextInt();
            if (valorPositivo <= 0) {
                System.out.println("Opcion incorrecta!! Ha de ser positivo!! ");
                Thread.sleep(1000);
            }
        }while(valorPositivo <= 0);//salir cuando valorPositivo es mayor que 0
        return valorPositivo;
    }
    
    /**
     * Entra en esta funcion si la opcion == 1
     * @param valor1
     * @param valor2
     * @return 
     */
    public static int funcionSuma(int valor1, int valor2) {
        int resultadoSuma = valor1 + valor2;
        return resultadoSuma;
    }
    /**
     * Entra en esta funcion si la opcion == 2
     * @param valor1
     * @param valor2
     * @return 
     */
    public static int funcionResta(int valor1, int valor2) {
        int resultadoResta = valor1 - valor2;
        return resultadoResta;
    }
    /**
     * Entra en esta funcion si la opcion == 3
     * @param valor1
     * @param valor2
     * @return 
     */
    public static int funcionMulti(int valor1, int valor2){
        int resultadoMulti = valor1 * valor2;
        return resultadoMulti;
    }
    /**
     * Entra en esta funcion si la opccion == 4
     * @param valor1
     * @param valor2
     * @return 
     */
    public static double funcionDivi(int valor1, int valor2){
        double resultadoDivi = (double) valor1 / valor2;
        return resultadoDivi;
    }
}
