/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author juane
 */
public class Cola {
     private Nodo ultimo;
    private Nodo primero;
    private int tamaño;

    public Cola() {
        this.ultimo = null;
        this.primero = null;
        this.tamaño = 0;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Colas{" + "ultimo=" + ultimo + ", primero=" + primero + ", tama\u00f1o=" + tamaño + '}';
    }

    public boolean vacia() {
        return primero == null && ultimo == null && tamaño == 0;
    }

    public void Encolar(Object dato) {
        Nodo nuevo = new Nodo(dato);
        if (vacia()) {
            primero = ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);

        }
        ultimo = nuevo;
        tamaño++;

    }

    public void Desencolar() {
        if (!vacia()) {
            if (primero == ultimo) {
                primero = ultimo = null;
            } else {
                primero = primero.getSiguiente();
            }
            tamaño--;
        }

    }

    public String MostrarCola() {
        String cola = "vacia";
        if (!vacia()) {
            cola = "";
            Nodo aux = primero;
            while (aux != null) {
                cola += aux.getDato() + "\n";
                aux = aux.getSiguiente();
            }
        }
        return cola;
    }

}
