/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TP01DA;

import java.util.Scanner;

/**
 *
 * @author Leo
 */
public class Problema09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Este algoritmo muestra el número más chico y más grande de un arreglo de números enteros
        Scanner sc = new Scanner(System.in);
        int longitudArreglo;
        char caracterBuscado;

        longitudArreglo = verificarLongitudArreglo();
        char[] almacenCaracter = new char[longitudArreglo];
        cargarArreglo(almacenCaracter);
        System.out.println("Ingrese el caracter que desa buscar y contar: ");
        caracterBuscado = sc.next().charAt(0);
        if (verificarExistencia(almacenCaracter, caracterBuscado)) {
            System.out.println("Si existe el caracter dentro del arreglo.");
            System.out.println("La cantidad de veces que aparece el carácter es: " + contarAparicionDeCaracter(almacenCaracter, caracterBuscado));
        } else {
            System.out.println("No existe el caracter dentro del arreglo.");
        }
    }

    public static int verificarLongitudArreglo() {
        Scanner sc = new Scanner(System.in);
        int longitud;
        do {
            System.out.println("¿Cuantos caracteres desea ingresar?");
            longitud = sc.nextInt();
            if (longitud <= 0) {
                System.out.println("El numero ingresado es incorrecto. Por favor, intentelo nuevamente");
            }
        } while (longitud <= 0);
        return longitud;
    }

    public static void cargarArreglo(char[] almacenCaracter) {
        //Este modulo se encarga de cargar cualquier arreglo unidimensional
        Scanner sc = new Scanner(System.in);
        int i, longitudArreglo;
        char caracterTemporal;
        longitudArreglo = almacenCaracter.length;
        for (i = 0; i < longitudArreglo; i++) {
            System.out.println("Ingrese el " + (i + 1) + "° caracter: ");
            caracterTemporal = sc.next().charAt(0);
            almacenCaracter[i] = caracterTemporal;
        }
    }

    public static boolean verificarExistencia(char[] almacenCaracter, char caracterBuscado) {
        int i, j, longitudArreglo;
        boolean existe = false;
        longitudArreglo = almacenCaracter.length - 1;
        i = 0;
        j = longitudArreglo;
        do {
            if ((almacenCaracter[i] == caracterBuscado) || (almacenCaracter[j] == caracterBuscado)) {
                existe = true;
            }
            j = j - 1;
            i = i + 1;
        } while (existe == false && j >= i);
        if (almacenCaracter[j + 1] == caracterBuscado) {
            existe = true;
        }
        return (existe);
    }

    public static int contarAparicionDeCaracter(char[] almacenCaracter, char caracterBuscado) {
        int i, j, longitudArreglo, contador;
        longitudArreglo = almacenCaracter.length - 1;
        contador = 0;
        i = 0;
        j = longitudArreglo;
        do {
            if (almacenCaracter[j] == caracterBuscado) {
                contador = contador + 1;
            }
            if (almacenCaracter[i] == caracterBuscado) {
                contador = contador + 1;
            }
            i = i + 1;
            j = j - 1;
        } while (j >= i);
        i = i - 1;
        j = j + 1;
        if ((j == i) && almacenCaracter[i] == caracterBuscado) {
            contador = contador - 1;
        }
        return contador;
    }
}
