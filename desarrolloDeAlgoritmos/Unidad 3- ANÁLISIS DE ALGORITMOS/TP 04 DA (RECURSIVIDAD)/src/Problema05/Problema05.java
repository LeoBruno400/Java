package Problema05;

import java.util.Scanner;
/*Diseñar e implementar un algoritmo recursivo que lea una secuencia de dígitos (en cada llamada
recursiva debe leer un número) y cuente cuántos son múltiplos de 3 hasta que se ingrese el valor
0.*/

public class Problema05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero.");
        numero = sc.nextInt();
        System.out.println(esMultiplo(numero));
        sc.close();
    }

    public static int esMultiplo(int num) {
        int numeroEvaluar, contador = 0, aux = 0;
        numeroEvaluar = num % 10;
        // Caso Base: cuando el num sea 0
        if (num > 0) {
            if (numeroEvaluar % 3 == 0) {
                aux++;
            }
            contador = aux + esMultiplo(num / 10);
        }
        return contador;
    }
}
