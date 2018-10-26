/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_andrescruz_carlosnuila;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Carlos Nuila
 */
public class Lab3_AndresCruz_CarlosNuila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int opcionMenu = 0;
        ArrayList <Ejercito> listaEjercito = new ArrayList();
        listaEjercito.add(new Ejercito("Cyrodill","Tamriel",40000000));
        Random r=new Random();
        listaEjercito.add(new Ejercito("Skyrim","Tamriel",20000000));
        String[]nombres={"Oscar","Joel","Carlos","Andres","Diego","Daniel","Cristopher","Ricardo","Eduardo","Manuel"};
        String[]lugares={"Skyrim","Cyrodill","Valenwood","Elsweyr","Black Marsh","Morrowind"};
        for (int i = 0; i < listaEjercito.size(); i++) {
            for (int j = 0; j < 5; j++) {
            int nom_alea=r.nextInt(10);
            int lug_alea=r.nextInt(6);
            listaEjercito.get(i).getListaSoldado().add(new Soldado(nombres[nom_alea],lugares[lug_alea],(20+r.nextInt(40)),100));
                if (j==0) {
                    listaEjercito.get(i).getListaSoldado().add(new General((1+r.nextInt(10)),nombres[nom_alea],lugares[lug_alea],(20+r.nextInt(40)),100));
                }else{
                    if (j>=1&&j<=2) {
                        listaEjercito.get(i).getListaSoldado().add(new Caballero(nombres[nom_alea],lugares[lug_alea],(20+r.nextInt(40)),100));
                    }else{
                    listaEjercito.get(i).getListaSoldado().add(new Ejecutor(nombres[nom_alea],lugares[lug_alea],(20+r.nextInt(40)),100));
                    }
                }
        }
        }
        ArrayList <Arma> listaArma = new ArrayList();
        while (opcionMenu != 5) {
            System.out.println("1)Crear Ejercitos\n"
                    + "2)Crear Soldados\n"
                    + "3)Crear Armas\n"
                    + "4)Hacer Guerra"
                    + "5)Salir");
            System.out.println("Ingrese su opcion:");
            opcionMenu = sc.nextInt();
            if (opcionMenu == 1) {
                int opcionEjercito = 0;
                while (opcionEjercito != 5) {
                    System.out.println("1)Crear Ejercito\n"
                            + "2)Modificar Ejercito\n"
                            + "3)Eliminar Ejercito\n"
                            + "4)Listar Ejercito"
                            + "5)Atras");
                    System.out.println("Ingrese su opcion:");
                    opcionEjercito = sc.nextInt();
                    
                    if (opcionEjercito == 1){
                        System.out.print("Ingrese el nombre del ejercito: ");
                        String nombre = sc.next();
                        System.out.print("Ingrese la region del ejercito: ");
                        String ejercito = sc.next();
                        System.out.print("Ingrese el dinero del ejercito: ");
                        double dinero = sc.nextDouble();
                        listaEjercito.add(new Ejercito(nombre, ejercito, dinero));
                    }
                    
                    if (opcionEjercito == 2){
                        System.out.print("Seleccione el ejercito a utilizar: ");
                        int posicionEjercito = sc.nextInt();
                        if (posicionEjercito < listaEjercito.size()){
                            
                        } else {
                            System.out.println("El ejercito seleccionado no existe");
                        }
                    }
                    if(opcionEjercito == 4){
                    opc4(listaEjercito);
                    }
                }
            }
        }
    }

    public static void espacio() {
        for (int i = 0; i < 10; i++) {
            System.out.print("----");
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void opc4(ArrayList<Ejercito>listaEjercito){
        for (int i = 0; i < listaEjercito.size(); i++) {
            System.out.println(listaEjercito.get(i));
            espacio();
            System.out.println("");
        }
        
    }
}
