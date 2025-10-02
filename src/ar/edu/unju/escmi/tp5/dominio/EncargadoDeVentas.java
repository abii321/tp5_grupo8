package ar.edu.unju.escmi.tp5.dominio;

public class EncargadoDeVentas extends Empleado {

    public EncargadoDeVentas(String usuarioEmpleado, String contrasena) {
        super(usuarioEmpleado, contrasena);
    }

    public void mostrarVentas() {}
    public double mostrarTotalVentas() { return 0; }
    public int verificarStock(int codProducto) { return 0; }

    public void mostrarMenu() {
        System.out.println("1. Mostrar ventas");
        System.out.println("2. Mostrar total de ventas");
        System.out.println("3. Verificar stock de producto");
    }
}
