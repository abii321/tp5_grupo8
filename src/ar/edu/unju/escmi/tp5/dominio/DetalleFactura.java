package ar.edu.unju.escmi.tp5.dominio;

public class DetalleFactura {
    int cantidad;
    Producto producto;

    public DetalleFactura(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double getImporte() {
        return cantidad * producto.precioConDescuento();
    }
}
