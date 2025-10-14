package ar.edu.unju.escmi.tp5.principal;
import java.util.Scanner;

import ar.edu.unju.escmi.tp5.collections.*;
import ar.edu.unju.escmi.tp5.dominio.*;

public class SubmenuAgenteAdmin {
    public static void main(Scanner sc) {
        
        System.out.println("...Autenticacion...");
        System.out.println("Ingrese nombre: ");String nombre=sc.nextLine(); 
        System.out.println("Ingrese contraseña: "); String passwd = sc.nextLine();

        if(CollectionEmpleado.autenticacion(nombre,passwd) && CollectionEmpleado.tipoEmpleado(nombre,passwd).equals("AgenteAdmin")){
            int op;
            do{
                System.out.println("Menu de Administrativo");
                System.out.println("1- Alta de producto");
                System.out.println("2- Realizar venta");
                System.out.println("3- Salir");
                System.out.println("Elige una opcion:");
                op = sc.nextInt(); sc.nextLine();

                switch(op){
                    case 1: {
                        Producto p = new Producto(); 
                        System.out.println("Ingrese descripcion: "); p.setDescripcion(sc.nextLine());
                        System.out.println("Ingrese precio unitario:"); p.setPrecioUnit(sc.nextInt()); sc.nextLine();
                        System.out.println("Ingrese descuento:"); p.setDescuento(sc.nextInt()); sc.nextLine();
                        System.out.println("Ingrese stock:"); p.setStock(sc.nextInt()); sc.nextLine();
                        AgenteAdministrativo.altaProducto(p);
                        break;
                    }
                    case 2:{
                        System.out.println("Ingrese codigo/DNI del cliente segun corresponda:"); int cod=sc.nextInt(); sc.nextLine(); 
                        Cliente c = CollectionCliente.buscarCliente(cod);
                        
                        if(c==null) {
                            System.out.println("El cliente no existe");
                            break;
                        }

                        Factura factura = new Factura(c);
                        String ans="si";
                        do{ 
                            System.out.println("Ingrese codigo de producto: ");
                            cod = sc.nextInt(); sc.nextLine();
                            Producto p = CollectionProducto.buscar(cod);
                            if(p==null) {
                                System.out.println("El producto no existe");
                                continue;
                            }
                            
                            System.out.println("Ingrese cantidad:");
                            int cant = sc.nextInt(); sc.nextLine();

                            factura.agregarDetalle(p, cant);
                            
                            System.out.println("¿Desea agregar otro producto? si/no");
                            ans = sc.nextLine();
                        }while(ans.equalsIgnoreCase("si"));

                        if(factura.getDetalles().size()>0) AgenteAdministrativo.realizarVenta(factura);
                        else {
                            System.out.println("Compra no realizada");
                            Factura.setNroFactura(Factura.getNroFactura()-1);
                        }

                        break;
                    }   
                    case 3: System.out.println("Saliendo del rol agente administrativo..."); break;
                    default: System.out.println("Opcion invalida"); break;
                }
            }while(op!=3);
        }
        else{
            System.out.println("Autenticacion fallida. Intente mas tarde");
        }
    }
}
