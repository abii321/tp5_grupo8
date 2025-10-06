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
            if (f != null && f.getNroFactura() == nroFactura) 
                return f;
        }
        return null;
    }

    public static void listar(){
        for(int i=0; i<facturas.size(); i++){
            facturas.get(i).mostrar();
        }
    }

    public static double totalVentas() {
        double total = 0;
        for (Factura f : facturas) {
            if (f != null) {
                total += f.calcularTotal();
            }
        }
        return total;
    }
}