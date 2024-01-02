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
public class Problema07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Scanner sc = new Scanner(System.in);

        int[][] matriz3x3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matriz4x4 = {{10, 11, 12, 13}, {14, 15, 16, 17}, {18, 19, 20, 21}, {22, 23, 24, 25}};
        int[][] matriz5x5 = {{26, 27, 28, 29, 30}, {31, 32, 33, 34, 35}, {36, 37, 38, 39, 40}, {41, 42, 43, 44, 45}, {46, 47, 48, 49, 50}};
        //Muestra por pantalla
        System.out.println("Matrices originales \n");
        System.out.println("3x3");
        mostrarMatriz(matriz3x3);
        System.out.println("");
        System.out.println("4x4");
        mostrarMatriz(matriz4x4);
        System.out.println("");
        System.out.println("5x5");
        mostrarMatriz(matriz5x5);
        
        System.out.println("");
        System.out.println("------------------------------ \n");
        
        System.out.println("Por filas de atrás hacia adelante\n");
        System.out.println("3x3");
        invertirFilas(matriz3x3);
        System.out.println("");
        System.out.println("4x4");
        invertirFilas(matriz4x4);
        System.out.println("");
        System.out.println("5x5");
        invertirFilas(matriz5x5);
        
        System.out.println("");
        System.out.println("------------------------------ \n");  
 
        System.out.println("Por columnas de arriba hacia abajo\n");
        System.out.println("3x3");
        invertirColumnas(matriz3x3);
        System.out.println("");
        System.out.println("4x4");
        invertirColumnas(matriz4x4);
        System.out.println("");
        System.out.println("5x5");
        invertirColumnas(matriz5x5);
        
        System.out.println("");
        System.out.println("------------------------------ \n");
        
        System.out.println("En espiral \n");
        System.out.println("3x3");
        matrizEspiral(matriz3x3);
        System.out.println("");
        System.out.println("4x4");
        matrizEspiral(matriz4x4);
        System.out.println("");
        System.out.println("5x5");
        matrizEspiral(matriz5x5);
        
        System.out.println("");
        System.out.println("------------------------------ \n");
      
        System.out.println("En zig zag \n");
        System.out.println("3x3");
        zigZag(matriz3x3);
        System.out.println("");
        System.out.println("4x4");
        zigZag(matriz4x4);
        System.out.println("");
        System.out.println("5x5");
        zigZag(matriz5x5);

    }

    public static void invertirFilas(int[][] matriz) {
        int i, j, longitudFila, longitudCol;
        longitudFila = matriz.length;
        longitudCol = matriz[0].length;

        for (i = 0; i < longitudFila; i++) {
            for (j = longitudCol - 1; j >= 0; j--) {
                System.out.print("| " + matriz[i][j] + " |");
            }
            System.out.println("");
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        int i, j, longitudFila, longitudCol;
        longitudFila = matriz.length;
        longitudCol = matriz[0].length;

        for (i = 0; i < longitudFila; i++) {
            for (j = 0; j < longitudCol; j++) {
                System.out.print("| " + matriz[i][j] + " |");
            }
            System.out.println("");
        }
    }

public static void invertirColumnas(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("| "+matriz[j][i] + " |");
            }
            System.out.println("");
        }
    }

    public static void matrizEspiral(int[][] matriz) {
        //Carga y muestra un arreglo nuevo como matriz , en forma de espiral
        //CARGA
        int [] nuevaMatriz= new int [matriz.length*matriz[0].length];
        int defaultNum = 0;
        int extremoArr = matriz.length - 1;
        int i, j;
        int contador=0;

        //Genera un loop
        for (j = 0; j < matriz.length; j++) {
            //Carga de la fila superior de IZQUIERDA defaultNum DERECHA →
            for (i = defaultNum; i <= extremoArr; i++) {
                //defaultNum=0, por lo tanto trabajo en la fila 0, 
                //i<=extremoArr es decir, que mis columnas van defaultNum llegar hasta la posicion [-1] del arreglo
                nuevaMatriz[contador]=matriz[defaultNum][i];
                contador++;
            }

            //Carga la columna del extremo DERECHO ↓
            for (i = defaultNum + 1; i <= extremoArr; i++) {
                //defaultNum+1, por lo tanto voy defaultNum desde la fila 1 hasta abajo
                //extremoArr al ser la posicion [-1] solo trabajaria en el extremo derecho
                nuevaMatriz[contador]=matriz[i][extremoArr];
                contador++;
            }

            //Carga la fila inferior de DERECHA defaultNum IZQUIERDA ←
            for (i = extremoArr - 1; i >= defaultNum; i--) {
                //extremoArr-1, por lo tanto recorro desde posicion [-2]
                //i>=defaultNum esto para que recorra hasta el valor 0 y asi ir de derecha defaultNum izquierda
                nuevaMatriz[contador]=matriz[extremoArr][i];
                contador++;
            }

            //Carga la columna del extremo IZQUIERDO ↑
            for (i = extremoArr - 1; i >= defaultNum + 1; i--) {
                //extremoArr-1 arranco en la fila 3
                // hasta defaultNum, iria hasta 0, asi recorro desde abajo hacia arriba
                nuevaMatriz[contador]=matriz[i][defaultNum];
                contador++;
            }
            defaultNum++;
            extremoArr--;
            //para resetear los valores
        }
        //Imprime por pantalla el arreglo unidimensional como si fuese una matriz, unicamente estetico
        int longitudFila, longitudCol;
        longitudFila = matriz.length;
        longitudCol = matriz[0].length;
        int recorrido = 0;
        for (i = 0; i < longitudFila; i++) {
            for (j = 0; j < longitudCol; j++) {
                System.out.print("| "+nuevaMatriz[recorrido] +" |");
                recorrido++;
            }
            System.out.println("");
        }  
    }
    

    public static void zigZag(int[][] matriz) {
        //Muestra la matriz ingresada por parametro en zig-zag
        int i, j, longitudFila, longitudCol;
        longitudFila = matriz.length;
        longitudCol = matriz[0].length;

        for (i = 0; i < longitudFila; i++) {
            if (i % 2 == 0) {
                for (j = 0; j < longitudCol; j++) {
                    System.out.print("| " + matriz[i][j] + " |");
                }
            } else {
                for (j = longitudCol - 1; j >= 0; j--) {
                    System.out.print("| " + matriz[i][j] + " |");
                }
            }
            System.out.println("");
        }
    }

}
