package ar.edu.unju.escmi.tp5.collections;

import java.util.ArrayList;
import ar.edu.unju.escmi.tp5.dominio.Cliente;

public class CollectionCliente {
    public static ArrayList<Cliente> clientes = new ArrayList<>();

    public static void agregar(Cliente cliente) {
        if (cliente != null && !clientes.contains(cliente)) {
            clientes.add(cliente);
        }
    }

    public static Cliente buscar(int id) {
        for (Cliente c : clientes) {
            if (c != null && c.getIdentificador() == id) {
                return c;
            }
        }
        return null;
    }

    public static boolean eliminar(int id) {
        Cliente c = buscar(id);
        return c != null && clientes.remove(c);
    }

    public static ArrayList<Cliente> listar() {
        return clientes;
    }
}
