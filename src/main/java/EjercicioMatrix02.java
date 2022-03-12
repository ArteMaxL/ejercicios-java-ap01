import java.util.Arrays;
import java.util.Scanner;

public class EjercicioMatrix02 {
    public static void main(String[] args) {
        // Una escuela primaria utiliza una matriz para calcular los promedios de sus alumnos. Para ello tienen una
        // matriz de 10 filas, donde cada fila representa a un alumno y 4 columnas. Las primeras 3 columnas representan
        // las notas de cada uno de los alumnos, mientras que la 4 es el promedio de las mismas. Se desea un programa
        // que sea capaz de permitir la carga por teclado de las 3 notas de cada alumno, de realizar el cálculo
        // automático del promedio, de guardar el mismo en la 4 columna y luego mostrar por pantalla cada una de las
        // notas y el promedio obtenido. Por ejemplo.
        //Nota: tener en cuenta que generalmente las calificaciones y los promedios no suelen ser números enteros, sino
        // que pueden tener decimales.
        Scanner input = new Scanner(System.in);
        double[][] tabla = new double[10][4];


        for (int i = 0; i < 10; i++) {
            double suma = 0;
            for (int j = 0; j < 3; j++) {
                System.out.println("Para el alumno en la posición " + i + " la nota en la posición " + j);
                double cargaUsuario = Double.parseDouble(input.nextLine());
                suma += cargaUsuario;
                tabla[i][j] = cargaUsuario;
                if (j == 2) {
                    double promedio = suma / 3;
                    tabla[i][3] = promedio;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Las notas del alumno en la posición " + i + ", fueron: \n");
            for (int j = 0; j < 3; j++) {
                System.out.println(tabla[i][j] + ", ");
            }
            System.out.println("El promedio es: " + tabla[i][3]);
            System.out.println("+**********************************");
        }
    }
}