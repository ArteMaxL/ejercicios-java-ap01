import java.util.Scanner;

public class EjercicioArray02 {
    public static void main(String[] args) {
        // En un vector de 15 posiciones se almacenan las edades de 15 alumnos.
        // Se desea un programa que sea capaz de determinar cuál es la mayor edad y cuál es la menor edad que se encuentra entre los estudiantes.
        int[] edades = new int[15];
        Scanner entradaUser = new Scanner(System.in);
        int user;
        int mayorEdad = 1;
        int menorEdad = 101;

        System.out.println("A continuación deberá ingresar 15 edades de alumnos:\n");

        for (int i = 0; i < edades.length; i++) {
            String[] edadStringPlural = new String[]{"Quedan ", " edades."};
            String[] edadStringSingular = new String[]{"Queda ", " edad."};
            int cantidad = edades.length - (i + 1);
            System.out.println("Ingrese la edad:");
            user = entradaUser.nextInt();

            if (cantidad > 1) {
                System.out.println(edadStringPlural[0] + "ingresar " + cantidad + edadStringPlural[1]);
            } else {
                System.out.println(edadStringSingular[0] + "ingresar " + cantidad + edadStringSingular[1]);
            }

            if (user > 0 && user < 101) {
                edades[i] = user;
                if (user > mayorEdad) {
                    mayorEdad = user;
                }
                if (user < menorEdad) {
                    menorEdad = user;
                }
            } else {
                System.out.println("La edad ingresada no es válida.\n");
                i--;
            }
        }
        System.out.println("El alumno de mayor edad tiene " + mayorEdad + " años.");
        System.out.println("El alumno de menor edad tiene " + menorEdad + " años.");
    }
}
