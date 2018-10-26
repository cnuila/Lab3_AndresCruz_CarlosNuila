/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_andrescruz_carlosnuila;

import java.util.ArrayList;
import java.util.Scanner;
<<<<<<< HEAD

=======
>>>>>>> 7b39023ec5d17814da582b1dd996cdbfa63d0ff9

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
<<<<<<< HEAD

        ArrayList<Ejercito> listaEjercito = new ArrayList();
        ArrayList<Arma> listaArma = new ArrayList();
=======
        ArrayList <Ejercito> listaEjercito = new ArrayList();
        ArrayList <Arma> listaArma = new ArrayList();
>>>>>>> 7b39023ec5d17814da582b1dd996cdbfa63d0ff9
        while (opcionMenu != 5) {
            System.out.println("1)Crear Ejercitos\n"
                    + "2)Crear Soldados\n"
                    + "3)Crear Armas\n"
                    + "4)Hacer Guerra\n"
                    + "5)Salir");
            System.out.println("Ingrese su opcion:");
            opcionMenu = sc.nextInt();
            if (opcionMenu == 1) {
                int opcionEjercito = 0;
                while (opcionEjercito != 5) {
                    System.out.println("1)Crear Ejercito\n"
                            + "2)Modificar Ejercito\n"
                            + "3)Eliminar Ejercito\n"
                            + "4)Listar Ejercito\n"
                            + "5)Atras");
                    System.out.println("Ingrese su opcion:");
                    opcionEjercito = sc.nextInt();

                    if (opcionEjercito == 1) {
                        System.out.print("Ingrese el nombre del ejercito: ");
                        String nombre = sc.next();
                        System.out.print("Ingrese la region del ejercito: ");
                        String region = sc.next();
                        System.out.print("Ingrese el dinero del ejercito: ");
                        double dinero = sc.nextDouble();
                        listaEjercito.add(new Ejercito(nombre, region, dinero));
                    }

                    if (opcionEjercito == 2) {
                        System.out.print("Seleccione el ejercito a utilizar: ");
                        int posicionEjercito = sc.nextInt();
                        if (posicionEjercito < listaEjercito.size()) {
                            System.out.println("1)Nombre del ejercito\n"
                                    + "2)Region del ejercito\n"
                                    + "3)Dinero del ejercito\n"
                                    + "4)Atras");
                            System.out.print("Seleccione el aspecto a modificar: ");
                            int opcionModicar = sc.nextInt();
                            if (opcionModicar == 1) {
                                System.out.print("Ingrese el nombre del ejercito: ");
                                String nombre = sc.next();
                                listaEjercito.get(posicionEjercito).setNombre(nombre);
                                System.out.println("Modificacion exitosa");
                            }
                            if (opcionModicar == 2) {
                                System.out.print("Ingrese la region del ejercito: ");
                                String region = sc.next();
                                listaEjercito.get(posicionEjercito).setRegion(region);
                                System.out.println("Modificacion exitosa");
                            }
                            if (opcionModicar == 3) {
                                System.out.print("Ingrese el dinero del ejercito: ");
                                double dinero = sc.nextDouble();
                                listaEjercito.get(posicionEjercito).setDinero(dinero);
                                System.out.println("Modificacion exitosa");
                            }
                        } else {
                            System.out.println("El nodo seleccionado no existe");
                        }
<<<<<<< HEAD
                    }

                    if (opcionEjercito == 3) {
                        System.out.print("Ingrese la posicion del ejercito: ");
                        int posicionEjercito = sc.nextInt();
                        if (posicionEjercito < listaEjercito.size()) {
                            listaEjercito.remove(posicionEjercito);
                        } else {
                            System.out.println("El nodo seleccionado no existe");
                        }
                    }
                }
            }

            if (opcionMenu == 2) {
                System.out.print("Ingrese la posicion del ejercito: ");
                int posicionEjercito = sc.nextInt();
                if (posicionEjercito < listaEjercito.size()) {
                    int opcionSoldado = 0;
                    while (opcionSoldado != 5) {
                        System.out.print("1)Crear Soldado\n"
                                + "2)Modificar Soldado\n"
                                + "3)Eliminar Soldado\n"
                                + "4)Listar Soldado\n"
                                + "5)Atras");
                        System.out.print("Ingrese su opcion: ");
                        opcionSoldado = sc.nextInt();

                        if (opcionSoldado == 1) {
                            if (listaEjercito.get(posicionEjercito).getListaSoldado().size() < 5) {
                                System.out.print("Ingrese el nombre del Soldado: ");
                                String nombre = sc.next();
                                System.out.print("Ingrese el lugar de nacimiento del Soldado: ");
                                String lugar = sc.next();
                                System.out.print("Ingrese la edad del soldado: ");
                                int edad = sc.nextInt();
                                System.out.print("Ingrese la salud del soldado: ");
                                int salud = sc.nextInt();
                                int contGenerales = 0;
                                int contCaballeros = 0;
                                int contEjecutor = 0;
                                for (Soldado temp : listaEjercito.get(posicionEjercito).getListaSoldado()) {
                                    if (temp instanceof General) {
                                        contGenerales++;
                                    }
                                    if (temp instanceof Caballero) {
                                        contCaballeros++;
                                    }
                                    if (temp instanceof Ejecutor) {
                                        contEjecutor++;
                                    }
                                }
                                System.out.print("1)General"
                                        + "2)Caballero"
                                        + "3)Ejecutor");
                                System.out.print("Ingrese el tipo de soldado");
                                int tipoSoldado = sc.nextInt();
                                while (tipoSoldado > 3) {
                                    System.out.print("Ingrese el tipo de soldado");
                                    tipoSoldado = sc.nextInt();
                                }
                                if (tipoSoldado == 1){
                                    if (contGenerales == 0){
                                        System.out.print("Ingrese los años al mando: ");
                                        int añoAlmando = sc.nextInt();
                                        listaEjercito.get(posicionEjercito).getListaSoldado().add(new General(añoAlmando, nombre, lugar, edad, salud));
                                    }
                                }
                                if (tipoSoldado == 2){
                                    if (contCaballeros <= 3){
                                        listaEjercito.get(posicionEjercito).getListaSoldado().add(new Caballero(nombre, lugar, edad, salud));
                                    }
                                }
                                if (tipoSoldado == 3){
                                    if (contEjecutor == 0){
                                        listaEjercito.get(posicionEjercito).getListaSoldado().add(new Ejecutor(nombre, lugar, edad, salud));
                                    }
                                }
                            } else {
                                System.out.print("Ya tiene el maximo numero de soldados");
                            }
                        }
                        if (opcionSoldado == 2){
                            System.out.print("Ingrese la posicion del soldado: ");
                            int posicionSoldado = sc.nextInt();
                            if (posicionSoldado < listaEjercito.get(posicionEjercito).getListaSoldado().size()){
                                
                            } else {
                                System.out.println("El nodo seleccionado no esta disponible");
                            }
                        }
                    }
=======
                    }                    
>>>>>>> 7b39023ec5d17814da582b1dd996cdbfa63d0ff9
                }
            }
        }
    }

    public static void espacio() {
        for (int i = 0; i < 10; i++) {
            System.out.print("----");
        }
    }
<<<<<<< HEAD
    
=======
>>>>>>> 7b39023ec5d17814da582b1dd996cdbfa63d0ff9
}
