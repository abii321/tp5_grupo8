package ar.edu.unju.escmi.tp5.collections;

import java.util.ArrayList;
import ar.edu.unju.escmi.tp5.dominio.Empleado;

public class CollectionEmpleado {
    public static ArrayList<Empleado> empleados = new ArrayList<>();

    public static void agregar(Empleado e) {
        if (e != null) empleados.add(e);
    }

    // Búsqueda por nombre + apellido (usa getters)
    public static Empleado buscar(String nombre, String apellido) {
        for (Empleado e : empleados) {
            if (e != null
                && e.getNombre() != null && e.getApellido() != null
                && e.getNombre().equalsIgnoreCase(nombre)
                && e.getApellido().equalsIgnoreCase(apellido)) {
                return e;
            }
        }
        return null;
    }

    public static ArrayList<Empleado> listar() { return empleados; }

    public static boolean eliminar(String nombre, String apellido) {
        Empleado e = buscar(nombre, apellido);
        return (e != null) && empleados.remove(e);
    }
}
