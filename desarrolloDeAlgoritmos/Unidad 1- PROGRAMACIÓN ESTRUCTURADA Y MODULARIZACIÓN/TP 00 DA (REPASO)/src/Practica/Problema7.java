/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practica;

import java.util.Scanner;

/**
 *
 * @author Leo
 */
public class Problema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        Scanner sc = new Scanner(System.in);
        String palabra, condicion2;
        boolean condicion1;

        System.out.println("Ingresa la palabra");
        palabra = sc.nextLine();

        condicion1 = caracterBuscado(palabra);
        condicion2 = palabraLarga(palabra);

        if (condicion1 = true) {
            System.out.println("La palabra es capicua");
        } else {
            System.out.println("No hay palabra capicua");
        }
        System.out.println("La palabra mas larga es: " + condicion2);
    }

    //Modulo para conocer la palabra mas larga
    public static String palabraLarga(String textoUsuario) {
        String palabra = "", palabraMasLarga = "";
        int i;
        for (i = 0; i < textoUsuario.length(); i++) {

            if (textoUsuario.charAt(i) != ' ') {
                palabra = palabra + textoUsuario.charAt(i);

            } else {
                palabra = "";
            }
            if (palabra.length() > palabraMasLarga.length()) {
                palabraMasLarga = palabra;
            }
        }
        return palabraMasLarga;
    }
    //Modulo para saber si es capicua
    public static boolean caracterBuscado(String textoUsuario) {
        char[] capicua;
        int izq, der;
        boolean palabra = false;

        textoUsuario = textoUsuario.toLowerCase();
        textoUsuario = textoUsuario.replace(" ", "");

        capicua = textoUsuario.toCharArray();
        izq = 0;
        der = capicua.length - 1;

        while (izq < der) {
            if (capicua[izq] == capicua[der]) {
                der--;
                izq++;
            } else {
                palabra = false;
            }
            if (izq == der) {
                palabra = true;
            }
        }
        return palabra;
    }
}
