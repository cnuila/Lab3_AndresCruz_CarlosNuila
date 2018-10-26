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
public class Rifle extends Arma{
    boolean automatico;

    public Rifle(boolean automatico, String nombre, double alcance, double precio) {
        super(nombre, alcance, precio);
        super.imprimir+="Nombre del Arma=" + nombre + " Alcance del Arma=" + alcance + " Precio=" + precio+" Automatico="+automatico+"\n";
        this.automatico = automatico;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public double getAlcance() {
        return alcance;
    }

    @Override
    public void setAlcance(double alcance) {
        this.alcance = alcance;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
