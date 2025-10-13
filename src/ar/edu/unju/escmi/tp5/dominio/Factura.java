package ar.edu.unju.escmi.tp5.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Factura {
    private static int nroFactura = 0; 
    private int numero;
    private Cliente cliente;
    private LocalDate fecha;
    private double total;
    private List<DetalleFactura> detalles;

    public Factura(Cliente cliente) {
        nroFactura++;
        this.numero=nroFactura;
        this.cliente = cliente;
        this.fecha = LocalDate.now();
        this.detalles = new ArrayList<>();
    }
    public int getNumero() {
        return numero;
    }
    public double getTotal() {
        return total;
    }

    public void agregarProducto(Producto p, int cantidad) {
        if (!cliente.comprobarStock(p, cantidad)) {
            System.out.println("No hay suficiente stock para el producto");
            return;
        }
        double subtotal = cliente.calcularSubtotal(p, cantidad);
        DetalleFactura detalle = new DetalleFactura();
        detalle.setProducto(p);
        detalle.setCantidad(cantidad);
        detalle.setSubtotal(subtotal);
        detalles.add(detalle);

        if (cliente instanceof ClienteMayorista)
            p.setStock(p.getStock() - cantidad * 10);
        else
            p.setStock(p.getStock() - cantidad);
    }

    public void calcularTotal() {
        double totalSinDescuento = 0;
        double descuentoProductos = 0;

        // total sin descuento
        for (DetalleFactura d : detalles) {
            totalSinDescuento += d.getSubtotal();
        }

        // descuento del producto 
        for (DetalleFactura d : detalles) {
            Producto p = d.getProducto();
            if (p.getDescuento() > 0)
                descuentoProductos += d.getSubtotal() * (p.getDescuento() / 100.0);
        }

        double totalConDescuento = totalSinDescuento - descuentoProductos;
        // descuento por obra social
        if ( cliente instanceof ClienteMinorista && ((ClienteMinorista)cliente).isTienePAMI())
            totalConDescuento -= totalConDescuento * 0.10;

        this.total = totalConDescuento;
    }
    @Override
    public String toString() {
        return "Factura [numero=" + numero + ", cliente=" + cliente.getCodCliente() + ", fecha=" + fecha + ", total=" + total + "]";
    }
}
