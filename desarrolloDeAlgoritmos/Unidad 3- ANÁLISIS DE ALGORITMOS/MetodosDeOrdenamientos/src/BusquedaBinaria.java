import java.util.Scanner;

public class BusquedaBinaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo = {2,4,6,8,10,12,14,16,18,20};
        int posicion, valor;
        System.out.println("Ingrese un valor a buscar en el arreglo: ");
        valor = sc.nextInt();
        posicion = busquedaBinaria(arreglo, valor);
        if(posicion == -1){
            System.out.println("El valor buscado no se encuentra en el arreglo.");
        }else{
            System.out.println("El valor buscado se encuentra en la posicion "+ posicion);
        }
        sc.close();
    }

    public static int busquedaBinaria(int[] arreglo, int valorBuscado){
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
                if(arreglo[medio]> valorBuscado){
                    fin = medio -1;
                }else{
                    inicio = medio +1;
                }
            }
        }
        return posicion;
    }
}
