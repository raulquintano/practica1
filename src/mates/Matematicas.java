package mates;

import java.util.Random;

public class Matematicas
{
    public static double generarNumeroPiIterativo(long pasos)
    {
        int dentroCirculo = 0;
        long puntos = pasos;

        Random random = new Random();

        for (int i = 0; i < pasos; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();

            double distanciaAlCentro = x * x + y * y;

            if (distanciaAlCentro <= 1) {
                dentroCirculo++;
            }
        }

        return (4.0 * dentroCirculo) / puntos;
    }
}