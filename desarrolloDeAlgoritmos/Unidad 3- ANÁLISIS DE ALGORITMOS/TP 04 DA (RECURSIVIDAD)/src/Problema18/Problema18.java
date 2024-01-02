package Problema18;

public class Problema18 {
    public static void main(String[] args) {
        int N = 15;
        int B = 3;
        explotar(N, B);
    }

    public static void explotar(int N, int B) {
        if (N <= B) {
            System.out.println(N);
        } else {
            explotar((N / B), B);
            explotar(N - (N / B), B);
        }
    }
}
