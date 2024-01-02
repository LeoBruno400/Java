public class Ejercicio3 {
    public static void main(String[] args) {
        int[] arr1 = {30, 27, 21, 6, 1, 0};
        int[] arr2 = {21, 20, 5};
        int[] a={30,17,12,8,3};
        int[] b={40,27,19,15,5};
        leerArreglo(fusionArreglada(arr1, arr2));
        System.out.println();
        leerArreglo(fusionArreglada(a, b));
    }

    public static void leerArreglo(int[] arreglo){
        //Muestra por pantalla los caracteres de un arreglo
        int i;
        System.out.println("Arreglo: ");
        for(i=0; i<arreglo.length; i++){
            System.out.print(arreglo[i]+ " ");
        }
    }

    public static int[] fusionArreglada(int[]arr1, int[]arr2){
        int i=0, j=0, k=0,l, cantPosiciones, longitudArr1, longitudArr2;
        longitudArr1 = arr1.length;
        longitudArr2 = arr2.length;
        cantPosiciones = longitudArr1 + longitudArr2;
        int[] arrFusion = new int[cantPosiciones];

        while(j<longitudArr1 && k<longitudArr2){
            if(arr1[j] >= arr2[k]){
                arrFusion[i]= arr1[j];
                i++;
                j++;
            }else{
                arrFusion[i] = arr2[k];
                i++;
                k++;
            }
        }
        if(j == longitudArr1){
            for (l = k; l < longitudArr2; l++) {
                arrFusion[i] = arr2[l];
                i++;
            }
        }else{
            for (l = j; l < longitudArr1; l++) {
                arrFusion[i] = arr1[l];
                i++;
            }
        }
        return arrFusion;
    }
}