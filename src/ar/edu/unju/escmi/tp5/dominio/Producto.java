package ar.edu.unju.escmi.tp5.dominio;

public class Producto {
    private static int nroProducto = 0; 
    private int codigo;
    private String descripcion;
    private double precioUnit;
    private int descuento; // 0, 25 o 30
    private int stock;

    public Producto() {
        nroProducto++;
        this.codigo=nroProducto;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setPrecioUnit(double precioUnit) {
        this.precioUnit = precioUnit;
    }
    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    public int getCodigo() { return codigo; }
    public String getDescripcion() { return descripcion; }
    public double getPrecioUnit() { return precioUnit; }
    public int getDescuento() { return descuento; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    @Override
    public String toString() {
        return "[" + codigo + "] " + descripcion + " - $" + precioUnit + " (Stock: " + stock + ")";
    }
}
