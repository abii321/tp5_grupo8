package ar.edu.unju.escmi.tp5.collections;

import java.util.List; 
import java.util.ArrayList;
import ar.edu.unju.escmi.tp5.dominio.Producto;

public class CollectionProducto {
    private static List<Producto> productos = new ArrayList<>();

    public static Producto buscar(int codProducto) {
        for (Producto p : productos) {
            if (p != null && p.getCodigo() == codProducto) 
                return p;
        }
        return null;
    }

    public static void agregar(Producto p){
        productos.add(p);
    }

}