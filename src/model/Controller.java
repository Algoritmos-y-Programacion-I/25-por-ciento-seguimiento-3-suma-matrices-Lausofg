package model;

import model.SalaCine;
import model.MatrizNumerica;


public class Controller {
 //aqui se  declara la  sala de cine
    private SalaCine cinemark; 
    private MatrizNumerica matriz1;
    private MatrizNumerica matriz2;

   
    public Controller() {
        matriz1 = new MatrizNumerica(2,2);
        matriz2 = new MatrizNumerica(2,2);
    }

    public void inicialiceSala() {
        cinemark = new SalaCine(7,7);
    }

    public String mostrarSala() {
        return cinemark.toString();
    }

    public void comprarSilla(int fila, int asientoEnFila) {
        cinemark.reservarAsiento(fila, asientoEnFila);
    }

    public int cantidadFilas() {
        return cinemark.retornarCantFilas();
    }

    public int cantidadColumnas() {
        return cinemark.retornarCantColumnas();
    }

    public MatrizNumerica getMatriz1() {
        return matriz1;
    }

    public MatrizNumerica getMatriz2() {
        return matriz2;
    }




}
