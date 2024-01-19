package Workshop_POO.MAKAI;

public abstract class Embarcacion {
    private Capitan capitan;
    private double precioBase;
    private double valorAdicional;
    private int anioFabriocacion;
    private double eslora;

    public Embarcacion(Capitan capitan, int anioFabriocacion, double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabriocacion = anioFabriocacion;
        this.eslora = eslora;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public int getAnioFabriocacion() {
        return anioFabriocacion;
    }

    protected abstract void calcularAlquiler();
}
