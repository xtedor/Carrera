/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrera;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Santiago cadena
 */
public class Carrera {

//    static int[] lanzamiento() {
//
//        int[] resultados = new int[2]; //Se tiran tres dados
//
//        resultados[0] = (int) (Math.random() * 6 + 1); //Primer dado
//        resultados[1] = (int) (Math.random() * 6 + 1); //Segundo dado
//
//        return resultados;
//    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // TODO code application logic here

        System.out.println("Digite la cantidad de jugadores Minimo 2 maximo 4");
        int n = Integer.parseInt(sc.nextLine());
        int num = n;
        while (num < 2 || num > 4) {
            System.out.println("ERROR  Digite la cantidad de jugadores Minimo 2 maximo 4");
            num = Integer.parseInt(sc.nextLine());
        }

        System.out.println("====================================================================");
        System.out.println("Elija un nivel de tablero");
        System.out.println("1. Nivel básico (Tablero de 20 posiciones)");
        System.out.println("2. Nivel intermedio (Tablero de 30 posiciones)");
        System.out.println("3. Nivel avanzado (Tablero de 50 posiciones)");
        System.out.println("====================================================================");

        int table = Integer.parseInt(sc.nextLine());
        int tab=table;
        while (tab != 1 && tab != 2 && tab != 3) {
            System.out.println("ERROR  Digite un nivel de tablero valido(1,2 o 3)");
            tab = Integer.parseInt(sc.nextLine());
        }

        int opcion = 0;
        if (tab == 1 || tab == 2 || tab == 3) {

            switch (tab) {
                case 1:
                    opcion = 20;
                    break;
                case 2:
                    opcion = 30;
                    break;
                case 3:
                    opcion = 50;
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
        
        
        System.out.println("====================================================================");
        System.out.println("EL JUEGO HA COMENZADO");

        int[] puntaje = new int[n];
        int[] pares = new int[n];
        int i = 0;
        while (puntaje[i] < opcion || pares[i] == 3) {
            System.out.println("====================================================================");
            System.out.println("*Se lanzan los dados*");

            int dado1 = (int) (Math.random() * 6 + 1);
            int dado2 = (int) (Math.random() * 6 + 1);
            if (dado1 == dado2) {
                pares[i]++;
            } else {
                pares[i] = 0;
            }
            puntaje[i] += dado1 + dado2;
            System.out.println("Jugador " + (i + 1) + " esta en la posicion:" + puntaje[i]);
            System.out.println("====================================================================");

            if (puntaje[i] < opcion) {
                i++;
            }

            if (i == puntaje.length) {
                i = 0;
            }

        }

        System.out.println("EL JUGADOR NUMERO: " + (i + 1) + " ES EL GANADOR");
        System.out.println("====================================================================");
        System.out.println("====================================================================");
        System.out.println("====================================================================");
         System.out.println("DESEAS JUGAR DE NUEVO? s/n");
         String f=sc.nextLine();
        if(f.equals("s")){
            Carrera.main (null);
            System.out.print("\f");
        }else if(f.equals("n")){
            System.exit(0);
        }
        

    }

}
