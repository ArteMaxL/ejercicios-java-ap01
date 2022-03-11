import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class EjercicioArray04 {
    public static void main(String[] args) {
        //En un vector de 23 posiciones se tienen las temperaturas máximas de las capitales de las 23 provincias
        // argentinas en el último mes. A partir de esta información, un noticiero desea determinar el top 5 de las
        // temperaturas más altas para poder mostrar en la pantalla de su programa, para ello se necesita un programa
        // que sea capaz de recorrer el vector de temperaturas, determinar las 5 más altas y copiarlas en un nuev
        // o vector de 5 posiciones

        int temperaturas[] = {34, 29, 30, 34, 40, 25, 21, 52, 52, 41, 44, 51, 44, 32, 44, 35, 38, 42, 32, 47, 39, 37, 51};
        int[] cincoTempMax = new int[5]; //{1, 1, 1, 1, 1};
        int tempMax;

        //System.out.println(temperaturas.length);

        for (int i = 0; i < temperaturas.length; i++) {
            for (int j = 0; j < temperaturas.length; j++) {
                if (temperaturas[i] > temperaturas[j]) {
                    tempMax = temperaturas[i];
                    temperaturas[i] = temperaturas[j];
                    temperaturas[j] = tempMax;

                }
            }
        }
        for (int i = 0; i < cincoTempMax.length; i++) {
            cincoTempMax[i] = temperaturas[i];
        }

        System.out.println(Arrays.toString(cincoTempMax));
        System.out.println(Arrays.toString(temperaturas));
    }
}
