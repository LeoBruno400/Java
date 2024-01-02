package G44AcambioBase;

import java.util.Scanner;

public class resolucionLeo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        // Numero debe pertenecer a los enteros positivos
        do {
            System.out.println("Ingrese un numero");
            numero = sc.nextInt();
            if (numero < 0) {
                System.out.println("El numero ingresado debe ser mayor o igual a 0");
            }
        } while (numero < 0);
        System.out.println(decimalABinario(numero));
        sc.close();
    }

    public static String decimalABinario(int num) {
        // Para convertir un numero decimal a binario:
        // -Tomamos los restos de las divisones sucesivas de un numero X
        // -Una vez hechas estas divisones con sus respectivos restos, se anotan los
        // mismos de atras hacia adelante
        String cadenaBinario = "";
        int restoNum;
        int cociente;

        if (num < 2) { // Mientras el numero sea menor a 2 se podria seguir dividiendo
            if (num != 0) {// Si el numero ingreasdo es negativo o 0, su valor sera 0
                cadenaBinario = "1";// Cunado el numero sea menor a 2 y distinto de 0, cadenaBinario se setea en 1
                                    // que es su ultimo resto
            } else {
                cadenaBinario = "0";// Caso contrario el valor sera 0
            }
        } else {
            restoNum = num % 2;
            // El resto de la divison del numero que se iria guardando en una cadena de
            // texto en el apilado
            cociente = num / 2;
            // Guardo el cociente del numero para que entre en la recursividad
            cadenaBinario += decimalABinario(cociente) + restoNum;
        }
        return cadenaBinario;
    }
}
