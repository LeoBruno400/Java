/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TP02DA;

import java.util.Scanner;

/**
 *
 * @author Leo
 */
public class Problema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Scanner sc = new Scanner(System.in);
        int cantFila, cantColum, columna;
        System.out.println("Cantidad de filas: ");
        cantFila = verificarLongitudArreglo();
        System.out.println("Cantidad de columnas: ");
        cantColum = verificarLongitudArreglo();

        int[][] matrizNumerica = new int[cantFila][cantColum];
        cargarMatriz(matrizNumerica);
        int[] arregloColumna = new int[cantFila];
        columna = verificarColumnaMatriz(cantColum);
        cargarArreglo(matrizNumerica, arregloColumna, columna);
        mostrarArreglo(arregloColumna);
    }

    public static int verificarLongitudArreglo() {
        Scanner sc = new Scanner(System.in);
        int longitud;
        do {
            System.out.println("Por favor, ingrese un valor (mayor a cero):");
            longitud = sc.nextInt();
            if (longitud <= 0) {
                System.out.println("El numero ingresado es incorrecto. Por favor, intentelo nuevamente");
            }
        } while (longitud <= 0);
        return longitud;
    }

    public static void cargarMatriz(int[][] matriz) {
        Scanner sc = new Scanner(System.in);
        int i, j, cantFilas, cantColum;
        cantFilas = matriz.length;
        cantColum = matriz[0].length;
        for (i = 0; i < cantFilas; i++) {
            for (j = 0; j < cantColum; j++) {
                System.out.println("Ingrese el elemento (" + i + ", " + j + "):");
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    public static int verificarColumnaMatriz(int cantidadColumnas) {
        //Verifica si el número ingresado por el usuario es un número válido para la cantidad de columnas de un arreglo bidimensional
        Scanner sc = new Scanner(System.in);
        int columna = 0;
        do {
            System.out.println("Por favor, ingrese un valor mayor a 0 y menor que " + cantidadColumnas + ": ");
            columna = sc.nextInt();
            if (columna <= 0 || columna > cantidadColumnas) {
                System.out.println("El número ingresado es incorrecto. Por favor, inténtelo nuevamente");
            }
        } while (columna <= 0 || columna > cantidadColumnas);
        return columna - 1;
    }

    public static void cargarArreglo(int[][] matrizNumerica, int[] arregloColumna, int columna) {
        int i, cantFilas;
        cantFilas = arregloColumna.length;
        for (i = 0; i < cantFilas; i++) {
            arregloColumna[i] = matrizNumerica[i][columna];
        }
    }

    public static void mostrarArreglo(int[] matriz) {
        int i, j, longitud;
        longitud = matriz.length;
        for (i = 0; i < longitud; i++) {
            System.out.print(matriz[i] + " ");
            System.out.println("");
        }
    }
}
