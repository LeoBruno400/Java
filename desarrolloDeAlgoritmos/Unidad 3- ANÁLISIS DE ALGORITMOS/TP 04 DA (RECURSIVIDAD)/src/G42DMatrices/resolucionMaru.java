package G42DMatrices;

public class resolucionMaru {
  public static void main(String[] args) {
    //Para probar matrices 3x3
    //int[][] matrizSimetrica = { { 1, 0, 4}, { 0, 2, 5 }, { 4, 5, 3 } };
    //int[][] matrizAsimetrica = { { 1, 0, 4 }, { 0, 2, 8 }, { 4, 5, 3 } };

    //Para probar matrices 4x4
    int[][] matrizSimetrica = { { 1, 0, 4, 7}, { 0, 2, 5, 6}, { 4, 5, 3, 0 }, {7, 6, 0, 4}};
    int[][] matrizAsimetrica = { { 1, 0, 4, 7}, { 0, 2, 5, 8}, { 4, 5, 3, 0 }, {7, 6, 0, 4}};

    System.out.println("Matriz: ");
    leerArreglo2DRecursivo(matrizSimetrica,0,0);
    System.out.print("\nLa matriz es igual a su transpuesta: ");
    analizaSimetriaMatriz(matrizSimetrica, 0, 0);
    System.out.println("----------------------------------------------------");
    System.out.println("Matriz: ");
    leerArreglo2DRecursivo(matrizAsimetrica,0,0);
    System.out.print("\nLa matriz es igual a su transpuesta: ");
    analizaSimetriaMatriz(matrizAsimetrica, 0, 0);
  }

  public static void leerArreglo2DRecursivo(int[][] arreglo, int i, int j) {
    //Imprime en pantalla el arreglo bidimensional de forma recursiva. 
    System.out.print(arreglo[i][j]+" ");
    if(i != arreglo.length-1 || j != arreglo[i].length-1){
      if(j == arreglo[i].length-1){
        i++;
        j=0;
        System.out.println("");
      }else{
        j++;
      }
      leerArreglo2DRecursivo(arreglo, i, j);
    }
  }

  // Modificar para que el retorno sea booleano y NO sout.
  public static void analizaSimetriaMatriz(int[][] m, int i, int j) {
    /*Delimita el recorrido. De llegar al limite y no haber terminado 
    la recursividad en ningun paso previo, concluye escribiendo VERDADERO*/ 
    if ((i != m.length - 1 || j != m[0].length - 1)) {
      // utiliza modulo compara para verificar simetria. De ser Falso, escribe falso y se termina la recursividad
      if (compara(m[i][j], m[j][i])) {
        /*BLOQUE MUY IMPORTANTE. Si j-columnas es la ultima posicion cambia la i-fila 
        y resetea la j-columnas, sino hace +1 a j-col*/
        if (j == m[0].length - 1) {
          i++;
          j = 0;
        } else {
          j++;
        }
        //recursividad con i,j modificados por el bloque anterior.
        analizaSimetriaMatriz(m, i, j);
      } else {
        System.out.println("Falso");
      }
    } else {
      System.out.println("Verdadero");
    }
  }

  public static boolean compara(int elemento1, int elemento2) {
    //Modulo que compara dos valores dados por parametro, retorna true de ser iguales, false de ser distintos.
    boolean iguales = true;
    if (elemento1 != elemento2) {
      iguales = false;
    }
    return iguales;
  }
}
