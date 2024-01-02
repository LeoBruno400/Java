package Problema01;

public class Problema01 {
    public static void main(String[] args) {
    
        int numero;
        numero = 3;
        System.out.println(func(numero));
        System.out.println(iterativo(numero));
    }

    public static int func(int n) { //precondicion: n es un entero positivo
        int aux;
        if (n == 0) {
            aux = 0;
        } else {
            aux = n + func(n - 1);
        }
        return aux;
    }

    public static int iterativo(int n) { //precondicion: n es un entero positivo
        int suma = 0;
        for (int i = 0; i <=n; i++) {
            suma = suma+i;
        }
        return suma;
    }
}