package Problema04;

public class Problema04 {
    public static void main(String[] args) {
        // Evalua si un numero es capicua
        String numero;
        int posicion;
        numero = "1121";
        posicion = numero.length() - 1;
        System.out.println(comp(numero, posicion));
    }

    public static boolean comp(String num, int posicion) {
        boolean esIgual = false, aux;
        char casoBase;
        char numeroEvaluar;
        casoBase = num.charAt(0);
        numeroEvaluar = num.charAt(posicion);

        // Caso Base: Cuando uno sea distino del primer digito o la posicion se 0
        if (casoBase == numeroEvaluar) {
            esIgual = true;
            if (posicion > 0 && esIgual == true) {
                aux = comp(num, posicion - 1);
                if (aux == false) {
                    esIgual = aux;
                }
            }
        }
        return esIgual;
    }
}
