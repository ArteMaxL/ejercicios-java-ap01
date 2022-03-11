import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArray05 {
    public static void main(String[] args) {
        //Se necesita un vector que permita cargar por teclado el nombre de 10 animales. A partir de esta carga, se
        // desea otro vector que copie los mismos nombres pero en el orden inverso, es decir, si los nombres son:
        // perro, gato, lagartija, el nuevo vector debe contener: lagartija, gato, perro. Una vez realizado el cambio,
        // mostrar por pantalla ambos vectores para compararlos.

        Scanner input = new Scanner(System.in);
        String[] animales = new String[10];
        String[] animalesInverso = new String[animales.length];

        System.out.println("A continuación deberás cargar el nombre de 10 animales:");
        for (int i = 0; i < animales.length; i++) {
            animales[i] = input.nextLine();
            animalesInverso[9-i] = animales[i];
        }
        System.out.println("------------------------");
        System.out.println("Array como fue cargado:");
        System.out.println(Arrays.toString(animales));
        System.out.println("------------------------");
        System.out.println("Array con orden inverso:");
        System.out.println(Arrays.toString(animalesInverso));
        System.out.println("------------------------");
    }
}