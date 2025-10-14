package ar.edu.unju.escmi.tp5.collections;

import java.util.List; 
import java.util.ArrayList;

import ar.edu.unju.escmi.tp5.dominio.ClienteMayorista;
import ar.edu.unju.escmi.tp5.dominio.Producto;
import ar.edu.unju.escmi.tp5.dominio.Cliente;

public class CollectionProducto {
    public static List<Producto> productos = new ArrayList<>();

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
    
    public static void verificarStock(int cod){
        Producto p=buscar(cod);
        if(p==null) System.out.println("El producto no existe");
        else if(p.getStock()>0) System.out.println("Stock actual: "+ p.getStock()); 
        else System.out.println("El producto no tiene stock");
    }

    public static boolean comprobarStockVenta(Cliente c, Producto p, int cantidad){
        if( c instanceof ClienteMayorista)
            return cantidad*10<=p.getStock();
        else 
            return cantidad<=p.getStock();
    }
}