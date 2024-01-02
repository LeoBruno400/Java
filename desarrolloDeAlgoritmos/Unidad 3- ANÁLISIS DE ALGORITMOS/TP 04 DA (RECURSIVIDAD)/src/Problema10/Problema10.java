package Problema10;

import java.util.Scanner;

public class Problema10 {
    public static void main(String[] args) {
        // Forma una palabra por caracteres hasta que se ingrese un punto, retorna la
        // palabra completa
        String cadena = " ";
        System.out.println("La palabra formada es: " + contarPalabra(cadena));
    }

    public static String contarPalabra(String cadena) {
        Scanner sc = new Scanner(System.in);
        String caracterIngresado;
        String nuevaCadena = " ";
        System.out.println("Ingrese una letra: \nPunto para terminar");
        caracterIngresado = sc.nextLine();
        if (caracterIngresado.equals(".")) {
            // Caso base: si es "." caracter ingresado se setea con vacio para volver a
            // sumar todos los caracteres acarreados
            caracterIngresado = " ";
        } else {
            // Caso iterativo: que la palabra != de "."
            caracterIngresado += contarPalabra(nuevaCadena);
        }
        sc.close();
        return caracterIngresado;
    }

}
