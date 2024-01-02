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
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Este algoritmo muestra el número más chico y más grande de un arreglo de números enteros
        Scanner sc = new Scanner(System.in);
        int longitudArreglo;
        
        longitudArreglo = verificarLongitudArreglo();
        int[] almacenNumero = new int[longitudArreglo];
        cargarArreglo(almacenNumero);
        System.out.println("El numero mas grande es:" + numeroMayor(almacenNumero));
        System.out.println("El numero mas chico es:" + numeroMenor(almacenNumero));
    }
    
    public static int verificarLongitudArreglo(){
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

    public static void cargarArreglo(int[] almacenNumero) {
        //Este modulo se encarga de cargar cualquier arreglo unidimensional
        Scanner sc = new Scanner(System.in);
        int i, numeroTemporal;
        for (i = 0; i < almacenNumero.length; i++) {
            System.out.println("Ingrese el " + (i + 1) + "° numero: ");
            numeroTemporal = sc.nextInt();
            almacenNumero[i] = numeroTemporal;
        }
    }

    public static int numeroMayor(int[] almacenNumero) {
        //Este modulo busca el mayor numero dentro de un arreglo unidimensional
        int i, numeroGrande = -1000000;
        for (i = 0; i < almacenNumero.length; i++) {
            if (almacenNumero[i] > numeroGrande) {
                numeroGrande = almacenNumero[i];
            }
        }
        return numeroGrande;
    }

    public static int numeroMenor(int[] almacenNumero) {
        //Este modulo busca el menor numero dentro de un arreglo unidimensional
        int i, numeroChico = 10000000;
        for (i = 0; i < almacenNumero.length; i++) {
            if (almacenNumero[i] < numeroChico) {
                numeroChico = almacenNumero[i];
            }
        }
        return numeroChico;
    }
}
