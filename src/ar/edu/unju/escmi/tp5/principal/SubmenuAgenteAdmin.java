package ar.edu.unju.escmi.tp5.principal;
import java.util.Scanner;

import ar.edu.unju.escmi.tp5.collections.CollectionEmpleado;
import ar.edu.unju.escmi.tp5.collections.CollectionProducto;
import ar.edu.unju.escmi.tp5.dominio.Producto;

public class SubmenuAgenteAdmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Autenticacion");
        System.out.println("Ingrese nombre: ");String nombre=sc.nextLine(); 
        System.out.println("Ingrese contraseña: "); int passwd = sc.nextInt();
        if(CollectionEmpleado.autenticacion(nombre,passwd)){ // falta que lo hagan
            int op;
            do{
                System.out.println("Menu de Administrativo");
                System.out.println("1- Alta de producto");
                System.out.println("2- Realizar venta");
                System.out.println("3- Salir");
                op = sc.nextInt(); sc.nextLine();
            }while(op!=3);

            String name = sc.nextLine(); 

            switch(op){
                case 1: {
                    Producto p; // falta que implementen metodos setters
                    System.out.println("Ingrese codigo: "); p.setCodigo(sc.nextLine());
                    System.out.println("Ingrese descripcion: "); p.setDescripcion(sc.nextLine());
                    System.out.println("Ingrese precio unitario:"); p.setPrecio(sc.nextInt()); sc.nextLine();
                    System.out.println("Ingrese descuento:"); p.setDescuento(sc.nextInt()); sc.nextLine();
                    System.out.println("Ingrese stock"); p.setStock(sc.nextInt()); sc.nextLine();
                    CollectionProducto.agregar(p);
                    break;
                }
                case 2:{
                    // pide id cliente, mañana
                    break;
                }
                case 3: System.out.println("Saliendo del rol agente administrativo..."); break;
                default: System.out.println("Opcion invalida"); break;
            }
        }
        else{
            System.out.println("Autenticacion fallida. Intente mas tarde");
        }
        sc.close();
    }
}
