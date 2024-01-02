package Problema08;

import java.util.Scanner;

public class Problema08 {
    public static void main(String[] args) {
        // Verifica si una palabra palindromo
        Scanner sc = new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese una palabra");
        palabra = sc.nextLine();
        palabra = palabra.replaceAll(" ", "");
        palabra = palabra.toLowerCase();

        int der = palabra.length() - 1;
        int izq = 0;
        
        System.out.println(verificacionPalabra(palabra, izq, der));
        sc.close();
    }

    public static boolean verificacionPalabra(String palabra, int izq, int der) {
        boolean similar = true;

        if (izq < der) { // Caso iterativo: mientras la izq sea menor a la der
            if (palabra.charAt(izq) == palabra.charAt(der)) { // Se compara letra por letra de los extremos hacia el
                                                              // centro
                similar = verificacionPalabra(palabra, izq + 1, der - 1); // Se repite hacia dentro
            } else {
                similar = false; // Caso base: de no encontrar la similitud en al menos 1 letra retorna false
            }
        }
        return similar;
    }
}
