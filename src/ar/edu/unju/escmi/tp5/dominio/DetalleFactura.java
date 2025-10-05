package ar.edu.unju.escmi.tp5.dominio;

public class DetalleFactura {
    private int cantidad;
    private Producto producto;

    public DetalleFactura(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double calcularSubtotal() {
        return producto.precioConDescuento() * cantidad;
    }

    public Producto getProducto() { return producto; }
    public int getCantidad() { return cantidad; }

    @Override
    public String toString() {
        return cantidad + " x " + producto.getDescripcion() + " = $" + calcularSubtotal();
    }
}
