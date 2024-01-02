/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TP01DA;

import java.util.Scanner;

/**
 *
 * @author Leo
 */
public class Problema14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Este algoritmo muestra el número más chico y más grande de un arreglo de números enteros
        Scanner sc = new Scanner(System.in);
        int longitudArreglo = 0, longitudPar, longitudImpar;
        longitudArreglo = verificarLongitudArreglo();
        longitudImpar = numeroImpar(longitudArreglo);
        longitudPar = (longitudArreglo - longitudImpar);
        
        String[] almacenTexto = new String[longitudArreglo];
        cargarTexto(almacenTexto);
        String[] almacenImpares = new String[longitudImpar];
        cargarImpares(almacenTexto, almacenImpares);
        String[] almacenPares = new String[longitudPar];
        cargarPares(almacenTexto, almacenPares);
        mostrarArreglo(almacenTexto, almacenImpares, almacenPares);
    }

    public static int verificarLongitudArreglo() {
        Scanner sc = new Scanner(System.in);
        int longitud;
        do {
            System.out.println("¿Cuantos numeros desea ingresar?");
            longitud = sc.nextInt();
            if (longitud <= 0) {
                System.out.println("El numero ingresado es incorrecto. Por favor, intentelo nuevamente");
            }
        } while (longitud <= 0);
        return longitud;
    }

    public static void cargarTexto(String[] almacenTexto) {
        //Este modulo se encarga de cargar los texto al arreglo
        Scanner sc = new Scanner(System.in);
        int i, longitudTexto;
        String textoTemporal = " ";
        longitudTexto = almacenTexto.length;
        for (i = 0; i < longitudTexto; i++) {
            System.out.println("Ingrese el " + (i+1) + "° texto: ");
            textoTemporal = sc.nextLine();
            almacenTexto[i] = textoTemporal;
        }
    }

    public static int numeroImpar(int longitudArreglo) {
        //Este modulo se encarga de saber cuantos numeros pares tiene un numero padre
        int i, numeroPar = 0;
        for (i = 0; i < longitudArreglo; i++) {
            numeroPar = longitudArreglo / 2;
        }
        return numeroPar;
    }

    public static void cargarImpares(String[] almacenTexto, String[] almacenImpares) {
        //Este modulo se encargar de cargar el arreglo impar
        int i, longitudTexto;
        longitudTexto = almacenImpares.length;
        for (i = 0; i < longitudTexto; i++) {
            almacenImpares[i] = almacenTexto[(i * 2)+1];
        }
    }

    public static void cargarPares(String[] almacenTexto, String[] almacenPares) {
        //Este modulo se encargar de cargar el arreglo par
        int i, longitudTexto;
        longitudTexto = almacenPares.length;
        for (i = 0; i < longitudTexto; i++) {
            almacenPares[i] = almacenTexto[(i * 2)];
        }
    }

    public static void mostrarArreglo(String[] almacenTexto, String[] almacenImpares, String[] almacenPares) {
        //Este modulo se encargar de mostrar por pantalla los 3 arreglos
        int i, longitudTexto1, longitudTexto2, longitudTexto3;
        longitudTexto1 = almacenTexto.length;
        longitudTexto2 = almacenImpares.length;
        longitudTexto3 = almacenPares.length;

        System.out.println("\n");
        System.out.println("Los datos del arreglo padre son");
        for (i = 0; i < longitudTexto1; i++) {
            System.out.print(almacenTexto[i] + " ");
        }
        System.out.println("\n");
        System.out.println("\nLos datos de las posiciones impares son:");
        for (i = 0; i < longitudTexto2; i++) {
            System.out.print(almacenImpares[i] + " ");
        }
        System.out.println("\n");
        System.out.println("\nLos datos de las posiciones pares son");
        for (i = 0; i < longitudTexto3; i++) {
            System.out.print(almacenPares[i] + " ");
        }
        System.out.println("\n");
    }
}
