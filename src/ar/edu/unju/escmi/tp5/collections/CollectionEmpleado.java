package ar.edu.unju.escmi.tp5.collections;

import java.util.ArrayList;
import ar.edu.unju.escmi.tp5.dominio.Empleado;

public class CollectionEmpleado {
    public static ArrayList<Empleado> empleados = new ArrayList<>();

    public static void agregar(Empleado e) {
        if (e != null && !empleados.contains(e)) {
            empleados.add(e);
        }
    }

    public static Empleado buscar(String usuarioEmpleado) {
        for (Empleado e : empleados) {
            if (e != null && e.getUsuarioEmpleado().equalsIgnoreCase(usuarioEmpleado)) {
                return e;
            }
        }
        return null;
    }

    public static boolean eliminar(String usuarioEmpleado) {
        Empleado e = buscar(usuarioEmpleado);
        return e != null && empleados.remove(e);
    }

    public static ArrayList<Empleado> listar() {
        return empleados;
    }
}
