package ar.edu.unju.escmi.tp5.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Factura {
    private int nroFactura;
    private LocalDate fecha;
    private double total;
    private Cliente cliente;
    private List<DetalleFactura> detalles;

    public int getNroFactura() {
        return nroFactura;
    }

    /*public Factura(int nroFactura, Cliente cliente) {
        this.nroFactura = nroFactura;
        this.cliente = cliente;
        this.fecha = LocalDate.now();
        this.detalles = new ArrayList<>();
    }

    public void agregarDetalle(Producto producto, int cantidad) {
        if (producto.getStock() >= cantidad) {
            producto.actualizarStock(cantidad);
            detalles.add(new DetalleFactura(producto, cantidad));
        } else {
            System.out.println("❌ No hay suficiente stock de " + producto.getDescripcion());
        }
    }*/


    public double calcularTotal() {
        total = 0;
        for (DetalleFactura d : detalles) {
            total += d.calcularSubtotal();
        }
        total = cliente.calcularDesc(total);
        return total;
    }

    public String mostrar() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n🧾 FACTURA N° ").append(nroFactura)
          .append("\nFecha: ").append(fecha)
          .append("\nCliente: ").append(cliente.getNombre()).append(" ").append(cliente.getApellido())
          .append("\n----------------------------------\n");
        for (DetalleFactura d : detalles) {
            sb.append(d.toString()).append("\n");
        }
        sb.append("----------------------------------\nTOTAL: $").append(calcularTotal());
        return sb.toString();
    }

    /*public int getNroFactura() { return nroFactura; }
    public Cliente getCliente() { return cliente; }
    public double getTotal() { return total; }*/
}
