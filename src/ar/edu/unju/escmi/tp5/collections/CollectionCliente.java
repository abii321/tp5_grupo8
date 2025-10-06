package ar.edu.unju.escmi.tp5.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.tp5.dominio.Cliente;
import ar.edu.unju.escmi.tp5.dominio.ClienteMayorista;
import ar.edu.unju.escmi.tp5.dominio.ClienteMinorista;

public class CollectionCliente {
    public static List<Cliente> clientes = new ArrayList<>();

    // Precarga de clientes
    static {
        /*Cliente c1 = new ClienteMayorista(1, "1234", "Gomez", "Ana", 3885123456L);
        Cliente c2 = new Cliente(2, "5678", "Perez", "Juan", 3884234567L);
        Cliente c3 = new Cliente(3, "9012", "Lopez", "Maria", 3884345678L);*/
        

        Cliente c1 = new ClienteMayorista("Gomez", "Ana", 3885123456L, "1234", 1);
        Cliente c2 = new ClienteMayorista("Perez", "Juan", 3884234567L, "5678", 2);
        Cliente c3 = new ClienteMayorista("Lopez", "Maria", 3884345678L, "9012", 3);
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);

        Cliente c4 = new ClienteMinorista("Jimenez", "Stefania", 3884345679L, "2912", 24567897, true);
        Cliente c5 = new ClienteMinorista("Blanco", "Bianca", 3884345178L, "1111", 34567890, false);
        Cliente c6 = new ClienteMinorista("Mendoza", "Rodolfo", 3884342378L, "6381", 12345678, true);
        clientes.add(c4);
        clientes.add(c5);
        clientes.add(c6);
    }

    public static boolean autenticacion(int cod, String contrasenia){
        for(int i=0; i<clientes.size(); i++){
            if( clientes.get(i).getCodCliente()== cod && clientes.get(i).getContrasenia().equals(contrasenia) ) 
                return true;
        }
        return false;
    }


    /*public static Cliente buscar(int id) {
        for (Cliente c : clientes) {
            if (c != null && c.getIdentificador() == id) {
                return c;
            }
        }
        return null;
    }

    public static ArrayList<Cliente> listar() {
        return clientes;
    }

    public static Cliente buscarPorNombre(String nombre, String apellido) {
        for (Cliente c : clientes) {
            if (c != null 
                && c.getNombre().equalsIgnoreCase(nombre) 
                && c.getApellido().equalsIgnoreCase(apellido)) {
            return c;
        }
    }
    return null;
}*/

}