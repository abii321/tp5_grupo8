package ar.edu.unju.escmi.tp5.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.tp5.dominio.Cliente;
import ar.edu.unju.escmi.tp5.dominio.ClienteMayorista;
import ar.edu.unju.escmi.tp5.dominio.ClienteMinorista;

public class CollectionCliente {
    public static List<Cliente> clientes = new ArrayList<>();

    public static boolean autenticacion(int cod, String contrasenia){
        for(int i=0; i<clientes.size(); i++){
            if( clientes.get(i).obtenerCodCliente()== cod && clientes.get(i).getContrasenia().equals(contrasenia) ) 
                return true;
        }
        return false;
    }

    public static Cliente buscarCliente(int cod){
        for(int i=0; i<clientes.size(); i++){
            if(clientes.get(i).obtenerCodCliente() == cod ) return clientes.get(i);
        }
        return null;
    }
    
    public static void precargarClientes(){
        Cliente c1 = new ClienteMayorista("Gomez", "Ana", "Avenida Exodo", "1234", 1);
        Cliente c2 = new ClienteMayorista("Perez", "Juan", "Avenida Centenario", "5678", 2);
        Cliente c3 = new ClienteMayorista("Lopez", "Maria", "Pasaje de Arrayan", "9012", 3);
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);

        Cliente c4 = new ClienteMinorista("Jimenez", "Stefania", "Calle Belgrano", "2912", 24567897, true);
        Cliente c5 = new ClienteMinorista("Blanco", "Bianca", "Calle Rivadavia", "1111", 34567890, false);
        Cliente c6 = new ClienteMinorista("Mendoza", "Rodolfo", "Calle Sarmiento", "6381", 12345678, true);
        clientes.add(c4);
        clientes.add(c5);
        clientes.add(c6);
    }

}