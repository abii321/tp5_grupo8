package ar.edu.unju.escmi.tp5.dominio;

public class EncargadoDeVentas extends Empleado {
    
    public EncargadoDeVentas(String usuarioEmpleado, String contrasena) {
        super(usuarioEmpleado, contrasena);
    }

    /*public void mostrarVentas(List<Factura> facturas) {
        System.out.println("📋 Listado de ventas:");
        for (Factura f : facturas) {
            System.out.println(f.mostrarFactura());
        }
    }

    public double mostrarTotalVentas(List<Factura> facturas) {
        double total = 0;
        for (Factura f : facturas) {
            total += f.getTotal();
        }
        System.out.println("💲 Total de ventas: $" + total);
        return total;
    }

    public void verificarStock(Producto producto) {
        System.out.println("📦 Stock de " + producto.getDescripcion() + ": " + producto.getStock());
    }

    @Override
    public void mostrarMenu() {
        System.out.println("=== Menú Encargado de Ventas ===");
        System.out.println("1. Mostrar ventas");
        System.out.println("2. Mostrar total de ventas");
        System.out.println("3. Verificar stock");
    }*/
}
