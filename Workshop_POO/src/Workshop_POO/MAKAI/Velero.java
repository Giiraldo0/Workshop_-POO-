package Workshop_POO.MAKAI;

public class Velero extends Embarcacion {

    private int cantidadMastiles;

    public Velero(Capitan capitan, int anioFabriocacion, double eslora, int cantidadMastiles) {
        super(capitan, anioFabriocacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    public boolean medirTamanio() {
        if (cantidadMastiles > 4) {
            System.out.println("El velero es grande.");
            return true;
        } else {
            if (cantidadMastiles > 0 && cantidadMastiles <= 4) {
                System.out.println("El velero es pequeño");
            } else if (cantidadMastiles <= 0) {
                System.out.println("El velero no existe");
            }

        }
        return false;
    }
    @Override
    protected void calcularAlquiler() {
        double precioBase = 345000;
        int anioFabriocacion = getAnioFabriocacion();
        double alquiler = precioBase;
        double valorAdicional = 20000.00;
        if (anioFabriocacion > 2020) {
            alquiler = precioBase + valorAdicional;
        }
        System.out.println("El precio del alquiler del velero es: " + alquiler);
    }
}



