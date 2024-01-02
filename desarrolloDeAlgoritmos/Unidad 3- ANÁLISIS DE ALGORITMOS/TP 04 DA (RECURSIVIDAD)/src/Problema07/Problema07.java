package Problema07;

public class Problema07 {
    public static void main(String[] args) {
        int filas = 0;
        int columnas = 0;
        int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        sumarMatriz(matriz, filas, columnas);

    }

    public static int sumarMatriz(int matriz[][], int filas, int columnas) {
        int suma = 0;
        if (filas < matriz.length) {
            if (columnas < matriz[0].length) {
                suma = +sumarMatriz(matriz, filas, columnas + 1);
                if ((columnas - 1) >= 0) {
                    suma += matriz[filas][columnas - 1];
                }
            } else {
                suma = matriz[filas][columnas - 1];
            }

            if (columnas == 0) {
                System.out.println(filas + 1 + "-> " + suma);
                filas++;
                suma += sumarMatriz(matriz, filas, 0);
            }
        }
        return suma;
    }
}
