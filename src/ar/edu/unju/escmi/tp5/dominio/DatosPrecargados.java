package ar.edu.unju.escmi.tp5.dominio;

import java.util.ArrayList;
import java.util.List;

public class DatosPrecargados {

    public static List<Cliente> clientes = new ArrayList<>();

    static {
        // Clientes minoristas
        clientes.add(new ClienteMinorista("Pérez", "Juan", 3885123456L, 12345678, false));
        clientes.add(new ClienteMinorista("López", "María", 3885234567L, 23456789, true));
        clientes.add(new ClienteMinorista("García", "Carlos", 3885345678L, 34567890, false));
        clientes.add(new ClienteMinorista("Martínez", "Ana", 3885456789L, 45678901, true));

        // Clientes mayoristas
        clientes.add(new ClienteMayorista("Distribuidora", "Norte", 3885001111L, 1001));
        clientes.add(new ClienteMayorista("Supermercado", "La Estrella", 3885002222L, 1002));
        clientes.add(new ClienteMayorista("Mayorista", "Central", 3885003333L, 1003));
    }

    public static List<Cliente> getClientes() {
        return clientes;
    }

    public static Cliente buscarCliente(String nombre, String apellido) {
        for (Cliente c : clientes) {
            if (c.getNombre().equalsIgnoreCase(nombre) && c.getApellido().equalsIgnoreCase(apellido)) {
                return c;
            }
        }
        return null;
    }
}
