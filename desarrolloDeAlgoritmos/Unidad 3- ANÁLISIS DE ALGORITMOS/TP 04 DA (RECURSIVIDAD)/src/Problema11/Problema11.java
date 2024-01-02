package Problema11;

public class Problema11 {
    public static void main(String[] args) {
        // Suma los valores de las posiciones pares e impares de manera separada
        int[] arreglo = { 2, 1, 2, 1, 2, 1 };
        int i = 0;
        int longitud = arreglo.length - 1;
        System.out.println("La suma de las posiciones pares son: " + sumaPosicionesPares(arreglo, i, longitud));
        System.out.println("La suma de las posiciones impares son: " + sumaPosicionesImpares(arreglo, i, longitud));
    }

    public static int sumaPosicionesPares(int[] arreglo, int i, int longitud) {
        int contadorPar = 0;

        // Si la longitud es impar, se resta 1 para tomar hasta la ultima posicion par
        if (longitud % 2 != 0) {
            longitud -= 1;
        }

        // Caso iterativo: mientras el i sea menor a la longitud
        if (i < longitud) {
            contadorPar = arreglo[i] + sumaPosicionesPares(arreglo, i + 2, longitud);
        } else {
            contadorPar = arreglo[i];
            // Caso base: contadorPar se va a setear con el ultimo valor par y se va a sumar
            // con el acarreado
        }
        return contadorPar;
    }

    public static int sumaPosicionesImpares(int[] arreglo, int i, int longitud) {
        int contadorImpar = 0;

        // Si la longitud es par, se resta 1 para tomar hasta la ultima posicion impar
        if (longitud % 2 == 0) {
            longitud -= 1;
        }
        // Condicion impar: i tiene que arracar en la primera posicion impar del
        // arreglo, osea 1
        if (i == 0) {
            i = 1;
        }

        // Caso iterativo: mientras el i sea menor a la longitud
        if (i < longitud) {
            contadorImpar = arreglo[i] + sumaPosicionesImpares(arreglo, i + 2, longitud);
        } else {
            contadorImpar = arreglo[i];
            // Caso base: contadorImpar se va a setear con el ultimo valor impar y se va a
            // sumar con el acarreado
        }
        return contadorImpar;
    }
}
