public class BusquedaSecuencial {
    public static void main(String[] args) {
        int [] arreglo = {4,5,10,-7,2,20,22,45,22,1,66,2,55,30};
        System.out.println(busquedaSecuencial(arreglo, -7));
        System.out.println(busquedaSecuencialReversa(arreglo, -7));
    }
  
    public static int busquedaSecuencial (int [] arreglo, int buscado){
        int posicion=-1, i=0;
        do{
            i++;
        }while(i<arreglo.length && arreglo[i]!=buscado);
        if(arreglo[i]==buscado){
            posicion = i;
        }
        return posicion;
    }

    public static int busquedaSecuencialReversa (int [] arreglo, int buscado){
        int posicion=-1, i=arreglo.length-1;
        do{
            i--;
        }while(i>=0 && arreglo[i]!=buscado);
        if(arreglo[i]==buscado){
            posicion = i;
        }
        return posicion;
    }

}
