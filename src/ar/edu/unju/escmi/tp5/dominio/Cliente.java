package ar.edu.unju.escmi.tp5.dominio;

public abstract class Cliente {
    protected String apellido;
    protected String nombre;
    protected long telefono;

    public Cliente(String apellido, String nombre, long telefono) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public abstract double calcularDesc(double total);

    public boolean tieneAccesoCliente() { return true; }
    public boolean tieneAccesoEmpleado() { return false; }

    // Simulación de autenticación básica
    public boolean autenticar(String nombre, String apellido) {
        return this.nombre.equalsIgnoreCase(nombre) && this.apellido.equalsIgnoreCase(apellido);
    }

    // Getters
    public String getApellido() { return apellido; }
    public String getNombre() { return nombre; }
    public long getTelefono() { return telefono; }
}
