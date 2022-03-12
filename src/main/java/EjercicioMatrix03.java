import java.util.Arrays;

public class EjercicioMatrix03 {
    public static void main(String[] args) {
        //Se desea un programa que sea capaz de rellenar completamente con números 1 una matriz de 4 x 4 a excepción de
        // su diagonal principal, la cual debe ser rellenada con números 0. Una vez realizada la carga, se desea mostrar
        // la matriz de forma ordenada por pantalla. Tener como ejemplo la matriz que se presenta a continuación.

        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = 1;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            matriz[i][i] = 0;
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
}
