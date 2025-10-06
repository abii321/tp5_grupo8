package ar.edu.unju.escmi.tp5.principal;
import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.escmi.tp5.collections.*;
import ar.edu.unju.escmi.tp5.dominio.*;

public class SubmenuAgenteAdmin {
    public static void main(Scanner sc) {
        
        System.out.println("...Autenticacion...");
        System.out.println("Ingrese nombre: ");String nombre=sc.nextLine(); 
        System.out.println("Ingrese contraseña: "); String passwd = sc.nextLine();

        if(CollectionEmpleado.autenticacion(nombre,passwd)){
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
                        CollectionProducto.agregar(p);
                        System.out.println("Producto agregado correctamente. Codigo asignado: "+p.getCodigo());
                        break;
                    }
                    case 2:{
                        System.out.println("Ingrese codigo/DNI del cliente segun corresponda:"); int cod=sc.nextInt(); sc.nextLine(); 
                        Cliente c = CollectionCliente.buscar(cod);
                        if(c==null) {
                            System.out.println("El cliente no existe");
                            break;
                        }

                        String ans="si";
                        Factura factura = new Factura();
                        factura.setCliente(cod);
                        factura.setFecha(LocalDate.now());
                        Producto p;
                        boolean compraExitosa = false;
                        do{ 
                            System.out.println("Ingrese codigo de producto: ");
                            cod = sc.nextInt(); sc.nextLine();
                            p = CollectionProducto.buscar(cod);
                            if(p==null){
                                System.out.println("El producto no existe");
                            }
                            else{
                                System.out.println("Ingrese cantidad:");
                                int cant = sc.nextInt(); sc.nextLine();
                                if( (c instanceof ClienteMinorista && cant> p.getStock() ) || 
                                    (c instanceof ClienteMayorista && cant*10 > p.getStock()) ) {
                                    System.out.println("No hay suficiente stock");
                                    
                                }
                                else {
                                    DetalleFactura detalle = new DetalleFactura();
                                    detalle.setProducto(p);
                                    detalle.setCantidad(cant);
                                    if ( c instanceof ClienteMayorista ){
                                        detalle.setSubtotal(p.getPrecioUnit()/2*(cant*10));
                                        p.setStock(p.getStock()-cant*10);
                                    }
                                    else{
                                        detalle.setSubtotal(p.getPrecioUnit()*cant);
                                        p.setStock(p.getStock()-cant);
                                    }
                                    factura.getDetalles().add(detalle);
                                    compraExitosa=true;
                                }
                            }
                            System.out.println("¿Desea agregar otro producto?");
                            ans = sc.nextLine();
                        }while(ans.equalsIgnoreCase("si"));

                        if(!compraExitosa) continue;
                        
                        double total = 0;
                        for( DetalleFactura d : factura.getDetalles() )
                            total+=d.getSubtotal();
                        
                        // descuento del producto
                        if( p.getDescuento()>0)
                            factura.setTotal( p.getDescuento()*total/100 );
                        else 
                            factura.setTotal(total);

                        // descuento de obra social
                        if( c.tieneObraSocial() ) factura.setTotal(total/10);

                        System.out.println("Codigo de factura: "+factura.getNumero());
                        System.out.println("Monto total de la compra: "+factura.getTotal()); 
                        CollectionFactura.agregar(factura);
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
