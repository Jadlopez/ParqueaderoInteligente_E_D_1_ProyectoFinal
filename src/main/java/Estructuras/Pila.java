/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author juane
 */
public class Pila {
    
    private Nodo cima;
    private int tamaño;

    public Pila() {
        this.cima = null;
        this.tamaño = 0;
    }

    public Nodo getCima() {
        return cima;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setCima(Nodo cima) {
        this.cima = cima;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Pilas{" + "cima=" + cima + ", tama\u00f1o=" + tamaño + '}';
    }

    public boolean Vacia() {

        return cima == null && tamaño == 0;
    }

    public void Apilar(Object dato) {
        Nodo nuevo = new Nodo(dato, cima);

        cima = nuevo;
        tamaño++;
    }

    public void Desapilar() {

        if (!Vacia()) {
            cima = cima.getSiguiente();
            tamaño--;
        }
    }

    public String Mostrar_por_cima() {

        String mostrar = "";
        if (!Vacia()) {
            Nodo aux = cima;
            while (cima != null) {
                mostrar += cima.getDato() + "\n";
                cima = cima.getSiguiente();
            }
            cima = aux;
        }
        return mostrar;
    }

    public String Mostrar_por_aux() {

        String mostrar = "";
        if (!Vacia()) {
            Nodo aux = cima;
            while (aux != null) {
                mostrar += aux.getDato() + "\n";

                aux = aux.getSiguiente();
            }

        }
        return mostrar;
    }

    public Pila Inversa() {

        Pila aux = new Pila();
        if (!Vacia()) {
            while (!Vacia()) {
                aux.Apilar(cima.getDato());
                this.Desapilar();
            }

        }
        return aux;

    }

}
