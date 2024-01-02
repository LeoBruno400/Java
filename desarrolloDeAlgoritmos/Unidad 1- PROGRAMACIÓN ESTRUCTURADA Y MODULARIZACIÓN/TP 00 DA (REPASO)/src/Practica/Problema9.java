/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practica;

import java.util.Scanner;

/**
 *
 * @author Leo
 */
public class Problema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        Scanner sc = new Scanner(System.in);
        String contraseña;
        boolean contraseñaSegura ;

        //Solicitud de datos
        do {
            do {
                System.out.println("Ingrese una contraseña: \nNota: Debe contener exactamente 8 caracteres\n Al menos 1 numero\n Al menos 1 letra\n Al menos 1 caracter de tipo: '*' '/' '-' '$' '%' '#' ");
                contraseña = sc.next();
            } while (contraseña.isEmpty());

            //Llamo al modulo
            contraseñaSegura = checker(contraseña);

            if (contraseñaSegura == true ) {
                System.out.println("Su contraseña es segura");
            } else {
                System.out.println("Su contraseña no es segura. \nIntentelo de nuevo");
            }
        } while (contraseñaSegura == false);
    }

    //Modulo que Identificia si la contraseña cumple con las condiciones
    public static boolean checker(String cadena) {
        boolean safePass, numero = false, letra = false, caracter=false;
        int i;
        //Primera condicion: Si son 8 caracteres exactos
        if (cadena.length() == 8) {
            //Recorro la cadena para buscar las demas condiciones
            for (i = 0; i < cadena.length(); i++) { 
                //Segunda condicion: Al menos 1 letra
                if (Character.isLetter(cadena.charAt(i))) {
                    letra = true;
                    //Tercera condicion: Al menos 1 numero
                } else if (Character.isDigit(cadena.charAt(i))) {
                    numero = true;
                    //Cuarta condicion: Al menos 1 caracter especial
                } else if ((cadena.charAt(i) == '*') || (cadena.charAt(i) == '/') || (cadena.charAt(i) == '-') || (cadena.charAt(i) == '$') || (cadena.charAt(i) == '%') || (cadena.charAt(i) == '#')){
                    caracter = true;
                }
            }
        }
        safePass = letra && numero && caracter;
        return safePass;
    }
}
