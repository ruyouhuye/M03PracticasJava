/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud7ex7areaperimetrorectangulopedidolados;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ud7ex7AreaPerimetroRectanguloPedidoLados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribe un programa que pida el ancho y alto de un rectángulo y muestre
        por pantalla su área y su perímetro. Implementa y utiliza las funciones:
        double perimetroRectangulo(double ancho, double alto) // Devuelve el perímetro
        double areaRectangulo(double ancho, double alto) // Devuelve el área*/
        double ancho, alto;
        double perimetro, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el ancho del rectangulo: ");
        ancho = sc.nextDouble();
        System.out.println("Introduce el alto del rectangulo: ");
        alto = sc.nextDouble();
        
        perimetro = calcularPerimetro(ancho, alto);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
        
        area = calcularArea(ancho,alto);
        System.out.println("El area del rectangulo es: " + area);
    }
    /**
     * Suma los 4 lados y da el perimetro
     * @param ancho
     * @param alto
     * @return 
     */
    public static double calcularPerimetro(double ancho, double alto) {
        double perimetroTotal;
        perimetroTotal= ancho + ancho + alto + alto;
        return perimetroTotal;
    }
    /**
     * multiplica el ancho por el alto y da el area del rectangulo
     * @param ancho
     * @param alto
     * @return 
     */
    public static double calcularArea(double ancho, double alto) {
        double areaTotal;
        areaTotal = ancho * alto; 
        return areaTotal;
    }
    
}
