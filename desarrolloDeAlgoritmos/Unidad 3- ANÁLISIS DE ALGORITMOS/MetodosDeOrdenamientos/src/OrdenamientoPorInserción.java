public class OrdenamientoPorInserción {
    public static void main(String[] args) {
        int[] arr = { 89, 45, 68, 90, 29, 34, 17 };
        System.out.println("El arreglo original es: ");
        mostrarArreglo(arr);
        System.out.println("El arreglo ordenado de menor a mayor: ");
        insercion(arr);
        mostrarArreglo(arr);
        System.out.println("El arreglo ordenado de mayor a menor: ");
        insercionInvertida(arr);
        mostrarArreglo(arr);
    }

    public static void insercion(int[] arr) {
        int i, j, aux;
        int n = arr.length - 1;

        for (i = 1; i <= n; i++) {
            aux = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > aux) {
                arr[j] = arr[j - 1];
                j = j - 1;
            }
            arr[j] = aux;
        }
    }

    public static void insercionInvertida(int[] arr) {
        int i, j, aux;
        int n = arr.length - 1;

        for (i = 1; i <= n; i++) {
            aux = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] < aux) {
                arr[j] = arr[j - 1];
                j = j - 1;
            }
            arr[j] = aux;
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