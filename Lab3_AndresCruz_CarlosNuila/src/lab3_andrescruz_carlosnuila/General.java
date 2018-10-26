/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_andrescruz_carlosnuila;

/**
 *
 * @author Carlos Nuila
 */
public class General extends Soldado {
    
    int añoAlmando;

    public General(int añoAlmando, String nombre, String lugar, int edad, int salud) {
        super(nombre, lugar, edad, salud);
        this.añoAlmando = añoAlmando;
    }

    public int getAñoAlmando() {
        return añoAlmando;
    }

    public void setAñoAlmando(int añoAlmando) {
        this.añoAlmando = añoAlmando;
    }

    @Override
    public String toString() {
        return "General{" + "anioAlmando=" + añoAlmando + '}';
    }
    
    
    
    
    
}
