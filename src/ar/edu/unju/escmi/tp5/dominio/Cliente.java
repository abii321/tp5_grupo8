package ar.edu.unju.escmi.tp5.dominio;

public abstract class Cliente {
    String apellido;
    String nombre;
    long telefono;

    public Cliente(String apellido, String nombre, long telefono) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public abstract double calcularDesc(double total);

    public abstract int getIdentificador();

    public Factura obtenerFactura(int nro) {
        return null; // se implementa luego
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}



