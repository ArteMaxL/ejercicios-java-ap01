import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class EjercicioMatrix05 {
    public static void main(String[] args) {
        /*
        Una empresa constructora desea llevar a cabo un premio para sus obreros que hayan realizado horas extras en
         los últimos 6 meses. Para ello, lleva una matriz de control de 15 filas x 6 columnas, donde cada fila
         corresponde a un empleado distinto y donde cada columna representa el total de horas trabajadas por mes.
         El monto de horas normal trabajado x mes es de 8 horas diarias, 5 días a la semana, 4 semanas por mes, es
         decir: 160 horas. //Todo monto superior a este es considerado como horas extras.

        Se desea un programa que permita la carga de horas trabajadas por cada obrero y que sea capaz de determinar
         aquellos que hayan realizado horas extras. Para registrar las horas extras realizadas se utilizará un vector
         de 15 posiciones en donde se deberá calcular y almacenar la cantidad de horas extras de cada obrero. En caso
         de que no haya realizado horas extras, deberá incluirse un número 0. Tomar como ejemplo la siguiente imagen:
        */
        Scanner input = new Scanner(System.in);
        int[][] horasTotal = new int[15][6];
        int[] horasExtras = new int[horasTotal.length];
        String[] apellidos = new String[horasTotal.length];

        System.out.println("Carga las horas del personal de manera mensual");
        System.out.println("El excedente de 160 horas por mes se considera horas extras");
        System.out.println("************************************************************");

        for (int i = 0; i < horasTotal.length; i++) {
            System.out.println("Ingresa el apellido del empleado: ");
            apellidos[i] = input.next();
            for (int j = 0; j < 6; j++) {
                System.out.print("Carga las horas del mes " + (j + 1) + ": ");
                int carga = input.nextInt();
                horasTotal[i][j] = carga;
                if (carga > 160) {
                    horasExtras[i] += carga - 160;
                }
            }
            System.out.println("-------------------------------------");
        }
        for (int i = 0; i < horasExtras.length; i++) {
            System.out.println("Empleado: " + apellidos[i] + " - Horas extras: " + horasExtras[i]);
            System.out.println("-------------------------------------------");
        }
    }
}
