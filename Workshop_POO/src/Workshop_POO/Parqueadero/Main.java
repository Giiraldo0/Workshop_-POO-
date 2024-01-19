import Workshop_POO.Parqueadero.Carro;
import Workshop_POO.Parqueadero.Parqueadero;

public class Main {
    public static void main(String[] args) {

        //Creación del parqueadero
        Parqueadero parqueadero = new Parqueadero(3200.00);

        //Creación de los carros
        Carro carro1 = new Carro("JDG123","Dodge", "Raptor");
        Carro carro2 = new Carro("QWE456", "Renault", "Sandero");
        Carro carro3 = new Carro("RTY789", "Toyota", "Corolla");
        Carro carro4 = new Carro("FYF010", "Dodge", "Charger");
        Carro carro5 = new Carro("ASD741", "Honda", "Civic");

        //Ingreso de métodos
        System.out.println("****************\n" +
                "Entrada de vehiculos\n" +
                "------------");
        carro1.entradaParqueadero();
        carro2.entradaParqueadero();
        carro4.entradaParqueadero();
        carro3.entradaParqueadero();
        carro5.entradaParqueadero();
        System.out.println("****************\n" +
                "Rellenar espacios del parqueadero\n" +
                "------------");
        parqueadero.parquearCarro(carro1, 0, 0);
        parqueadero.parquearCarro(carro2, 0,1);
        parqueadero.parquearCarro(carro4,3,6);
        parqueadero.parquearCarro(carro3,0,0);
        parqueadero.parquearCarro(carro5,2,3);
        System.out.println("****************\n" +
                "Salida y cobro de tarifa\n" +
                "------------");
        parqueadero.tiempoEstacionado(carro3, 0);
        parqueadero.cobrarTiempo(carro3,0);
        carro3.salidaParqueadero();
        System.out.println("------------");
        parqueadero.tiempoEstacionado(carro1,3);
        parqueadero.cobrarTiempo(carro1,3);
        carro1.salidaParqueadero();
        System.out.println("****************\n" +
                "El estado actual del parqueadero es\n" +
                "[X] = Ocupado  **  [  ] = Vacío\n" +
                "------------");
        parqueadero.mostrarEstadoParqueadero();
    }
}