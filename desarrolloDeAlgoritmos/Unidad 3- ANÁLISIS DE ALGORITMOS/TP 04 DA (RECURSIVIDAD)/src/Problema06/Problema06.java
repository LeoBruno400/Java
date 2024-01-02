package Problema06;

public class Problema06 {

    public static void main(String[] args) {
        // Busca el numero mas grande dentro de un arreglo de numeros
        int longitud;
        int[] arreglo = { 1, 55, 3, 9 };
        longitud = arreglo.length - 1;
        System.out.println(numeroMayor(arreglo, longitud));
    }

    public static int numeroMayor(int[] arreglo, int longitud) {
        int mayorInicial;
        if (longitud > 0) {
            mayorInicial = numeroMayor(arreglo, longitud - 1);
            // Recorro el arreglo hasta la ultima posicion
            if (arreglo[longitud] > mayorInicial) {
                mayorInicial = arreglo[longitud];
                // Seteo el mas grande
            }
        } else {
            mayorInicial = arreglo[0];
            // Caso base: comparo desde la posicion 0 en adelante
        }
        return mayorInicial;
    }
}
