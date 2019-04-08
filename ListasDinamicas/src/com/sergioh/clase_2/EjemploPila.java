/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergioh.clase_2;

import java.util.Scanner;

/**
 *
 * @author PC-48
 */
public class EjemploPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite el tamaño de la pila ");
        int tam = tc.nextInt();
        int[] pila = new int[tam];
        int[] arreglo = new int[tam];
        int[] suma = new int[tam];
        System.out.println("");

        int po = 1;
        for (int i = (tam - 1); i > -1; i--) {
            System.out.print("dogite la posicion " + po + "De la pila ");
            int pos = tc.nextInt();
            pila[i] = pos;
            po++;
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("digite un numero en la posicion[ " + (i + 1) + " ] : ");
            int pos = tc.nextInt();
            arreglo[i] = pos;

        }
        System.out.println("La pila es: ");
        for (int i : pila) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("El arreglo es: ");

        for (int i : arreglo) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("Mostra Suma");
        for (int i = 0; i < suma.length; i++) {
            suma[i] = pila[i] + arreglo[i];
            System.out.print(suma[i] + " ");
        }
    }

}
