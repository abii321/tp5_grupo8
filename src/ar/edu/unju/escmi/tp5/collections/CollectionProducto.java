package ar.edu.unju.escmi.tp5.collections;

import java.util.ArrayList;
import ar.edu.unju.escmi.tp5.dominio.Producto;

public class CollectionProducto {
    public static ArrayList<Producto> productos = new ArrayList<>();

    public static void agregar(Producto p) {
        if (p != null && buscar(p.getCodigo()) == null) {
            productos.add(p);
        }
    }

    public static Producto buscar(int codigo) {
        for (Producto p : productos) {
            if (p != null && p.getCodigo() == codigo) {
                return p;
            }
        }
        return null;
    }

    public static ArrayList<Producto> listar() {
        return productos;
    }

    public static boolean eliminar(int codigo) {
        Producto p = buscar(codigo);
        return (p != null) && productos.remove(p);
    }
}
