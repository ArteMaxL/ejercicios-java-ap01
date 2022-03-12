import java.util.Arrays;
import java.util.Scanner;

public class EjercicioMatrix01 {
    public static void main(String[] args) {
        //Una matriz de 5 filas x 3 columnas almacena el total de goles de 5 jugadores de futbol en los últimos 3
        // partidos que jugaron, donde cada fila representa a un jugador y cada columna a la cantidad de goles que hizo.
        // Se necesita un programa que sea capaz de permitir la carga de los goles, calcular el promedio de goles
        // realizado por cada jugador y almacenar el resultado en un vector de 5 posiciones, donde cada posición
        // representará a un jugador. Tener en cuenta el siguiente diagrama para llevar a cabo el planteo:
        //Nota: tener en cuenta que el promedio de goles puede dar como resultado un número que NO SEA ENTERO.
        Scanner input = new Scanner(System.in);
        int[][] tablaGoles = new int[5][3];
        int sumaDeGoles = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el número de fila del jugador: " + i + " los goles de los tres partidos: " + j);
                int cargaUsuario = input.nextInt();
                tablaGoles[i][j] = cargaUsuario;
                sumaDeGoles += cargaUsuario;
            }
        }
        System.out.println("Tabla de goles cargada:\n------------------------------------------");
        System.out.println(Arrays.deepToString(tablaGoles));
        System.out.println("Promedio de goles = " + (double)Math.round(1.00 * sumaDeGoles / 15));
    }
}
