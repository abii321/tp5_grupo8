package ar.edu.unju.escmi.tp5.dominio;

public class Producto {
    private int codProducto;
    private String descripcion;
    private double precioUnit;
    private int descuento; // 0, 25 o 30
    private int stock;

    public Producto(int codProducto, String descripcion, double precioUnit, int descuento, int stock) {
        this.codProducto = codProducto;
        this.descripcion = descripcion;
        this.precioUnit = precioUnit;
        this.descuento = descuento;
        this.stock = stock;
    }

    public double precioConDescuento() {
        if (descuento == 0) return precioUnit;
        return precioUnit - (precioUnit * descuento / 100);
    }

    public void actualizarStock(int cantidadVendida) {
        if (cantidadVendida > 0 && cantidadVendida <= stock) {
            stock -= cantidadVendida;
        } else {
            System.out.println("⚠️ Stock insuficiente o cantidad inválida.");
        }
    }

    // Getters y Setters
    public int getCodProducto() { return codProducto; }
    public String getDescripcion() { return descripcion; }
    public double getPrecioUnit() { return precioUnit; }
    public int getDescuento() { return descuento; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    @Override
    public String toString() {
        return "[" + codProducto + "] " + descripcion + " - $" + precioUnit + " (Stock: " + stock + ")";
    }
}
