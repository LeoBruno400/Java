package Problema19;

public class Problema19 {
    public static void main(String[] args) {
        int numero = 9;
        int espacios = 10;
        System.out.println("--------------------------------------------------------");
        piramideNumeros(numero, espacios);
        System.out.println("--------------------------------------------------------");
    }

    public static String piramideNumeros(int num, int espacios) {
        String numIngresado = Integer.toString(num);
        String cadenaIterativa = "";

        if (numIngresado.equals("1")) {
            System.out.println(concatenaEspacios(espacios) + numIngresado);
        } else {
            numIngresado += " " + piramideNumeros(num - 1, espacios + 2);
            System.out.print(concatenaEspacios(espacios));
            cadenaIterativa += piramideNumerosIzquierda(num - 1) + " ";
            System.out.println(cadenaIterativa + numIngresado);
        }
        return numIngresado;
    }

    public static String piramideNumerosIzquierda(int num) {
        String numero = Integer.toString(num);
        String cadenaNueva = "";

        if (numero.equals("1")) {
            numero += ""; // Caso base: retorna 1
        } else {
            // Caso iterativo: suma los digitos en una cadena de strings
            cadenaNueva += piramideNumerosIzquierda(num - 1) + " ";
            System.out.print(cadenaNueva);
        }
        return numero;
    }

    public static String concatenaEspacios(int espacios) {
        String cantEspacios = "";
        if (espacios > 0) {
            cantEspacios += " " + concatenaEspacios(espacios - 1);
        }
        return cantEspacios;
    }

    
}
