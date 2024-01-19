package Workshop_POO.MAKAI;

public class Main {
    public static void main(String[] args) {
        //Creación de los objetos
        Capitan julian = new Capitan("Julian", "Giraldo", 12345);
        Velero velero =  new Velero(julian, 2006,633.00, 4);
        Yate yate = new Yate(julian, 2023, 986.74,16);
        Velero velero1 = new Velero(julian, 2024,756,7);
        Yate yate1 = new Yate(julian,2018,9877.4,6);

        //Ingreso de metodos
        julian.mostarInfoCapitan();
        System.out.println(" ");
        velero.calcularAlquiler();
        velero.medirTamanio();
        System.out.println(" ");
        velero1.calcularAlquiler();
        velero1.medirTamanio();
        System.out.println(" ");
        yate1.calcularAlquiler();
        yate1.lujoso();
        System.out.println(" ");
        yate.calcularAlquiler();
        yate.lujoso();
        yate.comprarYate();
    }
}