package ar.edu.unju.escmi.tp5.principal;

import java.util.Scanner;

import ar.edu.unju.escmi.tp5.collections.*;

public class SubmenuEncargVentas {
    public static void main(Scanner sc) {
        System.out.println("...Autenticacion...");
        System.out.println("Ingrese nombre: ");String nombre=sc.nextLine(); 
        System.out.println("Ingrese contraseña: "); String passwd = sc.nextLine();
        
        if(CollectionEmpleado.autenticacion(nombre,passwd)){ 
            int op;
            do{
                System.out.println("Menu de Encargado de Ventas");
                System.out.println("1- Mostrar las ventas");
                System.out.println("2- Mostrar  el total de todas las ventas");
                System.out.println("3- Verficar stock de un producto");
                System.out.println("4- Salir");
                System.out.println("Elige una opcion:");
                op = sc.nextInt(); sc.nextLine(); 

                switch(op){
                    case 1: CollectionFactura.mostrar(); break;
                    case 2: System.out.println( "Total de todas las ventas: "+CollectionFactura.totalVentas() ); break;
                    case 3: {
                        System.out.println("Ingrese codigo:"); int cod=sc.nextInt(); sc.nextLine();
                        CollectionProducto.verificarStock(cod); 
                        break;
                    }
                    case 4: System.out.println("Saliendo del rol encargado de ventas..."); break;
                    default: System.out.println("Opcion invalida"); break;
                }
            }while(op!=4);       
        }
        else{
            System.out.println("Autenticacion fallida. Intente mas tarde");
        }
    }
}
