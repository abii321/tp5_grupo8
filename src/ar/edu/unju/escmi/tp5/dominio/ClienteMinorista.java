package ar.edu.unju.escmi.tp5.dominio;

public class ClienteMinorista extends Cliente {
    private int dni;
    private boolean tienePAMI;

    public ClienteMinorista(String apellido, String nombre, long telefono, int dni, boolean tienePAMI) {
        super(apellido, nombre, telefono);
        this.dni = dni;
        this.tienePAMI = tienePAMI;
    }

    @Override
    public double calcularDesc(double total) {
        if (tienePAMI) {
            return total * 0.9; // 10% descuento
        }
        return total;
    }

    public int getDni() { return dni; }
    public boolean isTienePAMI() { return tienePAMI; }
}
