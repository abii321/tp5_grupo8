package ar.edu.unju.escmi.tp5.dominio;

import ar.edu.unju.escmi.tp5.collections.CollectionFactura;
import ar.edu.unju.escmi.tp5.collections.CollectionProducto;

public class AgenteAdministrativo extends Empleado {

    public AgenteAdministrativo(String usuarioEmpleado, String contrasena) {
        super(usuarioEmpleado, contrasena);
    }

    public static void altaProducto(Producto p){
        CollectionProducto.agregar(p);
        System.out.println("Producto agregado correctamente. Codigo asignado: "+p.getCodigo());
    }
    public static void realizarVenta(Factura factura){
        factura.calcularTotal();
        CollectionFactura.agregar(factura);
        System.out.println("Codigo de factura: "+factura.getNumero());
        System.out.println("Monto total de la compra: "+factura.getTotal());                 
    }
}
