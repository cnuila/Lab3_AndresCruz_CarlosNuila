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
    protected String nombre;
    protected double alcance;
    protected double precio;
    protected String imprimir="";
    
    public Arma(String nombre, double alcance, double precio) {
        this.nombre = nombre;
        this.alcance = alcance;
        this.precio = precio;
    }

    
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
        return imprimir+"\n";
    }
    
}
