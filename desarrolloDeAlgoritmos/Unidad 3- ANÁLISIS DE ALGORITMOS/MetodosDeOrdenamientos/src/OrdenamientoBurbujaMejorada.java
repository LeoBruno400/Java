public class OrdenamientoBurbujaMejorada {
    public static void main(String[] args) {
        int[] arr = { 89, 45, 68, 90, 29, 34, 17 };
        System.out.println("El arreglo original es: ");
        mostrarArreglo(arr);
        System.out.println("El arreglo ordenado de menor a mayor: ");
        burbujaMejorada(arr);
        mostrarArreglo(arr);
        System.out.println("El arreglo ordenado de mayor a menor: ");
        burbujaMejoradaInvertida(arr);
        mostrarArreglo(arr);
    }

    public static void burbujaMejorada(int[] arr) {
        boolean ordenado = false;
        int i = 0, j, aux;
        int k = arr.length;
        int n = k-1-i;

        while (i < k - 1 && !ordenado) {
            ordenado = true;
            for (j = 0; j < n; j++) {
                if (arr[j] > arr[j + 1]) {
                    ordenado = false;
                    aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
            i++;
        }
    }

    public static void burbujaMejoradaInvertida(int[] arr) {
        boolean ordenado = false;
        int i = 0, j, aux;
        int k = arr.length;
        int n = k-1-i;
        while (i < k - 1 && !ordenado) {
            ordenado = true;
            for (j = 0; j < n; j++) {
                if (arr[j] < arr[j + 1]) {
                    ordenado = false;
                    aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
            i++;
        }
    }

    public static void mostrarArreglo(int[] arr) {
        // Este modulo se encargar de mostrar por pantalla el arreglo
        int i, longitud;
        longitud = arr.length;
        for (i = 0; i < longitud; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

}
