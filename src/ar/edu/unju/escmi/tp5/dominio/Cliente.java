package ar.edu.unju.escmi.tp5.dominio;

public abstract class Cliente {
    private String apellido;
    private String nombre;
    private String direccion;
    private String contrasenia;
    
    public Cliente(String apellido, String nombre, String direccion, String contrasenia) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
        this.contrasenia = contrasenia;
    }

    public abstract int getCodCliente();

    public String getContrasenia() {
        return contrasenia;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract boolean tieneObraSocial();
    public abstract double calcularSubtotal(Producto p, int cantidad);
    public abstract boolean comprobarStock(Producto p, int cantidad);
}

