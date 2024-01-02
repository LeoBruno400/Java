package Problema09;

public class Problema09 {
    public static void main(String[] args) {
        // Hace una division por resta
        int divisor = 12;
        int dividendo = 169;
        System.out.println("El cociente es: " + divisionPorResta(divisor, dividendo));
    }

    public static int divisionPorResta(int divisor, int dividendo) {
        int resta;
        int cociente = 0;

        if (dividendo > divisor) {
            resta = dividendo - divisor;
            // Cociente: suma 1 por cada vez que se realice la resta
            cociente = 1 + divisionPorResta(divisor, resta);
        } else {
            // Caso base: devuelve 0 y se suma con los valores accareados
            cociente = 0;
        }
        return cociente;
    }
}
