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
    
//        listaEjercito.add(new Ejercito("Cyrodill","Tamriel",40000000));
//        Random r=new Random();
//        listaEjercito.add(new Ejercito("Skyrim","Tamriel",20000000));
//        String[]nombres={"Oscar","Joel","Carlos","Andres","Diego","Daniel","Cristopher","Ricardo","Eduardo","Manuel"};
//        String[]lugares={"Skyrim","Cyrodill","Valenwood","Elsweyr","Black Marsh","Morrowind"};
//        for (int i = 0; i < listaEjercito.size(); i++) {
//            for (int j = 0; j < 5; j++) {
//            int nom_alea=r.nextInt(10);
//            int lug_alea=r.nextInt(6);
//            listaEjercito.get(i).getListaSoldado().add(new Soldado(nombres[nom_alea],lugares[lug_alea],(20+r.nextInt(40)),100));
//                if (j==0) {
//                    listaEjercito.get(i).getListaSoldado().add(new General((1+r.nextInt(10)),nombres[nom_alea],lugares[lug_alea],(20+r.nextInt(40)),100));
//                }else{
//                    if (j>=1&&j<=2) {
//                        listaEjercito.get(i).getListaSoldado().add(new Caballero(nombres[nom_alea],lugares[lug_alea],(20+r.nextInt(40)),100));
//                    }else{
//                    listaEjercito.get(i).getListaSoldado().add(new Ejecutor(nombres[nom_alea],lugares[lug_alea],(20+r.nextInt(40)),100));
//                    }
//                }
//        }
//        }
//    public static void opc4(ArrayList<Ejercito>listaEjercito){
//        for (int i = 0; i < listaEjercito.size(); i++) {
//            System.out.println(listaEjercito.get(i));
//            espacio();
//            System.out.println("");
//        }
//        
//    }
    
    
    
}
