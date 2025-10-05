package ar.edu.unju.escmi.tp5.dominio;

public class AgenteAdministrativo extends Empleado {

    public AgenteAdministrativo(String usuarioEmpleado, String contrasena) {
        super(usuarioEmpleado, contrasena);
    }

    public void altaProducto(Producto producto) {
        System.out.println("✅ Producto dado de alta: " + producto);
    }

    public void realizarVenta(Factura factura) {
        System.out.println("💰 Venta realizada:\n" + factura.mostrarFactura());
    }

    @Override
    public void mostrarMenu() {
        System.out.println("=== Menú Agente Administrativo ===");
        System.out.println("1. Alta de producto");
        System.out.println("2. Realizar venta");
    }
}
