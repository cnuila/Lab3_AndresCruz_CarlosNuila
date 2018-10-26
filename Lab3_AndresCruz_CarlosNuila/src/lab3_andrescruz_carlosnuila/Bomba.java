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
public class Bomba extends Arma{
    String material;

    public Bomba(String material, String nombre, double alcance, double precio) {
        super(nombre, alcance, precio);
        super.imprimir+="Nombre del Arma=" + nombre + " Alcance del Arma=" + alcance + " Precio=" + precio+" Material="+material+"\n";
        this.material = material;
    }

    
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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
