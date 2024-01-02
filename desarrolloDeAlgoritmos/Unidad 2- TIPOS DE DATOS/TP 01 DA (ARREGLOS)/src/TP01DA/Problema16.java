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
public class Problema16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Este algoritmo muestra el texto ingresado con los filtros de condiciones
        Scanner sc = new Scanner(System.in);
        int longitudArreglo = 0;
        longitudArreglo = verificarLongitudArreglo();

        String[] almacenTexto = new String[longitudArreglo];
        String[] almacenTexto2 = new String[longitudArreglo];
        cargarTexto(almacenTexto);
        verificarArreglo(almacenTexto, almacenTexto2);
        modificarArreglo(almacenTexto2);
        mostrarArreglo(almacenTexto2);
    }

    public static int verificarLongitudArreglo() {
        Scanner sc = new Scanner(System.in);
        int longitud;
        do {
            System.out.println("¿Cuantos numeros desea ingresar?");
            longitud = sc.nextInt();
            if (longitud <= 0) {
                System.out.println("El numero ingresado es incorrecto. Por favor, intentelo nuevamente");
            }
        } while (longitud <= 0);
        return longitud;
    }

    public static void cargarTexto(String[] almacenTexto) {
        //Este modulo se encarga de cargar los texto al arreglo
        Scanner sc = new Scanner(System.in);
        int i, longitudTexto;
        longitudTexto = almacenTexto.length;
        String textoTemporal = " ";
        for (i = 0; i < longitudTexto; i++) {
            System.out.println("Ingrese el " + (i + 1) + "° texto: ");
            textoTemporal = sc.nextLine();
            almacenTexto[i] = textoTemporal;
        }
    }

    public static boolean identificarLetras(String cadena) {
        //Identifica si la palabra esta formada por letras
        int i = 0, largoCadena;
        boolean esLetra = true;
        largoCadena = cadena.length();
        do {
            if (!Character.isLetter(cadena.charAt(i))) {
                esLetra = false;
            }
            i++;
        } while (esLetra && i < largoCadena);
        return esLetra;
    }

    public static void verificarArreglo(String[] almacenTexto, String[] almacenTexto2) {
        //Verifica si las palabras ingresadas tienen 5 caracteres de solo letras
        int i,j=0,longitudTexto;
        boolean letra;
        longitudTexto = almacenTexto.length;
        for (i = 0; i < longitudTexto; i++) {
            letra = identificarLetras(almacenTexto[i]);
            if (almacenTexto[i].length() == 5 && letra == true) {
                almacenTexto2[j] = almacenTexto[i];
                j++;
            }
        }
    }
    
    public static void modificarArreglo(String[] almacenTexto2){ 
        //Hace que las celdas que estan en null queden en vacio para que no se vea por pantalla
        int i, longitudTexto;
        longitudTexto = almacenTexto2.length;
        for (i = 0;  i< longitudTexto; i++) {
            if (almacenTexto2[i] == null){
                almacenTexto2[i]=" ";
            }
        }
    }

    public static void mostrarArreglo(String[] almacenTexto2) {
        //Este modulo se encargar de mostrar por pantalla el arreglo
        int i, longitudTexto;
        longitudTexto = almacenTexto2.length;
        System.out.println("\n");
        System.out.println("Los datos del arreglo son");
        for (i = 0; i < longitudTexto; i++) {
            System.out.print(almacenTexto2[i] + " ");
        }
        System.out.println("\n");
    }
}
