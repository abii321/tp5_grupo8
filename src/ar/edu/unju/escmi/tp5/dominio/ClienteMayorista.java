package ar.edu.unju.escmi.tp5.dominio;

public class ClienteMayorista extends Cliente {
    private int codCliente;

    public ClienteMayorista(String apellido, String nombre, String direccion, String contrasenia, int codCliente) {
        super(apellido, nombre, direccion, contrasenia);
        this.codCliente = codCliente;
    }

    @Override
    public int getCodCliente() {
        return codCliente;
    }
    public double calcularSubtotal(Producto p, int cantidad) {
        return p.getPrecioUnit() * (cantidad * 10) / 2; 
    }
    public boolean comprobarStock(Producto p, int cantidad){
        return cantidad*10<=p.getStock();
    }
}
