import java.util.Arrays;
import java.util.Random;

public class Practica {
    public static void main(String[] args) {
        int[] arr = { 20, 18, 16, 14, 12, 10, 8, 6, 4, 2 };
        desordenarArreglo(arr);
        System.out.println("El arreglo es: " + Arrays.toString(arr));
        ordenamientoBurbuja(arr);
        System.out.println("Ordenamiento Burbuja: " + Arrays.toString(arr) + "\n");

        desordenarArreglo(arr);
        System.out.println("El arreglo es: " + Arrays.toString(arr));
        ordenamientoBurbujaMejorada(arr);
        System.out.println("Ordenamiento Burbuja Mejorado: " + Arrays.toString(arr) + "\n");

        desordenarArreglo(arr);
        System.out.println("El arreglo es: " + Arrays.toString(arr));
        ordenamientoInsercion(arr);
        System.out.println("Ordenamiento por Insercion: " + Arrays.toString(arr) + "\n");

        desordenarArreglo(arr);
        System.out.println("El arreglo es: " + Arrays.toString(arr));
        ordenamientoSeleccion(arr);
        System.out.println("Ordenamiento por Seleccion: " + Arrays.toString(arr) + "\n");

    }

    public static void ordenamientoBurbuja(int[] arr) {
        int i = 0;
        int j, k, n;
        k = arr.length;
        n = k - i - 1;

        for (i = 0; i < k; i++) {
            for (j = 0; j < n; j++) {
                if (arr[j] > arr[j + 1]) {
                    intercambiar(arr, j, j + 1);
                }
            }
        }
    }

    public static void ordenamientoBurbujaMejorada(int[] arr) {
        boolean ordenado = false;
        int i = 0;
        int j, k, n;
        k = arr.length;
        n = k - 1 - i;

        while (i < k - 1 && !ordenado) {
            ordenado = true;
            for (j = 0; j < n; j++) {
                if (arr[j] > arr[j + 1]) {
                    ordenado = false;
                    intercambiar(arr, j, j + 1);
                }
            }
        }
    }

    public static void ordenamientoInsercion(int[] arr) {
        int i, j, n, aux;
        n = arr.length;

        for (i = 0; i < n; i++) {
            aux = arr[i];
            j = i;
            while (j > 0 && aux < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = aux;
        }
    }

    public static void ordenamientoSeleccion(int[] arr) {
        int i, n, posicionDelMenor;
        n = arr.length;

        for (i = 0; i < n; i++) {
            posicionDelMenor = buscarMenor(arr, i);
            if (arr[posicionDelMenor] < arr[i]) {
                intercambiar(arr, i, posicionDelMenor);
            }
        }
    }

    // Modulos basicos
    public static void intercambiar(int[] arr, int p1, int p2) {
        int aux;
        aux = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = aux;
    }

    public static int buscarMenor(int[] arr, int i) {
        int menorNum = Integer.MAX_VALUE;
        int posicion = i;
        int j, n;
        n = arr.length;

        for (j = i; j < n; j++) {
            if (arr[j] < menorNum) {
                menorNum = arr[j];
                posicion = j;
            }
        }
        return posicion;
    }

    // Sin contar este
    private static void desordenarArreglo(int[] arr) {
        int aux;
        int n = arr.length - 1;
        Random random = new Random();
        for (int i = n; i > 0; i--) {
            aux = random.nextInt(i + 1);
            if (aux != i) {
                arr[aux] ^= arr[i];
                arr[i] ^= arr[aux];
                arr[aux] ^= arr[i];
            }
        }
    }
}
