/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_andrescruz_carlosnuila;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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
        ArrayList<Ejercito> listaEjercito = new ArrayList();
        ArrayList<Arma> listaArma = new ArrayList();
        listaEjercito.add(new Ejercito("Cyrodill", "Tamriel", 40000000));
        Random r = new Random();
        listaEjercito.add(new Ejercito("Skyrim", "Tamriel", 20000000));
        String[] nombres = {"Oscar", "Joel", "Carlos", "Andres", "Diego", "Daniel", "Cristopher", "Ricardo", "Eduardo", "Manuel"};
        String[] lugares = {"Skyrim", "Cyrodill", "Valenwood", "Elsweyr", "Black Marsh", "Morrowind"};
        for (int i = 0; i < listaEjercito.size(); i++) {
            for (int j = 0; j < 5; j++) {
                int nom_alea = r.nextInt(10);
                int lug_alea = r.nextInt(6);
                listaEjercito.get(i).getListaSoldado().add(new Soldado(nombres[nom_alea], lugares[lug_alea], (20 + r.nextInt(40)), 100));
                if (j == 0) {
                    listaEjercito.get(i).getListaSoldado().add(new General((1 + r.nextInt(10)), nombres[nom_alea], lugares[lug_alea], (20 + r.nextInt(40)), 100));
                } else {
                    if (j >= 1 && j <= 2) {
                        listaEjercito.get(i).getListaSoldado().add(new Caballero(nombres[nom_alea], lugares[lug_alea], (20 + r.nextInt(40)), 100));
                    } else {
                        listaEjercito.get(i).getListaSoldado().add(new Ejecutor(nombres[nom_alea], lugares[lug_alea], (20 + r.nextInt(40)), 100));
                    }
                }
            }
        }
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
                        System.out.println("1)Crear Soldado\n"
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
                                System.out.println("1)General\n"
                                        + "2)Caballero\n"
                                        + "3)Ejecutor");
                                System.out.print("Ingrese el tipo de soldado");
                                int tipoSoldado = sc.nextInt();
                                while (tipoSoldado > 3) {
                                    System.out.print("Ingrese el tipo de soldado");
                                    tipoSoldado = sc.nextInt();
                                }
                                if (tipoSoldado == 1) {
                                    if (contGenerales == 0) {
                                        System.out.print("Ingrese los años al mando: ");
                                        int añoAlmando = sc.nextInt();
                                        listaEjercito.get(posicionEjercito).getListaSoldado().add(new General(añoAlmando, nombre, lugar, edad, salud));
                                    }
                                }
                                if (tipoSoldado == 2) {
                                    if (contCaballeros <= 3) {
                                        listaEjercito.get(posicionEjercito).getListaSoldado().add(new Caballero(nombre, lugar, edad, salud));
                                    }
                                }
                                if (tipoSoldado == 3) {
                                    if (contEjecutor == 0) {
                                        listaEjercito.get(posicionEjercito).getListaSoldado().add(new Ejecutor(nombre, lugar, edad, salud));
                                    }
                                }
                            } else {
                                System.out.print("Ya tiene el maximo numero de soldados");
                            }
                        }
                        if (opcionSoldado == 2) {
                            System.out.print("Ingrese la posicion del soldado: ");
                            int posicionSoldado = sc.nextInt();
                            if (posicionSoldado < listaEjercito.get(posicionEjercito).getListaSoldado().size()) {
                                System.out.println("1)Nombre\n"
                                        + "2)Lugar\n"
                                        + "3)Edad\n"
                                        + "4)Salud\n"
                                        + "5)Anios al mando\n"
                                        + "6)Atras");
                                int opcionModificar = sc.nextInt();
                                if (opcionModificar == 1) {
                                    System.out.print("Ingrese el nombre del Soldado: ");
                                    String nombre = sc.next();
                                    listaEjercito.get(posicionEjercito).getListaSoldado().get(posicionSoldado).setNombre(nombre);
                                    System.out.println("Modificacion Exitosa");
                                }
                                if (opcionModificar == 2) {
                                    System.out.print("Ingrese el lugar de nacimiento del Soldado: ");
                                    String lugar = sc.next();
                                    listaEjercito.get(posicionEjercito).getListaSoldado().get(posicionSoldado).setLugar(lugar);
                                    System.out.println("Modificacion Exitosa");
                                }
                                if (opcionModificar == 3) {
                                    System.out.print("Ingrese la edad del soldado: ");
                                    int edad = sc.nextInt();
                                    listaEjercito.get(posicionEjercito).getListaSoldado().get(posicionSoldado).setEdad(edad);
                                    System.out.println("Modificacion Exitosa");
                                }
                                if (opcionModificar == 4) {
                                    System.out.print("Ingrese la salud del soldado: ");
                                    int salud = sc.nextInt();
                                    listaEjercito.get(posicionEjercito).getListaSoldado().get(posicionSoldado).setSalud(salud);
                                    System.out.println("Modificacion Exitosa");
                                }
                                if (opcionModificar == 5) {
                                    if (listaEjercito.get(posicionEjercito).getListaSoldado().get(posicionSoldado) instanceof General) {
                                        System.out.print("Ingrese los años al mando: ");
                                        int añoAlmando = sc.nextInt();
                                        ((General) listaEjercito.get(posicionEjercito).getListaSoldado().get(posicionSoldado)).setAñoAlmando(añoAlmando);
                                    } else {
                                        System.out.println("No puede realizar esta opcion");
                                    }
                                }

                            } else {
                                System.out.println("El nodo seleccionado no esta disponible");
                            }
                        }
                        if (opcionSoldado == 3) {
                            System.out.print("Ingrese la posicion del soldado: ");
                            int posicionSoldado = sc.nextInt();
                            if (posicionSoldado < listaEjercito.get(posicionEjercito).getListaSoldado().size()) {
                                listaEjercito.get(posicionEjercito).getListaSoldado().remove(posicionSoldado);
                            } else {
                                System.out.println("No existe el nodo");
                            }
                        }
                        if (opcionSoldado == 4) {
                            for (int i = 0; i < listaEjercito.get(posicionEjercito).getListaSoldado().size(); i++) {
                                System.out.print(listaEjercito.get(posicionEjercito).getListaSoldado().get(i));
                            }
                            System.out.println();
                        }
                    }
                } else {
                    System.out.println("No existe el ejercito");
                }
            }
            if (opcionMenu == 3) {
                int opcionArmas = 0;
                while (opcionArmas != 6) {
                    System.out.print("1)Crear Arma\n"
                            + "2)Modificar Arma\n"
                            + "3)Eliminar Arma\n"
                            + "4)Listar Arma\n"
                            + "5)Inventario de Armas\n"
                            + "6)Atras");
                    opcionArmas = sc.nextInt();

                    if (opcionArmas == 1) {
                        System.out.print("Ingrese el nombre del arma: ");
                        String nombre = sc.next();
                        System.out.print("Ingrese el alcance: ");
                        double alcance = sc.nextDouble();
                        System.out.print("Ingrese el precio del arma: ");
                        double precio = sc.nextDouble();
                        System.out.println("1)Bomba\n"
                                + "2)Rifle\n"
                                + "3)Arma Blanca");
                        int tipoArma = sc.nextInt();
                        while (tipoArma > 4) {
                            System.out.println("1)Bomba\n"
                                    + "2)Rifle\n"
                                    + "3)Arma Blanca");
                            tipoArma = sc.nextInt();
                        }
                        if (tipoArma == 1) {
                            System.out.print("Ingrese el material de la bomba: ");
                            String material = sc.next();
                            listaArma.add(new Bomba(material, nombre, alcance, precio));
                        }
                        if (tipoArma == 2) {
                            System.out.println("1)Automatico\n"
                                    + "2)No automatico");
                            int opcionTiporifle = sc.nextInt();
                            while (opcionTiporifle > 2) {
                                System.out.println("1)Automatico\n"
                                        + "2)No automatico");
                                opcionTiporifle = sc.nextInt();
                            }
                            boolean tipoRifle = true;
                            if (opcionTiporifle == 1) {
                                tipoRifle = true;
                            } else {
                                tipoRifle = false;
                            }
                            listaArma.add(new Rifle(tipoRifle, nombre, alcance, precio));
                        }
                        if (tipoArma == 3){
                            System.out.print("Ingrese el material: ");
                            String material = sc.next();
                            listaArma.add(new Arma_Blanca(material, nombre, alcance, precio));
                        }
                    }
                    
                    if (opcionArmas == 2){
                        System.out.print("Ingrese la posicion del arma: ");
                        int posicionArma = sc.nextInt();
                        if (posicionArma < listaArma.size()){
                            System.out.println("1)Nombre\n"
                                    + "2)Alcance\n"
                                    + "3)Precio\n"
                                    + "4)Material\n"
                                    + "5)Estado Automatico\n"
                                    + "6)Atras");
                            
                        }else{
                            System.out.println("No existe el nodo ingresado");
                        }
                    }
                }
            }
        }
    }

    public static void espacio() {
        for (int i = 0; i < 10; i++) {
            System.out.print("----");
        }
        System.out.println("");
    }

    public static void opc4(ArrayList<Ejercito> listaEjercito) {
        for (int i = 0; i < listaEjercito.size(); i++) {
            System.out.println(listaEjercito.get(i));
            espacio();
            System.out.println("");
        }

    }
}
