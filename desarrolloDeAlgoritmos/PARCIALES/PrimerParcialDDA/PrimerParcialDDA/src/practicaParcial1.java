public class practicaParcial1 {
    public static void main(String[] args) {
        int[][] matriz = {{2, 1, 3, 4}, {1, 0, 5, 6}, {0, 4, 4, 4}};
        String ejemplo3b = "este no es un error";
        String ejemplo3c = "muestro mi ejemplo";
        System.out.println(matriz3A(matriz));
        System.out.println(matriz3B(matriz));
        System.out.println(matriz3C(matriz));
        System.out.println(string3B(ejemplo3b));
        System.out.println(string3C(ejemplo3c));
        
    }

    public static boolean punto2B(Censista[] arr){
        boolean nulo = false;
        int i = 0, n = arr.length;

        while(i < n && nulo == false){
            if(arr[i] == null){
                nulo = true;
            }else{
                i++;
            }
        }
        return nulo;
    }

    //Cuál es el piso con mayor cantidad de personas
    public static int matriz3A(int[][] arr){
        int i, j, n = arr.length - 1, k = arr[0].length - 1;
        int mayor = Integer.MIN_VALUE;
        int fila = 0;

        for (i = 0; i <= n; i++) {
            for (j = 0; j <= k; j++) {
                if(arr[i][j] > mayor){
                    mayor = arr[i][j];
                    fila = i;
                }
            }
        }
        return fila;
    }

    //El promedio de personas del piso 1.
    public static double matriz3B(int[][] arr){
        int j, k = arr[0].length;
        int contador = 0; 
        double promedio;

        for (j = 0; j < k; j++) {
            contador += arr[1][j];
        }
        promedio = contador/k;

        return promedio;
    }

    //Si existe algún departamento con 0 personas en el piso 2.
    public static boolean matriz3C(int[][] arr){
        int j = 0, k = arr[0].length;
        boolean existe = false;

        while(j < k && existe == false){
            if(arr[2][j] == 0){
                existe = true;
            }else{
                j++;
            }
        }
        return existe;
    }

    //Retorne la cantidad de palabras que terminan en n, s o vocal.
    public static int string3B(String texto) {
        String[] palabras = texto.split(" ");
        int i, n = palabras.length, ultima, contador = 0;
        for (i = 0; i < n; i++) {
            ultima = palabras[i].length() - 1;
            if (palabras[i].charAt(ultima) == 'n' || palabras[i].charAt(ultima) == 's'
                    || palabras[i].charAt(ultima) == 'a' || palabras[i].charAt(ultima) == 'e'
                    || palabras[i].charAt(ultima) == 'i' || palabras[i].charAt(ultima) == 'o'
                    || palabras[i].charAt(ultima) == 'u') {
                        contador ++;
            }
        }
        return contador;
    }

    //Retorne la cantidad de palabras que no contengan las vocales débiles (i , u)
    public static int string3C(String texto) {
        String[] palabras = texto.split(" ");
        boolean centinela = false;
        int i, j = 0, k, n = palabras.length, contador = 0;

        for (i = 0; i < n; i++) {
            k = palabras[i].length();
            while (j < k && centinela == false) {
                if (palabras[i].charAt(j) == 'i' || palabras[i].charAt(j) == 'u') {
                    centinela = true;
                } else {
                    j++;
                }
            }
            j=0;
            if (centinela == true) {
                centinela = false;
            }else{
                contador++;
            }
        }
        return contador;
    }
}

/*
———————————No bitches?———————————————————
⠀⣞⢽⢪⢣⢣⢣⢫⡺⡵⣝⡮⣗⢷⢽⢽⢽⣮⡷⡽⣜⣜⢮⢺⣜⢷⢽⢝⡽⣝
⠸⡸⠜⠕⠕⠁⢁⢇⢏⢽⢺⣪⡳⡝⣎⣏⢯⢞⡿⣟⣷⣳⢯⡷⣽⢽⢯⣳⣫⠇
⠀⠀⢀⢀⢄⢬⢪⡪⡎⣆⡈⠚⠜⠕⠇⠗⠝⢕⢯⢫⣞⣯⣿⣻⡽⣏⢗⣗⠏⠀
⠀⠪⡪⡪⣪⢪⢺⢸⢢⢓⢆⢤⢀⠀⠀⠀⠀⠈⢊⢞⡾⣿⡯⣏⢮⠷⠁⠀⠀
⠀⠀⠀⠈⠊⠆⡃⠕⢕⢇⢇⢇⢇⢇⢏⢎⢎⢆⢄⠀⢑⣽⣿⢝⠲⠉⠀⠀⠀⠀
⠀⠀⠀⠀⠀⡿⠂⠠⠀⡇⢇⠕⢈⣀⠀⠁⠡⠣⡣⡫⣂⣿⠯⢪⠰⠂⠀⠀⠀⠀
⠀⠀⠀⠀⡦⡙⡂⢀⢤⢣⠣⡈⣾⡃⠠⠄⠀⡄⢱⣌⣶⢏⢊⠂⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⢝⡲⣜⡮⡏⢎⢌⢂⠙⠢⠐⢀⢘⢵⣽⣿⡿⠁⠁⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠨⣺⡺⡕⡕⡱⡑⡆⡕⡅⡕⡜⡼⢽⡻⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⣼⣳⣫⣾⣵⣗⡵⡱⡡⢣⢑⢕⢜⢕⡝⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⣴⣿⣾⣿⣿⣿⡿⡽⡑⢌⠪⡢⡣⣣⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⡟⡾⣿⢿⢿⢵⣽⣾⣼⣘⢸⢸⣞⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠁⠇⠡⠩⡫⢿⣝⡻⡮⣒⢽⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
———————————No aprobe por boludo——————————
 */
