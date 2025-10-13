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
            if ( f.getNumero() == nroFactura) 
                return f;
        }
        return null;
    }
    public static double totalVentas() {
        double total = 0;
        for (Factura f : facturas) {
            if (f != null) 
                total += f.getTotal();
        }
        return total;
    }

    public static void mostrar(){
        if(facturas.isEmpty()) System.out.println("No hay ninguna factura");
        else CollectionFactura.listar();
    }

    private static void listar(){
        for(int i=0; i<facturas.size(); i++){
            System.out.println(facturas.get(i).toString());
        }
    }
}