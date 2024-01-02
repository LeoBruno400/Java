public class OrdenamientoBurbuja {
    public static void main(String[] args) {
      int[]arreglo = {89,45,68,90,29,34,17};
      leerArreglo(arreglo);
      System.out.println();
      burbuja(arreglo);
      leerArreglo(arreglo);
    }

    public static void leerArreglo(int[] arreglo) {
        int i, longitudArreglo;
        longitudArreglo = arreglo.length;
        System.out.print("Arreglo: ");
        for (i = 0; i < longitudArreglo; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }

    public static void burbuja (int[] arreglo){
        int i,j, longitud, aux;
        longitud = arreglo.length;
        for (i= 0; i < longitud; i++) {
            for(j=0; j<(longitud-i-1); j++){
                if(arreglo[j]>arreglo[j+1]){
                    aux = arreglo[j];
                    arreglo [j] = arreglo[j+1];
                    arreglo [j+1] = aux;
                }
            }
        }
    }
}
