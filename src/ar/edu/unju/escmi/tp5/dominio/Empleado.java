package ar.edu.unju.escmi.tp5.dominio;

public class Empleado {
    protected String nombre;
    protected String apellido;

    public Empleado(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
    return nombre;
}   

    public String getApellido() {
        return apellido;
    }

}

// =============================
// Encargado de Ventas
// =============================
class EncargadoVentas extends Empleado {

    public EncargadoVentas(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public void mostrarVentas() {
        // se implementará cuando haya collections
    }

    public double mostrarTotalVentas() {
        return 0.0;
    }

    public int verificarStock(int codProducto) {
        return 0;
    }

}


// =============================
// Agente Administrativo
// =============================
class AgenteAdministrativo extends Empleado {

    public AgenteAdministrativo(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public void altaProducto(Producto p) {
        // se implementará cuando haya collections
    }

    public void realizarVenta(Factura f) {
        // se implementará cuando haya collections
    }
}
