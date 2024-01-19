package Workshop_POO.Parqueadero;

public class Carro {
    private String placa;
    private String marca;
    private String modelo;

    public Carro(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void entradaParqueadero(){
        System.out.println("El carro con las placas " + getPlaca() + " ha ingresado al parqueadero.");
    }
    public void salidaParqueadero(){
        System.out.println("El carro con las placas " + getPlaca() + " ha salido del parqueadero.");
    }
}
