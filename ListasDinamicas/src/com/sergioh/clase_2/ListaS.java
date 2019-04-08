/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergioh.clase_2;

/**
 *implementar dos metodo de addfirst y deletefirst
 * @author PC-48
 */
public class ListaS {

    private Nodo primero;
    private Nodo ultimo;
    private int tam;

    public ListaS() {
        this.primero = null;
        this.ultimo = null;
        this.tam = 0;

    }

    public boolean siVacio() {
        return (this.primero == null);
    }

    public ListaS addLast(int dato) {
        if (siVacio()) {
            Nodo nuevo = new Nodo(dato);
            primero = nuevo;
            ultimo = nuevo;
            nuevo.nodoDer = nuevo;
        } else {
            Nodo nuevo = new Nodo(dato);
            nuevo.nodoDer = null;
            ultimo.nodoDer = nuevo;
            ultimo = nuevo;
        }
        this.tam++;
        return this;

    }
    //BORRAR NODO

    public Nodo deleteLast() {
        Nodo eliminar = null;
        if (siVacio()) {
            System.out.println("la lista esta vacia");
            return null;
        }
        if (primero == ultimo) {
            primero = null;
            ultimo = null;
        } else {
            Nodo actual = primero;
            while (actual.nodoDer != ultimo) {
                actual = actual.nodoDer;

            }
            eliminar = actual.nodoDer;
            actual.nodoDer = null;
            ultimo = actual;
        }
        this.tam--;
        return eliminar;

    }

    public void tam() {
        System.out.println("El tamaño de la lista es: " + this.tam);
    }

    public void imprimir() {
        if (tam != 0) {
            Nodo temp = primero;
            String str = "";

            for (int i = 0; i < this.tam; i++) {
                str = str + temp.dato + "\n";
                temp = temp.nodoDer;
            }
            System.out.println(str);
        }
    }

}
