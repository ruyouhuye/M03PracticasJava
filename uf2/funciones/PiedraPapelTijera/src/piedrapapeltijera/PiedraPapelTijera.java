/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piedrapapeltijera;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class PiedraPapelTijera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int tirada_ordenador(),random de 0 a 2, 0 piedra, 1 papel, 2 tijera
        //int tirada_usuario, scanner, comprobar si es valido el num introducido
        /*int comprobar_quien_gana(int tirada_ordenador, tirada_usuario) 
        comprobar la jugada, ganajugador(1), ganamaquina(-1), empate(0)*/
        /*int aumentar_contador(int contador), aumentara el contador en 1 y lo 
        retorna*/
        /*void mostrar_jugada(int jugada), transforma la jugada numerica en una
        salida por pantalla: piedra/papel/tijera*/
        /*boolean seguir_jugando(int contadorjugador, int contadormaquina), 
        si algun contador es 5 o mas, ya no debo volver a jugar(false), sino
        devuelve (true)*/
        int tirada_usuario, tirada_ordenador, ganador;
        int contadorjugador=0, contadormaquina=0;
        do{
        tirada_usuario = jugadaUsuario();
        System.out.print("Has elegido....");
        mostrar_jugada(tirada_usuario);
        
        tirada_ordenador = jugadaMaquina();
        System.out.print("El ordenador ha elegido....");
        mostrar_jugada(tirada_ordenador);
        
        ganador = comprobarQuienGana(tirada_ordenador, tirada_usuario);
        System.out.println("Ganador: " + ganador);
        if(ganador==1){
            contadorjugador=aumentar_contador(contadorjugador);
        }
        else if(ganador==-1){
            contadormaquina=aumentar_contador(contadormaquina);
        }
        mostar_marcador(contadorjugador, contadormaquina);
        }while(seguir_jugando(contadorjugador, contadormaquina));
    }
    
    public static int jugadaMaquina(){
        Random r = new Random();
        int jugadaMaquina= r.nextInt(3)+0;//va de 0 a 2
                    //con el +0 empieza desde 0, si pongo +10 empieza desdel 10
        return jugadaMaquina;
    }

    public static int jugadaUsuario() {
        Scanner sc = new Scanner(System.in);
        int jugadaUsuario;
        do{
            System.out.println("Introduce que quieres sacar, Piedra(0), Papel(1),  Tijera(2):");
            jugadaUsuario = sc.nextInt();
        }while(jugadaUsuario != 0 && jugadaUsuario != 1 && jugadaUsuario != 2);
        //si es diferente de 0 y 1 y 2 continua
        //salgo si es igual a 0 o igual a 1 o igual a 2.(en el while se escribe lo contrario)
        return jugadaUsuario;
    }

    public static int comprobarQuienGana(int tirada_ordenador, int tirada_usuario) {
        //ganajugador(1), ganamaquina(-1), empate(0)
        //0 piedra, 1 papel, 2 tijera
        int comprobacion=0;
        if(tirada_ordenador == tirada_usuario){
            comprobacion = 0;
        }
        //Casos en los que gana el ordenador
        else if(tirada_ordenador == 0 && tirada_usuario == 2){
            comprobacion = -1;
        }
        else if(tirada_ordenador == 1 && tirada_usuario == 0){
            comprobacion = -1;
        }
        else if(tirada_ordenador == 2 && tirada_usuario == 1){
            comprobacion = -1;
        }
        //Casos en los que gana el usuario
        else if(tirada_usuario == 0 && tirada_ordenador == 2){
            comprobacion = 1;
        }
        else if(tirada_usuario == 1 && tirada_ordenador == 0){
            comprobacion = 1;
        }
        else if(tirada_usuario == 2 && tirada_ordenador == 1){
            comprobacion = 1;
        }
        return comprobacion;
    }

    public static int aumentar_contador(int contador){
        contador++;
        return contador;
    }
    
    public static void mostrar_jugada(int jugada){
        //0 piedra, 1 papel, 2 tijera
        switch (jugada) {
            case 0:
                System.out.println("Piedra");
                break;
            case 1:
                System.out.println("Papel");
                break;
            case 2:
                System.out.println("Tijera");
                break;
            default:
                System.out.println("Incorrecto");
                break;
        }
    }
    
    public static boolean seguir_jugando(int contadorjugador, int contadormaquina){
        boolean seguir = true;
        if(contadorjugador>=5 || contadormaquina>=5){
            seguir = false;
        }
        return seguir;
    }

    private static void mostar_marcador(int contadorjugador, int contadormaquina) {
        System.out.println("Jugador: "+ contadorjugador);
        System.out.println("Ordenador: "+contadormaquina);
    }
}
