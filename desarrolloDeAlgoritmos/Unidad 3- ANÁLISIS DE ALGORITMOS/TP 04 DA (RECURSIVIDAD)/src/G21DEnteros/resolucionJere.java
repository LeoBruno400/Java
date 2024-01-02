package G21DEnteros;

import java.util.Scanner;

public class resolucionJere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Arreglo usado para testeo. 
        int[] arreglo = {1,2,1,2,2,12,5};
        int n;
        System.out.println("Ingrese el valor de N");
        n = sc.nextInt();
        System.out.println(elemMenorValor(arreglo, n, 0));
        sc.close();
    }

    public static int elemMenorValor (int [] arreglo, int n, int posicion){
        //Dado un arreglo y un numero, retorna el menor numero al ingresado encontrado en el arreglo.
        int resultado;
        if(posicion!=arreglo.length-1){
            resultado = elemMenorValor(arreglo, n, posicion+1);
            if((arreglo[posicion]<resultado || resultado==-1) && arreglo[posicion]>=n){
                resultado = arreglo[posicion];
            }
        } else {
            if(arreglo[posicion]>=n){
                resultado = arreglo[posicion];
            } else {
                resultado = -1;
            }
        }
        return resultado;
    }
}