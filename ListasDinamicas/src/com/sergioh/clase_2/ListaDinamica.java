/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergioh.clase_2;

/**
 *
 * @author PC-48
 */
public class ListaDinamica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //adicionar primero y borrar primero
        
        int a = 5, b = 10, c = 15, d = 20, e = 25;
        ListaS arreglo = new ListaS();

        arreglo.addLast(a);
        arreglo.addLast(b);
        arreglo.addLast(c);
        arreglo.addLast(d);
        arreglo.addLast(e);
        arreglo.tam();
        arreglo.imprimir();
        arreglo.deleteLast();
        arreglo.imprimir();
        //arreglo.deleteLast();

    }

}
