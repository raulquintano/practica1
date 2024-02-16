package mates;

import java.util.Random;

// Clase para realizar operaciones matematicas
public class Matematicas
{
    // Metodo para generar el numero pi de manera iterativa
    public static double generarNumeroPiIterativo(long pasos)
    {

        int dentroCirculo = 0;
        long puntos = pasos;

        // Generar numeros aleatorios
        Random random = new Random();

        // Iterar para calcular el numero pi
        for (int i = 0; i < pasos; i++) 
        {
            double x = random.nextDouble();
            double y = random.nextDouble();

            double distanciaAlCentro = x * x + y * y;

            // Verificar si el punto esta dentro del circulo
            if (distanciaAlCentro <= 1) 
            {
                dentroCirculo++;
            }
        }

        // Retornar el numero pi
        return (4.0 * dentroCirculo) / puntos;
    }
}