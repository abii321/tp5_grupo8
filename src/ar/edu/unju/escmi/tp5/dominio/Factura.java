package ar.edu.unju.escmi.tp5.dominio;

import java.util.ArrayList;
import java.util.List;

public class Factura {
    private static int contador = 1;
    private int nroFactura;
    private Cliente cliente;
    private List<DetalleFactura> detalles;
    private double total;

    public Factura(Cliente cliente) {
        this.nroFactura = contador++;
        this.cliente = cliente;
        this.detalles = new ArrayList<>();
        this.total = 0.0;
    }

    public void agregarDetalle(Producto producto, int cantidad) {
        DetalleFactura detalle = new DetalleFactura(producto, cantidad);
        detalles.add(detalle);
        total += detalle.calcularImporte();
        producto.actualizarStock(cantidad); // importante: actualizar stock
    }

    public double calcularTotal() {
        return cliente.calcularDesc(total); // aplica descuento si corresponde
    }
}

// =============================
// Detalle de la Factura
// =============================
class DetalleFactura {
    private Producto producto;
    private int cantidad;
    private double precioUnit;
    private double importe;

    public DetalleFactura(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnit = producto.getPrecioParaCliente(false);
        this.importe = precioUnit * cantidad;
    }

    public double calcularImporte() {
        return importe;
    }
}
