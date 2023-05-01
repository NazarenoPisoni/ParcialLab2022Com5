package models;

public class Informatico extends Producto{

    private String marca;
    public Informatico() {
    }

    public Informatico(String numeroStock, String nombre, double precio, String marca) {
        super(numeroStock, nombre, precio);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
