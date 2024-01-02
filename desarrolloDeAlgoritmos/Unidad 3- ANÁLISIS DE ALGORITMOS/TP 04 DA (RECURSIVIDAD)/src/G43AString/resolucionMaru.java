package G43AString;

import java.util.Scanner;

public class resolucionMaru {
    public static void main(String[] args) {
        int inicio, fin;
        String palindromo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una oracion a ser evaluada como palindromo: ");
        //ejemplos Somos o No Somos // neuQuen // anIta lava La tina // Amor a rOma
        palindromo = sc.nextLine();
        //sin espacios y en minuscula. 
        palindromo = palindromo.replaceAll(" ", "");
        palindromo = palindromo.toLowerCase();
        System.out.println("True si es palindomo | False si no es palindromo: ");
        inicio = 0;
        fin = palindromo.length() - 1;
        System.out.println(esPalindromo(palindromo, inicio, fin));
        sc.close();
    }

    public static boolean esPalindromo(String oracion, int inicio, int fin) {
        //Evalua si la cadena ingresada es palindromo. True si lo es, false si no lo es. 
        boolean palindromo;
        int limite;
        limite = oracion.length() / 2;
        if (oracion.charAt(inicio) == oracion.charAt(fin)) {
            palindromo = true;
            if (inicio < limite && fin > limite) {
                esPalindromo(oracion, inicio + 1, fin - 1);
            }  
        }else{
            palindromo = false;
        }
        return palindromo;
    }
}
