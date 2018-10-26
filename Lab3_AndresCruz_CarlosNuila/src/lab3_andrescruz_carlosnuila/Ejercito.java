/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_andrescruz_carlosnuila;

import java.util.ArrayList;

/**
 *
 * @author Carlos Nuila
 */
public class Ejercito {
    
    private String nombre;
    private String region;
    private int victorias = 0;
    private double dinero;
    private ArrayList<Soldado> listaSoldado = new ArrayList();

    public Ejercito(String nombre, String region, double dinero) {
        this.nombre = nombre;
        this.region = region;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Soldado> getListaSoldado() {
        return listaSoldado;
    }

    public void setListaSoldado(ArrayList<Soldado> listaSoldado) {
        this.listaSoldado = listaSoldado;
    }
    
    @Override
    public String toString() {
        return "Nombre del Ejercito=" + nombre + " Region=" + region + " Numero de Victorias=" + victorias + " Dinero total=" + dinero + " \nSoldados=\n" + listaSoldado;
    }
    
    
    
    
    
}
