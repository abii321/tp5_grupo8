package ar.edu.unju.escmi.tp5.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.tp5.collections.CollectionProducto;

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
    public List<DetalleFactura> getDetalles() {
        return detalles;
    }
    public static int getNroFactura() {
        return nroFactura;
    }
    
    public static void setNroFactura(int nroFactura) {
        Factura.nroFactura = nroFactura;
    }

    public void agregarProducto(Producto p, int cantidad) {
        if (!CollectionProducto.comprobarStockVenta(cliente, p, cantidad)) {
            System.out.println("No hay suficiente stock para el producto");
            return;
        }
        DetalleFactura detalle = new DetalleFactura(cantidad,p,cliente);
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
        StringBuilder sb = new StringBuilder();
        sb.append("Factura Nº ").append(numero).append("\n");
        sb.append("Cliente: ").append(cliente.obtenerCodCliente()).append("\n");
        sb.append("Fecha: ").append(fecha).append("\n");
        sb.append("Total: $").append(String.format("%.2f", total)).append("\n");
        sb.append("Detalles:\n");

        for (DetalleFactura d : detalles) {
            sb.append("- ").append(d.getProducto().getDescripcion())
            .append(", cantidad: ").append(d.getCantidad())
            .append(", subtotal: $").append(String.format("%.2f", d.getSubtotal()))
            .append("\n");
        }
        return sb.toString();
    }
}
