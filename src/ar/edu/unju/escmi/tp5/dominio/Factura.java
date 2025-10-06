package ar.edu.unju.escmi.tp5.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Factura {
    private static int nroFactura = 0; 
    private int numero;
    private int cliente;
    private LocalDate fecha;
    private double total;
    private List<DetalleFactura> detalles;

    public Factura() {
        nroFactura++;
        this.numero=nroFactura;
        this.detalles = new ArrayList<>();
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public void setCliente(int cliente) {
        this.cliente = cliente;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public void setDetalles(List<DetalleFactura> detalles) {
        this.detalles = detalles;
    }
    
    public int getNumero() {
        return numero;
    }
    public List<DetalleFactura> getDetalles() {
        return detalles;
    }
    public double getTotal() {
        return total;
    }
    
    @Override
    public String toString() {
        return "Factura [numero=" + numero + ", cliente=" + cliente + ", fecha=" + fecha + ", total=" + total + "]";
    }
}
