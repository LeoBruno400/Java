package Problema14;

public class Problema14 {
    public static void main(String[] args) {
        // Busca el numero mas grande en una matriz
        int filas = 0;
        int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("La matriz es:");
        mostrarMatriz(matriz);
        System.out.println();
        System.out.println("El numero mas grande es: " + mayorEnMatriz(matriz, filas));
    }

    public static void mostrarMatriz(int[][] matriz) {
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

    public static int mayorNumero(int[][] matriz, int filas, int columnas) {
        // Busca el mayor en una fila
        int mayor = 0;
        int casoBase;
        int valorIncial;

        if (filas >= 0 && filas < matriz.length) {
            valorIncial = matriz[filas][columnas]; // El primer numero por el cual voy a comparar el resto
            casoBase = mayorNumero(matriz, filas + 1, columnas); // Caso iterativo: cuando ya recorra todas las columnas

            // Evalua cual numero es mas grande
            if (valorIncial < casoBase) {
                mayor = casoBase;
            } else {
                mayor = valorIncial;
            }
        }
        return mayor;
    }

    public static int mayorEnMatriz(int[][] matriz, int columnas) {
        // Busco el mayor de la matriz
        int mayorEnFila;
        int mayorNextLine;
        int masGrande = 0;

        if (columnas >= 0 && columnas < matriz[0].length) {
            // Solo itero las filas, esta condicion restringe pasarse del limite
            mayorEnFila = mayorNumero(matriz, 0, columnas);
            mayorNextLine = mayorEnMatriz(matriz, columnas + 1);
            // Busco el mayor de las filas
            // Evaluo cual numero de las filas es el mas grande entre ellas
            if (mayorEnFila > mayorNextLine) {
                masGrande = mayorEnFila;
            } else {
                masGrande = mayorNextLine;
            }
        }
        return masGrande;
    }

}
