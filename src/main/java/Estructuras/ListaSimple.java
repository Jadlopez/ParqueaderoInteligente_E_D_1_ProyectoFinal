/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

import Estructuras.Nodo;

/**
 *
 * @author juane
 */
public class ListaSimple {
     private Nodo primero;
    private Nodo ultimo;
    private int tamanio;

    public ListaSimple() {
        this.primero = null;
        this.ultimo = null;
        this.tamanio = 0;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Lista_Simple{" + "primero=" + primero + ", ultimo=" + ultimo + ", tamanio=" + tamanio + '}';
    }

    public boolean vacia() {
        return primero == null && ultimo == null && tamanio == 0;
    }

    public void Ingresar_Primero(Object dato) {
        Nodo nuevo = new Nodo(dato, primero);
        if (vacia()) {
            ultimo = nuevo;
        }
        primero = nuevo;
        tamanio++;
    }

    public void Ingresar_Ultimo(Object dato) {
        Nodo nuevo = new Nodo(dato);
        if (vacia()) {
            primero = ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);

        }
        ultimo = nuevo;
        tamanio++;

    }

    public void Eliminar_Primero() {
        if (!vacia()) {
            if (primero == ultimo) {
                primero = ultimo = null;
            } else {
                primero = primero.getSiguiente();
            }
            tamanio--;
        }

    }

    public void Eliminar_Ultimo() {
        if (!vacia()) {
            if (primero == ultimo) {
                primero = ultimo = null;
            } else {
                Nodo aux = primero;
                while (aux.getSiguiente() != ultimo) {
                    aux = aux.getSiguiente();
                }
                ultimo = aux;
                ultimo.setSiguiente(null);

            }
            tamanio--;
        }
    }

    public String Mostrar_lista() {
        String lista = "vacia";
        if (!vacia()) {
            lista = "";
            Nodo aux = primero;
            while (aux != null) {
                lista += aux.getDato() + "  ";
                aux = aux.getSiguiente();
            }
        }
        return lista;
    }

}
