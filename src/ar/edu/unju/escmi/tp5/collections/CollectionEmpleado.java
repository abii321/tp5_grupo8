package ar.edu.unju.escmi.tp5.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.tp5.dominio.AgenteAdministrativo;
import ar.edu.unju.escmi.tp5.dominio.Empleado;
import ar.edu.unju.escmi.tp5.dominio.EncargadoDeVentas;

public class CollectionEmpleado {
    public static List<Empleado> empleados = new ArrayList<>();

    // Precarga de empleados
    static {
        Empleado e1 = new EncargadoDeVentas("Enzo", "1234");
        Empleado e2 = new EncargadoDeVentas("Gonzalo", "3487");
        Empleado e3 = new EncargadoDeVentas("Marcelo", "3958");
        empleados.add(e1);
        empleados.add(e2);
        empleados.add(e3);
        
        Empleado e4 = new AgenteAdministrativo("Franco", "3498");
        Empleado e5 = new AgenteAdministrativo("Angel", "3456");
        Empleado e6 = new AgenteAdministrativo("Juan", "7823");
        empleados.add(e4);
        empleados.add(e5);
        empleados.add(e6);
    }

    public static boolean autenticacion(String nombre, String contrasenia){
        for(int i=0; i<empleados.size(); i++){
            if( empleados.get(i).getNombre().equals(nombre) && empleados.get(i).getContrasenia().equals(contrasenia) ) 
                return true;
        }
        return false;
    }

}