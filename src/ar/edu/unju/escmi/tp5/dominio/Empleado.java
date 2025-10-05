package ar.edu.unju.escmi.tp5.dominio;

public abstract class Empleado {
    protected String usuarioEmpleado;
    protected String contrasena;

    public Empleado(String usuarioEmpleado, String contrasena) {
        this.usuarioEmpleado = usuarioEmpleado;
        this.contrasena = contrasena;
    }

    public boolean autenticar(String usuario, String pass) {
        return usuarioEmpleado.equals(usuario) && contrasena.equals(pass);
    }

    public boolean tieneAccesoEmpleado() { return true; }
    public boolean tieneAccesoCliente() { return false; }

    public abstract void mostrarMenu();

    public String getUsuarioEmpleado() { return usuarioEmpleado; }
}
