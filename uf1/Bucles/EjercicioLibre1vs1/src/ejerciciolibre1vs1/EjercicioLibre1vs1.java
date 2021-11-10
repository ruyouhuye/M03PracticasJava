/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciolibre1vs1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author regig
 */
public class EjercicioLibre1vs1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        String nombreJugador;
        int jugadorHP=150, jugadorDMG= r.nextInt(6)+30;
        char jugadorMovimiento;
        int Zombie=0,zombieHP=160, zombieDMG= r.nextInt(6)+30;
        int hombreLoboHP=175, hombreLoboDMG= r.nextInt(6)+35;
        int vampiroHP=180, vampiroDMG= r.nextInt(6)+32;
        
        System.out.println("Lucharas contra un enemigo aleatorio. ");
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce tu nombre: ");
        nombreJugador = teclado.nextLine();
        System.out.println("Hola " + nombreJugador + ", aqui empieza tu aventura, mucha suerte!!!");
        
        int enemigo = r.nextInt(3)+1;  
        int enemigoHP=0, enemigoDMG=0;
        int enemigoMovimiento = r.nextInt(2);//r.nextInt(2), con un 2 dentro sale 0 o 1
        //Haremos que si el movimiento de enemigo es 0 este bloquea ataque y si es 1 este ataca
        
        if(enemigo == 1){//random=1 el enemigo sera el zombie
            System.out.println("Tu enmigo sera un Zombie!");
            enemigoHP = zombieHP;
            enemigoDMG = zombieDMG;
        }
        else if(enemigo == 2){//random=2 el enemigo sera el hombre lobo
            System.out.println("Tu enmigo sera un Hombre Lobo!!");
            enemigoHP = hombreLoboHP;
            enemigoDMG = hombreLoboDMG;
        }
        else if(enemigo == 3){//random=3 el enemigo sera el vampiro
            System.out.println("Tu enmigo sera un Vampiro!!!");
            enemigoHP = hombreLoboHP;
            enemigoDMG = hombreLoboDMG;
        }
        int ronda=1;
        while(jugadorHP > 0 && enemigoHP >0){//mientras la de los dos sea mayor que 0 seguira entrando en el bucle
            System.out.println("---------- Ronda "+ronda+" ----------");
            System.out.println("Jugador: " + nombreJugador + " HP: "+ jugadorHP);
            System.out.println("Enemigo HP: " + enemigoHP);
            System.out.print("Escoge tu movimiento: Atacar (A/a) o Bloquear (B/b): ");
            jugadorMovimiento = teclado.nextLine().charAt(0);
            //si el usuario introduce algo que no sea: A, a, B, b, le vuelve a pedir
            if((jugadorMovimiento != 'A') && (jugadorMovimiento != 'a') && (jugadorMovimiento != 'B') && (jugadorMovimiento != 'b')){
                System.out.println("Escoge un movimiento valido BOBO!!!!");
            }
            //jugador ataca y enemigo bloquea
            else if((jugadorMovimiento == 'A') || (jugadorMovimiento == 'a') && enemigoMovimiento == 0){
                System.out.println("Infliges: " + jugadorDMG + " de daño");
                System.out.println("Pero tu ataque a sido bloqueado :'(");
            }
            //jugador ataca y enemigo ataca
            else if((jugadorMovimiento == 'A') || (jugadorMovimiento == 'a') && enemigoMovimiento == 1){
                enemigoHP = enemigoHP - jugadorDMG;
                jugadorHP = jugadorHP - enemigoDMG;
                System.out.println("Atacas y el enemigo ataca.");
                System.out.println("Haces: "+jugadorDMG+" de daño.");
                System.out.println("Recibes: "+enemigoDMG+" de daño!");
            }
            //jugador bloquea y enemigo ataca
            else if((jugadorMovimiento == 'B') || (jugadorMovimiento == 'b') && enemigoMovimiento == 1){
                System.out.println("El enemigo golpea: "+enemigoDMG+" de daño!");
                System.out.println("Logras bloqueado el ataque con exito");
            }
            //jugador bloquea y enemigo bloquea
            else if((jugadorMovimiento == 'B') || (jugadorMovimiento == 'b') && enemigoMovimiento == 0){
                System.out.println("Ambos habeis bloqueado xD");
            }
            ronda++;
        }//final while
        if(jugadorHP <= 0 && enemigoHP > 0){
            System.out.println("R.I.P. descansa en paz nombre guerrero");
        }
        else if(enemigoHP <= 0 && jugadorHP > 0){
            System.out.println("Has sobrevivido a esta batalla OLE OLE LOS CARACOLE");  
        }
        else{
            System.out.println("No es divertido si os moris los dos ¬¬' ");
        }
    } 
}
