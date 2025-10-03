package ar.edu.unju.escmi.tp5.dominio;

import java.util.ArrayList;
import java.util.List;

public class Factura {
    int nroFactura;
    String fecha;
    double total;
    Cliente cliente;
    List<DetalleFactura> detalles = new ArrayList<>();

    public Factura(int nroFactura, String fecha, Cliente cliente) {
        this.nroFactura = nroFactura;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public double calcularTotal() {
        total = 0;
        for (DetalleFactura d : detalles) {
            total += d.getImporte();
        }
        return cliente.calcularDesc(total);
    }

    public void agregarDetalle(Producto producto, int cantidad) {
        detalles.add(new DetalleFactura(producto, cantidad));
    }

    public int getNroFactura() { return nroFactura; }

}
