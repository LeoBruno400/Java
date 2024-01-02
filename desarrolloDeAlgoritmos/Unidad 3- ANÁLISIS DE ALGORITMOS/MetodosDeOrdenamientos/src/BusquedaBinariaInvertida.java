import java.util.Scanner;

public class BusquedaBinariaInvertida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo = {20,18,16,14,12,10,8,6,4,2};
        int posicion, valor;
        System.out.println("Ingrese un valor a buscar en el arreglo: ");
        valor = sc.nextInt();
        posicion = busquedaBinariaInvertida(arreglo, valor);
        if(posicion == -1){
            System.out.println("El valor buscado no se encuentra en el arreglo.");
        }else{
            System.out.println("El valor buscado se encuentra en la posicion "+ posicion);
        }
        sc.close();
    }

    public static int busquedaBinariaInvertida(int[] arreglo, int valorBuscado){
        //busca de manera binaria un valor numerico en un arreglo. Devuelve la posicion de encontrarlo, -1 de no encontrarlo.
        boolean encontrado;
        int inicio, fin, medio, posicion;
        inicio = 0;
        fin = arreglo.length-1;
        encontrado = false;
        posicion = -1;
        while (inicio <= fin && !encontrado){
            medio= (inicio + fin)/2;
            if(arreglo[medio] == valorBuscado){
                posicion = medio;
                encontrado = true;
            }else{
                if(arreglo[medio] < valorBuscado){
                    fin = medio -1;
                }else{
                    inicio = medio +1;
                }
            }
        }
        return posicion;
    }
}
