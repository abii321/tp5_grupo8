package ar.edu.unju.escmi.tp5.dominio;

public class DetalleFactura {
    private int cantidad;
    private Producto producto;
    private double subtotal;

    public DetalleFactura() {
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    public double getSubtotal() {
        return subtotal;
    }
    
}
