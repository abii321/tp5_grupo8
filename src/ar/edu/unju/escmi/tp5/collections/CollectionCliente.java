package ar.edu.unju.escmi.tp5.collections;


import java.util.ArrayList;
import ar.edu.unju.escmi.tp5.dominio.Cliente;


public class CollectionCliente {
public static ArrayList<Cliente> clientes = new ArrayList<>();


public static Cliente buscar(int id) {
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
}