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
public class Problema07Original {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Scanner sc = new Scanner(System.in);

        int numeroUsuario;
        numeroUsuario = verificarLongitudArreglo();
        int[][] matrizEspiral = new int[numeroUsuario][numeroUsuario];
        matrizEspiral(matrizEspiral, numeroUsuario);
        mostrarMatriz(matrizEspiral);
    }

    public static int verificarLongitudArreglo() {
        Scanner sc = new Scanner(System.in);
        int longitud;
        do {
            System.out.println("Ingrese el tamaño de la matriz:");
            longitud = sc.nextInt();
            if (longitud <= 0) {
                System.out.println("El numero ingresado es incorrecto. Por favor, intentelo nuevamente");
            }
        } while (longitud <= 0);
        return longitud;
    }

    public static void matrizEspiral(int[][] matrizEspiral, int numeroUsuario) {
        int defaultNum = 0;
        int extremoArr = numeroUsuario - 1;
        int valorX = 0;
        int i;

        //Genera una iteracion infinita
        for (int j = 0; j < matrizEspiral.length; j++) {
            //Carga de la fila superior de IZQUIERDA defaultNum DERECHA →
            for (i = defaultNum; i <= extremoArr; i++) {
                //defaultNum=0, por lo tanto trabajo en la fila 0, 
                //i<=extremoArr es decir, que mis columnas van defaultNum llegar hasta la posicion [-1] del arreglo
                matrizEspiral[defaultNum][i] = valorX++;
            }

            //Carga la columna del extremo DERECHO ↓
            for (i = defaultNum + 1; i <= extremoArr; i++) {
                //defaultNum+1, por lo tanto voy defaultNum desde la fila 1 hasta abajo
                //extremoArr al ser la posicion [-1] solo trabajaria en el extremo derecho
                matrizEspiral[i][extremoArr] = valorX++;
            }

            //Carga la fila inferior de DERECHA defaultNum IZQUIERDA ←
            for (i = extremoArr - 1; i >= defaultNum; i--) {
                //extremoArr-1, por lo tanto recorro desde posicion [-2]
                //i>=defaultNum esto para que recorra hasta el valor 0 y asi ir de derecha defaultNum izquierda
                matrizEspiral[extremoArr][i] = valorX++;
            }

            //Carga la columna del extremo IZQUIERDO ↑
            for (i = extremoArr - 1; i >= defaultNum + 1; i--) {
                //extremoArr-1 arranco en la fila 3
                // hasta defaultNum, iria hasta 0, asi recorro desde abajo hacia arriba
                matrizEspiral[i][defaultNum] = valorX++;
            }
            defaultNum++; extremoArr--;
            //para resetear los valores
        }
    }
    
    public static void mostrarMatriz(int[][] matriz) {
        int i, j, longitudFila, longitudCol;
        longitudFila = matriz.length;
        longitudCol = matriz[0].length;
        
        for (i = 0; i < longitudFila; i++) {
            for (j = 0; j < longitudCol; j++) {
                System.out.print("| " +matriz[i][j]+ " |");
            }
            System.out.println("");
        }   
    }
    
    
    
}
