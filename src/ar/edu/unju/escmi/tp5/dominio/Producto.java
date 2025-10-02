package ar.edu.unju.escmi.tp5.dominio;

public class Producto {
    int codProducto;
    String enDetalle;
    double precioUnit;
    double descuento; // 0, 0.25 o 0.30
    int stock;

    public Producto(int codProducto, String enDetalle, double precioUnit, double descuento, int stock) {
        this.codProducto = codProducto;
        this.enDetalle = enDetalle;
        this.precioUnit = precioUnit;
        this.descuento = descuento;
        this.stock = stock;
    }

    public double precioConDescuento() {
        return precioUnit - (precioUnit * descuento);
    }

    public void actualizarStock(int cantidad) {
        stock -= cantidad;
    }


}
