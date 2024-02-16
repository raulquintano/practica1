package aplicacion;

import mates.Matematicas;

public class Main {

    public static void main(String[]args)
    {
        int iteraciones = 100000000;
        System.out.println("El numero pi es "+ Matematicas.generarNumeroPiIterativo(iteraciones));
    }
}