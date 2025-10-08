package ar.edu.unju.escmi.tp5.dominio;
import ar.edu.unju.escmi.tp5.collections.CollectionFactura;
import ar.edu.unju.escmi.tp5.collections.CollectionProducto;

public class EncargadoDeVentas extends Empleado {
    
    public EncargadoDeVentas(String usuarioEmpleado, String contrasena) {
        super(usuarioEmpleado, contrasena);
    }

    public static void mostrarVentas(){
        CollectionFactura.mostrar();
    }
    public static void mostrarTotalVentas(){
        System.out.println( "Total de todas las ventas: "+CollectionFactura.totalVentas() );
    }
    public static void stockActual(int cod){
        CollectionProducto.verificarStock(cod); 
    }
}
