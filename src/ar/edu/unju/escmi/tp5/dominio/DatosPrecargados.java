package ar.edu.unju.escmi.tp5.dominio;

import java.util.ArrayList;
import java.util.List;

public class DatosPrecargados {
    
    public static List<ClienteMinorista> clientesMinoristas = new ArrayList<>();
    public static List<ClienteMayorista> clientesMayoristas = new ArrayList<>();
    public static List<Empleado> empleados = new ArrayList<>();

    static {
        // Precarga de clientes minoristas
        clientesMinoristas.add(new ClienteMinorista("Pérez", "Juan", 3885123456L, 12345678, false));
        clientesMinoristas.add(new ClienteMinorista("López", "María", 3885234567L, 23456789, true));
        clientesMinoristas.add(new ClienteMinorista("García", "Carlos", 3885345678L, 34567890, false));
        clientesMinoristas.add(new ClienteMinorista("Martínez", "Ana", 3885456789L, 45678901, true));

        // Precarga de clientes mayoristas
        clientesMayoristas.add(new ClienteMayorista("Distribuidora", "Norte", 3885001111L, 1001));
        clientesMayoristas.add(new ClienteMayorista("Supermercado", "La Estrella", 3885002222L, 1002));
        clientesMayoristas.add(new ClienteMayorista("Mayorista", "Central", 3885003333L, 1003));

        // Precarga de empleados
        empleados.add(new EncargadoDeVentas("ventas1", "1234"));
        empleados.add(new EncargadoDeVentas("ventas2", "abcd"));
        empleados.add(new AgenteAdministrativo("admin1", "5678"));
        empleados.add(new AgenteAdministrativo("admin2", "efgh"));
    }

    public static List<ClienteMinorista> getClientesMinoristas() {
        return clientesMinoristas;
    }

    public static List<ClienteMayorista> getClientesMayoristas() {
        return clientesMayoristas;
    }

    public static List<Empleado> getEmpleados() {
        return empleados;
    }
}
