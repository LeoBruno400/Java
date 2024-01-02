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
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        Scanner sc = new Scanner(System.in);
        String oracion;
        char caracter;
        boolean buscador;

        //Solicitud de datos
        System.out.println("Ingrese una oracion");
        oracion = sc.nextLine();
        System.out.println("Ingrese un caracter a buscar en la oracion");
        caracter = sc.next().charAt(0);

        //Invocacion del modulo
        buscador = caracterBuscado(oracion, caracter);

        //Verificacion
        if (buscador == true) {
            System.out.println("El caracter que busca si esta en su oracion.");
        } else {
            System.out.println("El caracter que busca no esta en su oracion.");
        }
    }

    //Modulo que encuentra el caracter en una oracion
    public static boolean caracterBuscado(String texto, char caracter) {
        int i;
        boolean letra = false;

        for (i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == caracter) {
                letra = true;
            }
        }
        return letra;
    }
}
