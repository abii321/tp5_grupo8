package ar.edu.unju.escmi.tp5.dominio;

public class Producto {
    private int codigo;
    private String descripcion;
    private double precioUnitario;
    private double descuento; // puede ser 0, 25 o 30
    private int stock;

    public Producto(int codigo, String descripcion, double precioUnitario, double descuento, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.descuento = descuento;
        this.stock = stock;
    }

    public int getCodigo() { return codigo; }
    public String getDescripcion() { return descripcion; }
    public double getPrecioUnitario() { return precioUnitario; }
    public double getDescuento() { return descuento; }
    public int getStock() { return stock; }

    public double getPrecioParaCliente(boolean esMayorista) {
        if (esMayorista) {
            return precioUnitario / 2; // precio al 50%
        } else {
            return precioUnitario - (precioUnitario * descuento / 100);
        }
    }

    public void actualizarStock(int cantidad) {
        stock -= cantidad;
    }


}
