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

    public boolean tieneObraSocial(){
        return tienePAMI;
    }

    @Override
    public int getCodCliente() {
        return dni;
    }

}
