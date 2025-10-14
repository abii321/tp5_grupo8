package ar.edu.unju.escmi.tp5.dominio;

public class DetalleFactura {
    private int cantidad;
    private Producto producto;
    private double subtotal;

    public DetalleFactura(int cantidad, Producto producto, Cliente c) {
        this.cantidad = cantidad;
        this.producto = producto;
        this.subtotal = calcularSubtotal(c);
    }

    public double getSubtotal() {
        return subtotal;
    }
    public Producto getProducto() {
        return producto;
    }
    public int getCantidad(){
        return cantidad;
    }

    private double calcularSubtotal(Cliente c){
        if(c instanceof ClienteMayorista) 
            return this.producto.getPrecioUnit() * (cantidad * 10) / 2; 
        else
            return this.producto.getPrecioUnit() * cantidad;
    }
}
