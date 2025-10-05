package ar.edu.unju.escmi.tp5.dominio;

public abstract class Empleado {
    String usuarioEmpleado;
    String contrasena;

    public Empleado(String usuarioEmpleado, String contrasena) {
        this.usuarioEmpleado = usuarioEmpleado;
        this.contrasena = contrasena;
    }

    public String getUsuarioEmpleado() { return usuarioEmpleado; }

    public String getContrasena() { return contrasena;}

    public abstract void mostrarMenu();
}
