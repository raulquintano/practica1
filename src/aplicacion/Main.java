package aplicacion;

// Importar la clase Matematicas
import mates.Matematicas;

// Clase principal
public class Main {

    // Metodo principal
    public static void main(String[]args)
    {
        // Iteraciones para calcular el numero pi
        int iteraciones = 100000000;
        // Imprimir el numero pi
        System.out.println("El numero pi es "+ Matematicas.generarNumeroPiIterativo(iteraciones));
    }
}