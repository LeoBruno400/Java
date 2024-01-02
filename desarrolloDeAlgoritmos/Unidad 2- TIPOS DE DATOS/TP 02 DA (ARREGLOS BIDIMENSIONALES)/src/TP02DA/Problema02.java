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
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Scanner sc = new Scanner(System.in);
        int cantFila, cantColum;
        System.out.println("Cantidad de filas: ");
        cantFila = verificarLongitudArreglo();
        System.out.println("Cantidad de columnas: ");
        cantColum = verificarLongitudArreglo();

        String[][] matriz = new String[cantFila][cantColum];
        cargarMatriz(matriz);
        mostrarMatriz(matriz);
        System.out.println(" ");
        String[] matrizDiagonal = new String[cantFila];
        diagonalMatriz(matriz, matrizDiagonal);
        System.out.println(" ");
        mostrarMatrizDiagonal(matrizDiagonal);
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

    public static void cargarMatriz(String[][] matriz) {
        Scanner sc = new Scanner(System.in);
        int i, j, cantFilas, cantColum;
        cantFilas = matriz.length;
        cantColum = matriz[0].length;
        for (i = 0; i < cantFilas; i++) {
            for (j = 0; j < cantColum; j++) {
                System.out.println("Ingrese el elemento (" + i + ", " + j + "):");
                matriz[i][j] = sc.nextLine();
            }
        }
    }

    public static void diagonalMatriz(String[][] matriz, String[] matrizDiagonal) {
        int i, j, longitudFila, longitudCol;
        longitudFila = matriz.length;
        longitudCol = matriz[0].length;

        for (i = 0; i < longitudFila; i++) {
            for (j = 0; j < longitudCol; j++) {
                if(i==j){
                    matrizDiagonal[i]=matriz[i][j];
                }
                }
            }
        }

    public static void mostrarMatrizDiagonal(String[] matriz) {
        int i, longitud;
        longitud = matriz.length;
        for (i = 0; i < longitud; i++) {
            System.out.print(matriz[i] + " ");
        }
        System.out.println("");
    }

    public static void mostrarMatriz(String[][] matriz) {
        int i, j, longitudFila, longitudCol;
        longitudFila = matriz.length;
        longitudCol = matriz[0].length;
        for (i = 0; i < longitudFila; i++) {
            for (j = 0; j < longitudCol; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
