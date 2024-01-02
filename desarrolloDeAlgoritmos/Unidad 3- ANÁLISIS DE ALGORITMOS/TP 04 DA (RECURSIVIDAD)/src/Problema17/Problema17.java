package Problema17;

public class Problema17 {
    public static void main(String[] args) {
        int numero = 9;
        piramideNumerosDecrecientes(numero);
    }

    public static String piramideNumerosDecrecientes(int num) {
        String numIngresado = Integer.toString(num); // Convierto el numero en una cadena de caracteres
        // Caso Base: si el numero es igual a 1, suma un vacio y imprime 1
        if (numIngresado.equals("1")) {
            System.out.println(numIngresado);
        } else {
            // Caso iterativo: sumo los casos en la misma cadena:
            numIngresado += " " + piramideNumerosDecrecientes(num - 1);
            System.out.println(numIngresado);
        }
        return numIngresado;
    }
}
