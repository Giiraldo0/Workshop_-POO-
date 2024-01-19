package Workshop_POO.Parqueadero;

public class Parqueadero {
    private int filas = 5;
    private int columnas = 10;
    private Carro[][] matrizParqueadero;
    private double tarifaHora;
    private int horasEstacionado;

    public Parqueadero(double tarifaHora) {
        this.tarifaHora = tarifaHora;
        this.matrizParqueadero = new Carro[filas][columnas];
    }

    public boolean parquearCarro(Carro carro, int fila, int columna) {
        if (fila < 0 || fila >= filas || columna < 0 || columna >= columnas || matrizParqueadero[fila][columna] != null){
            System.out.println("No se puede estacionar el vehiculo.");
            return false;
        }
        matrizParqueadero[fila][columna] = carro;
        System.out.println("El vehiculo se ha estacionado exitosamente en la zelda: [" +fila + "," + columna + "].");
        return true;
    }

    public void cobrarTiempo(Carro carro, int horas){
        double cobrar;
        cobrar = horas * tarifaHora;
        System.out.println("El valor a pagar por el tiempo es: $" + cobrar );
    }
    public void mostrarEstadoParqueadero(){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matrizParqueadero[i][j] != null) {
                    System.out.print("[X] ");
                } else {
                    System.out.print("[ ] ");
                }
            }
            System.out.println();
        }
    }
    public int getHorasEstacionado() {
        return horasEstacionado;
    }
    public void tiempoEstacionado(Carro carro, int horasEstacionado){
        System.out.println("El carro ha estado estacionado " + horasEstacionado + " horas");
    }
}
