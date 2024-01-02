package PracticaTemasFinal;

import java.util.Scanner;

public class RecursividadPractica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[][] matriz = { { 1, 2, 3 }, { 2, 1, 5 }, { 3, 5, 1 } };
        // int[] array = { 1, 2, 3, 4, 5 };

        // System.out.println(numerosConsecutivos(4904));
        // System.out.println(matrizTraspuesta(matriz, 0, 0));
        // System.out.println(mayoresAlPromedio(array, 0));
        // System.out.println(calcularPromedio(array, 0));
        // System.out.println(redMensajes(9));

        sc.close();
    }

    public static boolean numerosConsecutivos(int numero) {
        // Este modulo compara si un numero contiene numeros consecutivos.
        boolean esConsecutivo;

        // Caso especial: 9 y 0 son considerados consecutivos.
        if ((numero / 10) == 9 && (numero % 10) == 0) {
            esConsecutivo = true;
        } else {
            // Compruebo si los numeros que estan juntos son consecutivos.
            if ((numero / 10) == (numero % 10) - 1) {
                // LOGICA: Al ser consecutivos el siguiente numero siempre es el anteriror + 1.
                esConsecutivo = true;
            } else {
                if (numero / 100 < 1) {
                    // Verifica que el número ingresado no sea un dígito individual.
                    esConsecutivo = false;
                } else { // Para no recorrer todos los casos, cuando encuentre el primer par consecutivo.
                         // termina de ejecutarse.
                    if (numerosConsecutivos(numero / 100)) {
                        esConsecutivo = true;
                    } else if (numerosConsecutivos(numero % 100)) {
                        esConsecutivo = true;
                    } else {
                        // Si no se encuentra en las mitades, se verifican los numeros del medio.
                        esConsecutivo = numerosConsecutivos((numero / 10) % 100);
                    }
                }
            }
        }
        return esConsecutivo;
    }

    public static boolean matrizTraspuesta(int[][] matriz, int fila, int columna) {
        // Este modulo compara si una matriz NxN es igual a su traspuesta.
        int n = matriz.length;
        boolean esTraspuesta;
        String columnaAnalizar = ""; // Almacena la columna actual en forma de cadena.

        if (fila < n) {
            // Se invoca al modulo en fila 0 ya que se iteran las columnas.
            columnaAnalizar = conseguirColuma(matriz, 0, columna);
            // System.out.println(columnaAnalizar);
            if (compararFilaColumna(matriz, fila, columna, columnaAnalizar)) {
                // Si fila = columna => keep going.
                esTraspuesta = matrizTraspuesta(matriz, fila + 1, columna + 1);
            } else {
                esTraspuesta = false;
            }
        } else {
            esTraspuesta = true;
        }
        return esTraspuesta;
    }

    private static boolean compararFilaColumna(int[][] matriz, int fila, int columna, String columnaAnalizar) {
        int k = matriz[0].length;
        String filaAnalizar;
        boolean igualdad = false;

        if (columna < k) {
            // Se invoca al modulo en columna 0 ya que se iteran las filas.
            filaAnalizar = conseguirFila(matriz, fila, 0);
            // System.out.println(filaAnalizar);
            if (filaAnalizar.equals(columnaAnalizar)) {
                igualdad = true;
            }
        }
        return igualdad;
    }

    private static String conseguirFila(int[][] matriz, int fila, int columna) {
        // Este modulo obtiene una fila de la matriz como una cadena.
        String filaAnalizada = "";
        int k = matriz[0].length;

        if (columna < k) {
            filaAnalizada = matriz[fila][columna] + "";
            filaAnalizada = filaAnalizada + conseguirFila(matriz, fila, columna + 1);
        }
        return filaAnalizada;
    }

    private static String conseguirColuma(int[][] matriz, int fila, int columna) {
        // Este modulo obtiene una columna de la matriz como una cadena.
        int n = matriz.length;
        String columnaAnalizada = "";

        if (fila < n) {
            columnaAnalizada = matriz[fila][columna] + "";
            columnaAnalizada = columnaAnalizada + conseguirColuma(matriz, fila + 1, columna);
        }
        return columnaAnalizada;
    }

    public static String arregloNrosMayoresPromedio(int[] array, int pos) {
        // Este modulo retorna los numeros mayores al promedio de los nros dentro del
        // arreglo.
        String mayoresPromedio;

        // Se verifica que la posicion sea valida.
        if (pos < array.length) {
            if (array[pos] > calcularPromedio(array, 0)) { // Verifica que el nro sea mayor al promedio.
                mayoresPromedio = array[pos] + " " + arregloNrosMayoresPromedio(array, pos + 1);
                // Se agrega al String dejando espacios de por medio.
            } else {
                mayoresPromedio = arregloNrosMayoresPromedio(array, pos + 1);
                // Caso contrario, se llama sin contar el en la posicion acutal.
            }
        } else {
            mayoresPromedio = "";
        }
        return mayoresPromedio;
    }

    private static int calcularPromedio(int[] array, int pos) {
        // Este modulo retorna la suma de los numeros dentro del arreglo.
        int sumaTotal;
        int n = array.length;

        if (pos == n - 1) {
            sumaTotal = array[pos];
        } else {
            sumaTotal = array[pos] + calcularPromedio(array, pos + 1);
        }

        if (pos == 0) {
            sumaTotal = sumaTotal / n;
        }

        return sumaTotal;
    }

    public static int redMensajes(int mensaje) {    
        int cantMensajes;

        if (mensaje == 1) {
            cantMensajes = 1;
        } else {
            if (mensaje % 2 == 0) {
                cantMensajes = mensaje + redMensajes(mensaje / 2);
            } else {
                cantMensajes = mensaje + redMensajes((mensaje * 3) + 1);
            }
        }
        return cantMensajes;
    }

}
