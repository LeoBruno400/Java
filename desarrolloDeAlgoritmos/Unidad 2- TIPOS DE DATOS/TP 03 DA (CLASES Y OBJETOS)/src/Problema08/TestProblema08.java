package Problema08;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Maru
 */
public class TestProblema08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Crea y carga un arreglo del tipo Avion (clase) y dado un menu muestra lo
        // solicitado.
        Scanner sc = new Scanner(System.in);
        int cantAviones, posicionArreglo;
        String idAvion, modelo, respuesta;

        cantAviones = verificarLongitudArreglo();
        Avion aviones[] = new Avion[cantAviones];
        cargarArreglo(aviones);

        System.out.println("------------------------------------------------------------------------\n");
        do {
            switch (menu()) {
                case 1:
                    posicionArreglo = maxVelocidad(aviones);
                    System.out.println("\nEl avion con velocidad promedio mayor es el avion "
                            + aviones[posicionArreglo].getModelo()
                            + " \ny la velocidad maxima promedio es de "
                            + aviones[posicionArreglo].getVelocidadPromedio() + " km/h.");
                    break;
                case 2:
                    System.out.println("Ingrese el identificador del avion: ");
                    idAvion = sc.next();
                    mostrarAsientos(idAvion, aviones);
                    break;
                case 3:
                    System.out.println("Ingrese el modelo de avion que desea consultar: ");
                    modelo = sc.next();
                    mostrarCantModelo(modelo, aviones);
                    break;
                case 4:
                    mostrarPromedioKm(aviones);
                    break;
            }
            System.out.println("¿Desea realizar otra operacion? s/n");
            respuesta = sc.next();
            respuesta = respuesta.toLowerCase();
        } while (respuesta.equals("s"));
        System.out.println("PROGRAMA TERMINADO.");
    }

    public static int verificarLongitudArreglo() {
        // Verifica si el número ingresado por el usuario es un número válido para la
        // longitud de arreglo
        Scanner sc = new Scanner(System.in);
        int longitud;
        do {
            System.out.println("¿Cuantos aviones desea cargar?");
            longitud = sc.nextInt();
            if (longitud <= 0) {
                System.out.println("El numero ingresado es incorrecto. Por favor, intentelo nuevamente. ");
            }
        } while (longitud <= 0);
        return longitud;
    }

    public static void cargarArreglo(Avion[] arregloAvion) {
        // Carga un arreglo de objeto Avion. Se estima que todos los datos ingresados
        // son correctos.
        Scanner sc = new Scanner(System.in);
        String elIdentificador, elModelo;
        int i, laCantidadDeAsientos;
        double losKmRecorridos, laVelocidadPromedio;
        for (i = 0; i < arregloAvion.length; i++) {
            System.out.println((i + 1) + "° avion: ");
            System.out.println("Ingrese el identificador: ");
            elIdentificador = sc.next();
            System.out.println("Ingrese el modelo del avion: ");
            elModelo = sc.next();
            System.out.println("Ingrese la cantidad de asientos: ");
            laCantidadDeAsientos = sc.nextInt();
            System.out.println("Ingrese la cantidad de km recorridos: ");
            losKmRecorridos = sc.nextDouble();
            System.out.println("Ingrese la velocidad promedio: ");
            laVelocidadPromedio = sc.nextDouble();
            System.out.println("");
            arregloAvion[i] = new Avion(elIdentificador, elModelo, laCantidadDeAsientos, losKmRecorridos,
                    laVelocidadPromedio);
        }

    }

    public static int menu() {
        // Muestra un menu y retorna la opcion elegida por el usuario.
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("""
                Opcion 1 - Mostrar el avión que tiene mayor velocidad.
                Opcion 2 - Mostrar la cantidad de asientos que tiene un cierto avión.
                Opcion 3 - Mostrar cuantos aviones de un cierto modelo tiene la empresa.
                Opcion 4 - Mostrar el promedio de km recorrido por todos los aviones.
                Cualquier otro numero para terminar.
                Ingrese la opción:""");
        opcion = sc.nextInt();
        return opcion;
    }

    public static int maxVelocidad(Avion arregloAvion[]) {
        // Compara la velocidad promedio de todos los aviones y devuelve el de mayor
        // velocidad promedio.
        double velMax = -1;
        int a, posicion = -1;
        for (a = arregloAvion.length - 1; a >= 0; a--) {
            if (velMax < arregloAvion[a].getVelocidadPromedio()) {
                velMax = arregloAvion[a].getVelocidadPromedio();
                posicion = a;
            }
        }
        return posicion;
    }

    public static void mostrarAsientos(String idAvion, Avion[] arregloAvion) {
        //
        int i = 0;
        boolean continuar = true;
        do {
            if (arregloAvion[i].getIdentificador().equals(idAvion)) {
                continuar = false;
                System.out.println("La cantidad de asientos del avion es: " + arregloAvion[i].getCantidadDeAsientos());
            }
            i++;
        } while (continuar);
    }

    public static void mostrarCantModelo(String modelo, Avion[] arregloAvion) {
        //
        int i, longArr, cantModelo = 0;
        longArr = arregloAvion.length;

        for (i = 0; i < longArr; i++) {
            if (arregloAvion[i].getModelo().equals(modelo)) {
                cantModelo++;
            }
        }
        System.out.println("La cantidad de aviones del modelo " + modelo + " es: " + cantModelo);
    }

    public static void mostrarPromedioKm(Avion[] arregloAvion) {
        //
        int i, longArr;
        double totalKm = 0, totalKmRecorridos;
        longArr = arregloAvion.length;

        for (i = 0; i < longArr; i++) {
            totalKm += arregloAvion[i].getKmRecorridos();
        }
        totalKmRecorridos = totalKm / longArr;
        System.out.println("El promedio de km recorridos por todos los aviones es: " + totalKmRecorridos);
    }

}
