package ar.edu.unju.escmi.tp5.dominio;

public abstract class Empleado {
    protected String nombre;
    protected String contrasenia;

    public Empleado(String nombre, String contrasenia) {
        this.nombre = nombre;
        this.contrasenia = contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }
    

    /*public boolean tieneAccesoEmpleado() { return true; }
    public boolean tieneAccesoCliente() { return false; }

    public abstract void mostrarMenu();

    public String getUsuarioEmpleado() { return usuarioEmpleado; }*/
}
