/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_andrescruz_carlosnuila;

/**
 *
 * @author MBanegas
 */
public class Arma {
    String nombre;
    double alcance;
    double precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAlcance() {
        return alcance;
    }

    public void setAlcance(double alcance) {
        this.alcance = alcance;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Nombre del Arma=" + nombre + " Alcance del Arma=" + alcance + " Precio=" + precio+"\n";
    }
    
}
