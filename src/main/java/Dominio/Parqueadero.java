
package Dominio;

import Estructuras.Cola;
import Estructuras.ListaSimple;
import Estructuras.Nodo;
import Estructuras.Pila;

public class Parqueadero {

    private String id;
    private String nombre;
    private String direccion;

    private Tarifa tarifa;

    private ListaSimple bahias;       // ListaSimple<Bahia>
    private Cola colaEntrada;         // Cola<Vehiculo>
    private Pila historialTickets;    // Pila<Ticket>

    // Secuencia simple para generar códigos de ticket legibles
    private int secuenciaTicket = 1;


    public Parqueadero(String id, String nombre, String direccion, Tarifa tarifa) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.tarifa = tarifa;

        this.bahias = new ListaSimple();
        this.colaEntrada = new Cola();
        this.historialTickets = new Pila();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

    public ListaSimple getBahias() {
        return bahias;
    }

    public void setBahias(ListaSimple bahias) {
        this.bahias = bahias;
    }

    public Cola getColaEntrada() {
        return colaEntrada;
    }

    public void setColaEntrada(Cola colaEntrada) {
        this.colaEntrada = colaEntrada;
    }

    public Pila getHistorialTickets() {
        return historialTickets;
    }

    public void setHistorialTickets(Pila historialTickets) {
        this.historialTickets = historialTickets;
    }

    public int getSecuenciaTicket() {
        return secuenciaTicket;
    }

    public void setSecuenciaTicket(int secuenciaTicket) {
        this.secuenciaTicket = secuenciaTicket;
    }
    
       @Override
    public String toString() {
        return "Parqueadero{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", totalPlazas="  +
                ", plazasLibres="  +
                ", enColaEntrada=" + (colaEntrada.vacia() ? 0 : contarCola()) +
                '}';
    }

    // Como tu Cola no retorna el dato en Desencolar, contamos recorriendo nodos:
    private int contarCola() {
        int c = 0;
        Nodo n = colaEntrada.getPrimero();
        while (n != null) {
            c++;
            n = n.getSiguiente();
        }
        return c;
    }

}
