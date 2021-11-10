/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici18salario;

import java.util.Scanner;

/**
 *
 * @author regig
 */
public class Exercici18salario {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int horas, extra;
        double tarifa, salariobBruto, salarioExtra, salarioNormal, salarioNeto;
        double dineroImpuestos, impuestos, dineroImpuestosMaximos, impuestos900;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce las horas que trabas: ");
        horas = teclado.nextInt();
        System.out.println("Introduce la tarifa por horas: ");
        tarifa = teclado.nextDouble();
        
        if(horas <= 35){//si no me paso de horas
            salariobBruto = horas * tarifa;
            System.out.println("Cobreas: " + salariobBruto + "salario bruto");
        }
        else{
            extra = horas - 35;
            salarioNormal = 35 * tarifa;
            salarioExtra = extra*tarifa*1.5;
            salariobBruto = salarioExtra + salarioNormal;
            System.out.println("Cobras: " + salariobBruto + "salario bruto");
        }
        //impuestos 
        if(salariobBruto < 500){
            impuestos = 0;
        }
        else if(salariobBruto < 900){
            dineroImpuestos = salariobBruto - 500;
            impuestos = (dineroImpuestos*25)/100;  
        }
        else{//el sueldo bruto es mas de 900
            dineroImpuestos = 400;
            impuestos = (dineroImpuestos*25)/100;
            System.out.println("Los 400 tiene impuesto de " + impuestos);
            dineroImpuestosMaximos = salariobBruto - 900;
            impuestos900 = (dineroImpuestosMaximos*45)/100;
            System.out.println("Los que pasan de 900 tiene impuesto de " + impuestos900);
            impuestos = impuestos + impuestos900;
        }
        System.out.println("Impuestos son: " + impuestos);
        salarioNeto = salariobBruto - impuestos;
        System.out.println("Tu salario neto es: " + salarioNeto);
    }
    
}
