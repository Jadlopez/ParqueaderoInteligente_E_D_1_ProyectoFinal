
package Dominio;


public class Vehiculo {
    
    protected String Marca;
    protected String Modelo;
    protected String color;
    protected String placa;

    public Vehiculo(String Marca, String Modelo, String color, String placa) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.color = color;
        this.placa = placa;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    
    
    public Vehiculo() {
        this.color = "";
        this.placa = "";
    }

    public String getColor() {
        return color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Vehiculos{" + "color=" + color + ", placa=" + placa + '}';
    }
    
    
    
    
    
}
