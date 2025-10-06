package ar.edu.unju.escmi.tp5.collections;

import java.util.ArrayList;
import ar.edu.unju.escmi.tp5.dominio.Factura;

public class CollectionFactura {
    private static ArrayList<Factura> facturas = new ArrayList<>();
    
    public static void agregar(Factura factura) {
        if (factura != null && !facturas.contains(factura)) {
            facturas.add(factura);
        }
    }

    public static Factura buscar(int nroFactura) {
        for (Factura f : facturas) {
            if ( f.getNumero() == nroFactura) 
                return f;
        }
        return null;
    }

    public static int tamanio(){
        return facturas.size();
    }

    public static void listar(){
        for(int i=0; i<facturas.size(); i++){
            System.out.println(facturas.get(i).toString());
        }
    }

    public static double totalVentas() {
        double total = 0;
        for (Factura f : facturas) {
            if (f != null) 
                total += f.getTotal();
        }
        return total;
    }
}