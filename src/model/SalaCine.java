package model;

public class SalaCine {
    private boolean[][] asientos;

    public SalaCine(int filas, int asientosPorFila) {
        this.asientos = new boolean[filas][asientosPorFila]; 
        poblarSala();
    }

    private void poblarSala() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                asientos[i][j] = false;
            }
        }
    }

    public String reservarAsiento(int fila, int asiento) {
        if(!asientos[fila][asiento]) {
            asientos[fila][asiento] = true;
            return "el asiento ha sido reservado exitosamente :D";
        } else {
            return "lo sentimos este haciento ya está reservado, no se puede ocupar :( ";
        }
    }

    public boolean verificarDisponibilidad(int fila, int asiento) {
        return !asientos[fila][asiento];
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                result += asientos[i][j] ? "[X]" : "[ ]";
            }
            result += "\n";
        }
        return result;
    }

    public int retornarCantFilas() {
        return asientos.length;
    }

    public int retornarCantColumnas() {
        return asientos[0].length;
    }
}
