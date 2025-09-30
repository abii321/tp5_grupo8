package ar.edu.unju.escmi.tp5.collections;

import java.util.ArrayList;
import ar.edu.unju.escmi.tp5.dominio.Cliente;

public class CollectionCliente {
    public static ArrayList<Cliente> clientes = new ArrayList<>();

    public static void agregar(Cliente c) {
        if (c != null) clientes.add(c);
    }

    // Búsqueda por nombre+apellido (ya que no todos tienen DNI/codCliente)
    public static Cliente buscarPorNombre(String nombre, String apellido) {
        for (Cliente c : clientes) {
            if (c != null 
                && c.getNombre().equalsIgnoreCase(nombre) 
                && c.getApellido().equalsIgnoreCase(apellido))
    {
    return c;
}
        }
        return null;
    }

    public static ArrayList<Cliente> listar() {
        return clientes;
    }

    public static boolean eliminar(String nombre, String apellido) {
        Cliente c = buscarPorNombre(nombre, apellido);
        return (c != null) && clientes.remove(c);
    }
}
