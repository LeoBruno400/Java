public class Ejercicio2 {
    public static void main(String[] args) {
        int numero = 23; //true
        // int numero = 4; //false
        int [] arr = {30, 26, 23, 22, 20, 18, 14, 11, 10, 7, 5, 2};
        System.out.println(buscarArrelgoRecursivo(arr, numero, 0));
    }
    
    public static boolean buscarArrelgoRecursivo(int [] arr, int num, int contador){
        boolean aux = false;
        if(contador<arr.length){
            if(num==arr[contador]){
                aux = true;
            }else{
                aux = buscarArrelgoRecursivo(arr, num, contador+1);
            }
        }
        return aux;
    }  
}

