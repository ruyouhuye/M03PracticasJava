/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucleclashdmgatorre;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class BucleClashDmgATorre {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        int lenyadorlvl, lenyadorDmg = 0 , lenyadorHP = 0; 
        int torreLvl, torreHp = 0, torreDmg = 0;
        int lenyadorAtorre = 0, torreAlenyador = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce nivel de leñador: ");
        lenyadorlvl = teclado.nextInt();
        if(lenyadorlvl==9){
            lenyadorDmg = 200;
            lenyadorHP = 1060;
        }
        else if(lenyadorlvl==10){
            lenyadorDmg = 220;
            lenyadorHP = 1166;
        }
        else if(lenyadorlvl==11){
            lenyadorDmg = 242;
            lenyadorHP = 1282;
        }
        else if(lenyadorlvl==12){
            lenyadorDmg = 266;
            lenyadorHP = 1409;
        }
        else if(lenyadorlvl==13){
            lenyadorDmg = 292;
            lenyadorHP = 1547;
        }
        System.out.print("Introduce el nivel de la torre: ");
        torreLvl = teclado.nextInt();
        if(torreLvl==9){
            torreHp = 2534;
            torreDmg = 90;
        }
        else if(torreLvl==10){
            torreHp = 2786;
            torreDmg = 99;
        }
        else if(torreLvl==11){
            torreHp = 3052;
            torreDmg = 109;
        }
        else if(torreLvl==12){
            torreHp = 3346;
            torreDmg = 119;
        }
        else if(torreLvl==13){
            torreHp = 3668;
            torreDmg = 131;
        }
        System.out.println("Vida Leñador: " + lenyadorHP + ". Daño Leñador: " + lenyadorDmg);
        System.out.println("Vida de la torre: " + torreHp + ". Dañi Torre: " + torreDmg);
        while(torreHp > 0 && lenyadorHP > 0){
            torreHp = torreHp - lenyadorDmg;
            lenyadorHP = lenyadorHP - torreDmg*2;
            Thread.sleep(500);
            lenyadorAtorre++; 
            torreAlenyador++;
            /*System.out.println("TORREHP restante: " + torreHp);
            System.out.println("LEÑADORHP: " + lenyadorHP);*/
        }
        if(torreHp <= 0 && lenyadorHP > 0){
            System.out.println("Gana el Leñador ");
            System.out.println("Has tirado la torre en: "+lenyadorAtorre);   
        }
        else if(lenyadorHP <= 0 && torreHp > 0){
            System.out.println("Gana la Torre ");
            System.out.println("La torre a matado al Leñador en: "+torreAlenyador);   
        }
        else{
            System.out.println("EMPATE");
        }  
    }
    
}
