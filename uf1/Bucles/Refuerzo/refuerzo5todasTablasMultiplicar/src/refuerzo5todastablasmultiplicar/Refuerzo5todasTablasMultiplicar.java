/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package refuerzo5todastablasmultiplicar;

/**
 *
 * @author alumne
 */
public class Refuerzo5todasTablasMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dissenya una aplicació que mostri les taules de multiplicar de l'1 al 
        10 (pista: dos bucles anidats).*/
        int i, j, resultado;
        
        for (i = 0; i <= 10; i++) {
            System.out.println("Tabla del: "+i);
            for(j = 0; j <= 10; j++){
                resultado = i * j;
                System.out.println(i +" * " + j + " = " + resultado);
            }
        }
    }
    
}
