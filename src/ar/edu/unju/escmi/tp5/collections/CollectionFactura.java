package ar.edu.unju.escmi.tp5.collections;


import java.util.ArrayList;
import ar.edu.unju.escmi.tp5.dominio.Factura;


public class CollectionFactura {
public static ArrayList<Factura> facturas = new ArrayList<>();


public static void agregar(Factura factura) {
if (factura != null && !facturas.contains(factura)) {
facturas.add(factura);
}
}


public static Factura buscar(int nroFactura) {
for (Factura f : facturas) {
if (f != null && f.getNroFactura() == nroFactura) {
return f;
}
}
return null;
}


public static ArrayList<Factura> listar() {
return facturas;
}


public static double mostrarTotalVentas() {
double total = 0;
for (Factura f : facturas) {
if (f != null) {
total += f.calcularTotal();
}
}
return total;
}
}