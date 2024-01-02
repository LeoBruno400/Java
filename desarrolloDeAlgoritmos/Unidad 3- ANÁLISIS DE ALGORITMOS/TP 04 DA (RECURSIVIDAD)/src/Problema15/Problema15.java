package Problema15;

import java.util.Scanner;

public class Problema15 {
    public static void main(String[] args) {
        // Verifica si una palabra palindromo
        Scanner sc = new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese una palabra");
        palabra = sc.nextLine();
        palabra = palabra.replaceAll(" ", "");
        palabra = palabra.toLowerCase();
        int der = palabra.length() - 1;
        System.out.println(vocalCadena(palabra, der));
        sc.close();
    }

    public static int vocalCadena(String cadena, int longitud) {
        int vocal = 0;
        if (longitud >= 0) { //Mientras la longitud sea mayor o igual a 0 se sigue iterando
            if ((cadena.charAt(longitud) == 'a') || (cadena.charAt(longitud) == 'e') || (cadena.charAt(longitud) == 'i')
                    || (cadena.charAt(longitud) == 'o') || (cadena.charAt(longitud) == 'u')) { 
                        //Si la cadena tiene alguna vocal suma 1
                vocal = 1 + vocalCadena(cadena, longitud - 1);
            }else{
                //Si la cadena no encontro alguna vocal, hace lo mismo pero sin suma 1
                vocal = vocalCadena(cadena, longitud - 1);
            }
        }
        return vocal;
    }
}
