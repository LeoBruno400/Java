package Problema12;

import java.util.Scanner;

public class Problema12 {
    public static void main(String[] args) {
        // Busca si un caracter ingresado por el usuario dentro de un arreglo de
        // caracteres
        Scanner sc = new Scanner(System.in);
        char[] arreglo = { 'a', 'b', 'c', 'd', 'e' };
        int longitud = arreglo.length - 1;
        char caracterBuscado;

        System.out.println("Ingrese el caracter que desea buscar: ");
        caracterBuscado = sc.next().charAt(0);

        if (encontrarCaracter(arreglo, longitud, caracterBuscado) == true) {
            System.out.println("El caracter se encuentra en el arrelgo");
        } else {
            System.out.println("El caracter no se encuentra en el arrelgo");
        }
        sc.close();
    }

    public static boolean encontrarCaracter(char[] arreglo, int longitud, char caracterBuscado) {
        boolean existencia = false;

        if (longitud >= 0) {
            if (caracterBuscado != arreglo[longitud]) {
                // Caso iterativo: si el caracter buscado no coincide con el caracter en la
                // posicion del arrelgo
                existencia = encontrarCaracter(arreglo, longitud - 1, caracterBuscado);
            } else {
                // Caso base: si lo encuentra retorna la true
                existencia = true;
            }
        }
        return existencia;
    }
}
