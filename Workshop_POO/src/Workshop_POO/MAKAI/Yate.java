package Workshop_POO.MAKAI;

public class Yate extends Embarcacion {

    private int cantCamarotes;

    public Yate(Capitan capitan, int anioFabriocacion, double eslora, int cantCamarotes) {
        super(capitan, anioFabriocacion, eslora);
        this.cantCamarotes = cantCamarotes;
    }

    public boolean lujoso() {
        if (cantCamarotes > 7) {
            System.out.println("El yate es lujoso");
            return true;
        } else {
            System.out.println("El yate no es lujoso");
            return false;
        }
    }

    public void comprarYate() {
        System.out.println("Yate comprado con éxito.");
    }

    @Override
    protected void calcularAlquiler() {
        double precioBase = 863000;
        int anioFabriocacion = getAnioFabriocacion();
        double alquiler = precioBase;
        double valorAdicional = 20000.00;
        if (anioFabriocacion > 2020) {
            alquiler = precioBase + valorAdicional;
        }
        System.out.println("El precio del alquiler del yate es: " + alquiler);
    }
}
