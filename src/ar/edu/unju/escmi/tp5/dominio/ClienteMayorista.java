package ar.edu.unju.escmi.tp5.dominio;

public class ClienteMayorista extends Cliente {
    private int codCliente;

    public ClienteMayorista(String apellido, String nombre, long telefono, String contrasenia, int codCliente) {
        super(apellido, nombre, telefono, contrasenia);
        this.codCliente = codCliente;
    }

    @Override
    public int getCodCliente() {
        return codCliente;
    }


    @Override
    public double calcularDesc(double total) {
        // Precio por mayor: se asume 50% del total
        return total / 2;
    }

}
