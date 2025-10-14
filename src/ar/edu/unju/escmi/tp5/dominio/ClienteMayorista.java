package ar.edu.unju.escmi.tp5.dominio;

public class ClienteMayorista extends Cliente {
    private int codCliente;

    public ClienteMayorista(String apellido, String nombre, String direccion, String contrasenia, int codCliente) {
        super(apellido, nombre, direccion, contrasenia);
        this.codCliente = codCliente;
    }

    @Override
    public int obtenerCodCliente() {
        return codCliente;
    }
}
