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
public class Ejecutor extends Soldado {

    public Ejecutor(String nombre, String lugar, int edad, int salud) {
        super(nombre, lugar, edad, salud);
        super.rango="Ejecutor";
        super.imprimir+="\nNombre="+nombre+" Nacionalidad="+lugar+" Edad="+edad+" Salud="+salud+" Rango= Ejecutor" + "\nArmas en posesion=\n"+arma;
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
    public String getLugar() {
        return lugar;
    }

    @Override
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int getSalud() {
        return salud;
    }

    @Override
    public void setSalud(int salud) {
        this.salud = salud;
    }

    @Override
    public ArrayList<Arma> getArma() {
        return arma;
    }

    
    
}
