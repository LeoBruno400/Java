public class OrdenamientoPorSeleccion {
    public static void main(String[] args) {
        int [] arreglo = {4,5,10,-7,2,20,22,45,22,1,66,2,55,30};
        int [] arregloVariante = {4,5,10,-7,2,20,22,45,22,1,66,2,55,30};
        ordenarPorSeleccion(arreglo);
        ordenarPorSeleccionVariante(arregloVariante);
        mostrarArreglo(arreglo);
        System.out.println("\nVariante: ");
        mostrarArreglo(arregloVariante);
    }

    public static void ordenarPorSeleccionVariante (int [] arreglo){
        int posMayor;
        for (int i = arreglo.length-1; i >= 0; i--) {
            posMayor = buscarMenorVariante(arreglo, i);
            if(arreglo[posMayor]<arreglo[i]){
                intercambiar(arreglo, posMayor, i);
            }
        }
    }

    public static void ordenarPorSeleccion (int [] arreglo){
        int posMenor;
        for (int i = 0; i < arreglo.length; i++) {
            posMenor = buscarMenor(arreglo, i);
            if(arreglo[posMenor]<arreglo[i]){
                intercambiar(arreglo, posMenor, i);
            }
        }
    }

    public static int buscarMenorVariante (int[] arreglo, int i){
        int menorNum = 999999, posicion=i;
        for (int j = 0; j <= i; j++) {
            if(arreglo[j]<menorNum){
                menorNum = arreglo[j];
                posicion = j;
            }
        }
        return posicion;
    }

    public static void mostrarArreglo (int [] arreglo){
        for (int index = 0; index < arreglo.length; index++) {
            System.out.print(arreglo[index] + " ");
        }
    }

    public static void intercambiar(int [] arreglo,int posMenor,int i){
        int aux;
        aux = arreglo[i];
        arreglo[i] = arreglo[posMenor];
        arreglo[posMenor] = aux;
    }

    public static int buscarMenor (int[] arreglo, int i){
        int menorNum = 999999, posicion=i;
        for (int j = i; j < arreglo.length; j++) {
            if(arreglo[j]<menorNum){
                menorNum = arreglo[j];
                posicion = j;
            }
        }
        return posicion;
    }

}
