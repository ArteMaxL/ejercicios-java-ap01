import java.util.Arrays;
import java.util.Scanner;

public class EjercicioMatrix04 {
    public static void main(String[] args) {
        // Una casa de comida rápida utiliza una matriz de 20 filas y 5 columnas para determinar cada plato del menú y
        // sus correspondientes ingredientes que contiene. Para ello, cada fila representa un plato principal en donde
        // en la primera columna se especifica su nombre (por ejemplo: Milanesa), y en las demás los posibles
        // acompañamientos que puede tener el plato (por ejemplo, puré, ensalada rusa, papas fritas, ensalada de
        // lechuga y tomate, ensalada de zanahoria, etc). En caso de que tenga el plato menos de 4 tipos de
        // acompañamiento, en la matriz se cargará la palabra Ninguno en las posiciones que queden vacías.
        Scanner input = new Scanner(System.in);
        String[][] matriz = new String[20][5];

        System.out.println("A continuación deberá cargar " + matriz.length + " platos");

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Ingrese el nombre del plato: ");
            String plato = input.nextLine();
            matriz[i][0] = plato;
            System.out.println("Ingrese los ingredientes para el plato: " + plato);
            for (int j = 1; j < 5; j++) {
                String[] mensaje = {", restan ", ", resta "};
                if (5 - j == 1) {
                    System.out.print("Ingrediente " + j + mensaje[1] + (5 - j) + ": ");
                } else {
                    System.out.print("Ingrediente " + j + mensaje[0] + (5 - j) + ": ");
                }
                String ingredientes = input.nextLine();
                if (ingredientes.isEmpty()) {
                    matriz[i][j] = "Ninguno";
                } else {
                    matriz[i][j] = ingredientes;
                }
            }
        }
        for (String[] strings : matriz) {
            System.out.println("**************************");
            System.out.println(Arrays.toString(strings));
        }
    }
}
