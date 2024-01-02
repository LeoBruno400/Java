public class practicaParcial2 {
    public static void main(String[] args) {
        int[][] matriz = {{10, 3, 2}, {101, 11, 10}, {102, 45, 1}};
        System.out.println(matrizRecursiva1C(matriz, 0, 0));
    }
    
    public static int matrizRecursiva1C(int[][] matriz, int fila, int columna) {
        int n = matriz.length, resultado;
        boolean filaBinaria;

        if (fila < n) {
            filaBinaria = filaBinaria(matriz, fila, columna);
            if (filaBinaria == true) {
                resultado = fila;
            } else {
                resultado = matrizRecursiva1C(matriz, fila + 1, 0);
            }
        } else {
            resultado = -1;
        }
        return resultado;
    }

    public static boolean filaBinaria(int[][] matriz, int fila, int columna){
        int k = matriz[0].length;
        boolean filaBinaria;
        String numero;

        if(columna < k){
            numero = Integer.toString(matriz[fila][columna]);
            if(detectarBinario(numero, 0) == true){
                filaBinaria = filaBinaria(matriz, fila, columna + 1);
            }else{
                filaBinaria = false;
            }
        }else{
            filaBinaria = true;
        }
        return filaBinaria;
    }
    
    public static boolean detectarBinario(String numero, int i){
        int n = numero.length();
        boolean binario;
        if(i < n){
            if(numero.charAt(i) == '1' || numero.charAt(i) == '0'){
                binario = detectarBinario(numero, i+1);
            }else{
                binario = false;
            }
        }else{
            binario = true;
        }
        return binario;
    }
}
