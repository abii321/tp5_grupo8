package ar.edu.unju.escmi.tp5.dominio;

public class ClienteMinorista extends Cliente {
    private int dni; 
    private boolean tienePAMI;

    public ClienteMinorista(String apellido, String nombre, String direccion, String contrasenia, int dni,
            boolean tienePAMI) {
        super(apellido, nombre, direccion, contrasenia);
        this.dni = dni;
        this.tienePAMI = tienePAMI;
    }

    public boolean isTienePAMI() {
        return tienePAMI;
    }
    public int getDni(){
        return dni;
    }

    @Override
    public int obtenerCodCliente() {
        return dni;
    }
}
