package ar.edu.unju.escmi.tp5.collections;


import java.util.ArrayList;
import ar.edu.unju.escmi.tp5.dominio.Empleado;


public class CollectionEmpleado {
public static ArrayList<Empleado> empleados = new ArrayList<>();


public static Empleado buscar(String usuarioEmpleado) {
for (Empleado e : empleados) {
if (e != null && e.getUsuarioEmpleado().equalsIgnoreCase(usuarioEmpleado)) {
return e;
}
}
return null;
}


public static ArrayList<Empleado> listar() {
return empleados;
}
}