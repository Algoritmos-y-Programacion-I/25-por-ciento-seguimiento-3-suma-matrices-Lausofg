
package model;

public class MatrizNumerica {

    private int[][] matriz;
    private int cantFilas;
    private int cantColumnas;

    // metodo constructor
    public MatrizNumerica(int filas, int columnas) {
        cantFilas = filas;
        cantColumnas = columnas;
        this.matriz = new int[filas][columnas];
    }

    // 2  Método para poder  insertar un valor en una lugar  especifica 
    public void insertarValor(int i, int j, int valor) {
        matriz[i][j] = valor;
    }

    // aqui nos returna o devuelve a matriz 
    public int[][] getMatriz() {
        return matriz;
    }

    // aqui nos devuelve la cantidad de filas
    public int getCantFilas() {
        return cantFilas;
    }

    // nos devuelve nuestra cantidad de columnas
    public int getCantColumnas() {
        return cantColumnas;
    }

    // Sumamos las matrices que tengan el mismo tamaño
    public MatrizNumerica sumar(MatrizNumerica otra) {
        MatrizNumerica resultado = new MatrizNumerica(cantFilas, cantColumnas);

        for (int i = 0; i < cantFilas; i++) {
            for (int j = 0; j < cantColumnas; j++) {
                int suma = this.matriz[i][j] + otra.getMatriz()[i][j];
                resultado.insertarValor(i, j, suma);
            }
        }

        return resultado;
    }

    //por ultimo imprimimos la matriz en la  consola
    public void imprimirMatriz() {
        for (int i = 0; i < cantFilas; i++) {
            for (int j = 0; j < cantColumnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
