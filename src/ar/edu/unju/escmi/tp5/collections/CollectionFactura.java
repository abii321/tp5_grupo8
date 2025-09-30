package ar.edu.unju.escmi.tp5.collections;

import java.util.ArrayList;
import ar.edu.unju.escmi.tp5.dominio.Factura;

public class CollectionFactura {
    public static ArrayList<Factura> facturas = new ArrayList<>();

    public static void agregar(Factura f) {
        if (f != null) facturas.add(f);
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

    public static boolean eliminar(int nroFactura) {
        Factura f = buscar(nroFactura);
        return (f != null) && facturas.remove(f);
    }

    public static double totalVentas() {
        double total = 0;
        for (Factura f : facturas) {
            if (f != null) total += f.calcularTotal();
        }
        return total;
    }
}
