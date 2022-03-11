import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArray01 {
    public static void main(String[] args) {
        Scanner entradaUser = new Scanner(System.in);
        // Se necesita de un vector que sea capaz de almacenar 10 números enteros entre 1 y 100.
        // Realizar un programa que permita la carga por teclado de los 10 números solicitados.

        int[] numeros = new int[10];
        int user;
        System.out.println("A continuación deberás ingresar diez números entre 1 y 100\n");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingresa un número:");

            user = entradaUser.nextInt();

            if (user >= 1 && user <= 100) {
                numeros[i] = user;
            } else {
                System.out.println("El número ingresado no es válido.");
                i--;
            }
        }
        System.out.println("Los números ingresados fueron = " + Arrays.toString(numeros));
    }
}
