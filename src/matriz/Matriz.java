package matriz;

public class Matriz {

    int[][] enteros1;
    int[][] enteros2;

    public Matriz(int i, int j) {
        enteros1 = new int[i][j];
        enteros2 = new int[i][j];
    }

    public void llenaMatriz1() {
        int l = 1;
        for (int i = 0; i < enteros1.length; i++) {
            for (int j = 0; j < enteros1[i].length; j++) {
                enteros1[i][j] = l;
                l++;

            }
        }
    }

    public void llenaMatriz2() {
        int l = 1;
        for (int i = 0; i < enteros2.length; i++) {
            for (int j = 0; j < enteros2[i].length; j++) {
                enteros2[i][j] = l;
                l++;

            }
        }
    }

    public void imprimirMatriz(int[][] llena) {
        System.out.println("------Suma de Matrices--------");
        for (int i = 0; i < llena.length; i++) {
            for (int j = 0; j < llena[i].length; j++) {
                System.out.print("[" + llena[i][j] + ""
                          + "]");
            }

            System.out.println(" ");
        }
    }

    public int[][] sumarMatrices(int[][] sum1, int[][] sum2) {

        int[][] resultado = new int[3][3];
        System.out.println("-----Resultado de la suma---------");
        for (int i = 0; i < enteros1.length; i++) {
            for (int j = 0; j < enteros2[i].length; j++) {
                resultado[i][j] = sum1[i][j] + sum2[i][j];

                System.out.print("[" + resultado[i][j] + ""
                          + "]");
            }
            System.out.println(" ");
        }
        return resultado;
    }

}
