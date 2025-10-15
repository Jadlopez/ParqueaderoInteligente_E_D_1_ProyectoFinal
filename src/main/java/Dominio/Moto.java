
package Dominio;


public class Moto extends Vehiculo {
    
    private String cilindraje;
    private boolean automatica;

    public Moto(String cilindraje, boolean automatica, String Marca, String Modelo, String color, String placa) {
        super(Marca, Modelo, color, placa);
        this.cilindraje = cilindraje;
        this.automatica = automatica;
    }

    public Moto(String cilindraje, boolean automatica) {
        this.cilindraje = cilindraje;
        this.automatica = automatica;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public boolean isAutomatica() {
        return automatica;
    }

    @Override
    public String getMarca() {
        return Marca;
    }

    @Override
    public String getModelo() {
        return Modelo;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public void setAutomatica(boolean automatica) {
        this.automatica = automatica;
    }

    @Override
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    @Override
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Motos{" + "cilindraje=" + cilindraje + ", automatica=" + automatica + '}';
    }
    
    
    
    
    
    
    
    
    
}
