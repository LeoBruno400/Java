package Problema02;

public class Problema02 {
    public static void main(String[] args) {
        int numero=3;
        System.out.println(algo(numero));
    }

    public static int algo(int n) { // precondicion: n es un entero positivo
        int aux;
        if (n == 1)
            aux = 1;
        else
            aux = algo(n - 1) + 1;
        return aux;
    }
}