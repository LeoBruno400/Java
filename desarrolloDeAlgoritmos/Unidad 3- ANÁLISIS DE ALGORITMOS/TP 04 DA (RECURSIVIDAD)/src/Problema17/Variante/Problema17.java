package Problema17.Variante;

public class Problema17 {
    public static void main(String[] args) {
        int numero = 9;
        int numeroRecursivo = 1;
        piramideNumerosDecrecientes(numero,numeroRecursivo);
    }

    public static String piramideNumerosDecrecientes(int num, int numeroRecursivo) {

        String numIngresado = Integer.toString(num);
        String cadenaRecursiva = Integer.toString(numeroRecursivo);

        if (cadenaRecursiva.equals(numIngresado)) {
            System.out.println(numIngresado);
        } else {
            cadenaRecursiva += " " + piramideNumerosDecrecientes(num, numeroRecursivo+1);
            System.out.println(cadenaRecursiva);
        }
        return cadenaRecursiva;
    }

    /*
        9
        8 9
        7 8 9
        6 7 8 9
        5 6 7 8 9        
        4 5 6 7 8 9      
        3 4 5 6 7 8 9    
        2 3 4 5 6 7 8 9  
        1 2 3 4 5 6 7 8 9
    */
}
