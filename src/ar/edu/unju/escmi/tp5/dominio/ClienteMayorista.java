package ar.edu.unju.escmi.tp5.dominio;

public class ClienteMayorista extends Cliente {
    int codCliente;

    public ClienteMayorista(String apellido, String nombre, long telefono, int codCliente) {
        super(apellido, nombre, telefono);
        this.codCliente = codCliente;
    }

    @Override
    public double calcularDesc(double total) {
        return total / 2; // compra mayorista
    }

    @Override
    public int getIdentificador() {
        return codCliente;
    }
}
