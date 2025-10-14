package ar.edu.unju.escmi.tp5.dominio;

import ar.edu.unju.escmi.tp5.collections.CollectionFactura;

public abstract class Cliente {
    protected String apellido;
    protected String nombre;
    protected String direccion;
    protected String contrasenia;
    
    public Cliente(String apellido, String nombre, String direccion, String contrasenia) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
        this.contrasenia = contrasenia;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public static void buscarFactura(int nroFactura){
        Factura f = CollectionFactura.buscar(nroFactura);
        if( f !=null) System.out.println(f.toString());
        else System.out.println("Factura no encontrada");
    }
    
    public abstract int obtenerCodCliente();

}

