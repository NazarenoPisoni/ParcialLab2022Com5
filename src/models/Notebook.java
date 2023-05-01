package models;

public class Notebook extends Informatico{
    private String memoria;

    public Notebook() {
    }

    public Notebook(String numeroStock, String nombre, double precio, String marca, String memoria) {
        super(numeroStock, nombre, precio, marca);
        this.memoria = memoria;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Notebook {" +
                "Nombre = " + getNombre() +
                ", Precio = " + getPrecio() +
                ", Número de Stock = " + getNumeroStock() +
                ", Marca = " + getMarca() +
                ", Memoria = " + getMemoria() +
                '}';
    }
}
