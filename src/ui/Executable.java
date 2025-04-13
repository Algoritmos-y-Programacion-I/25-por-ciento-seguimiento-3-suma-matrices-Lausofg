
package ui;

import java.util.Scanner;
import model.MatrizNumerica;

public class Executable {

    private Scanner escaner;

    //metodo Constructor
    public Executable() {
        escaner = new Scanner(System.in);
    }

    // Método principal que ayuda a ejecutar el  programa
    public void run() {
        System.out.println("Bienvenido al programa de suma de matrices\n");

        // aqui pedimos las  dimensiones de las matrices :D
        System.out.print("Ingrese el número de filas: ");
        int filas = escaner.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        int columnas = escaner.nextInt();

        // Se crea y llenamos la primera matriz
        System.out.println("\n--- Matriz 1 ---");
        MatrizNumerica matriz1 = leerMatriz(filas, columnas, "Matriz 1");

        // se hace lo mismo que en la primera matriz
        System.out.println("\n--- Matriz 2 ---");
        MatrizNumerica matriz2 = leerMatriz(filas, columnas, "Matriz 2");

        // siguiente paso se  suma las dos matrices
        MatrizNumerica suma = matriz1.sumar(matriz2);

        //  para finalizr esta parte Imprimimos nuestro  resultado
        System.out.println("\n--- Resultado de la suma ---");
        suma.imprimirMatriz();
    }

   
    private MatrizNumerica leerMatriz(int filas, int columnas, String nombre) {
        MatrizNumerica matriz = new MatrizNumerica(filas, columnas);
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(nombre + " [" + i + "][" + j + "]: ");
                int valor = escaner.nextInt();
                matriz.insertarValor(i, j, valor);
            }
        }
        return matriz;
    }

    // usamos el método main que inicia la ejecución de nuestro programa
    public static void main(String[] args) {
        Executable app = new Executable();
        app.run();
    }
}
