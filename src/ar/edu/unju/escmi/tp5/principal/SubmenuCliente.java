package ar.edu.unju.escmi.tp5.principal;

import java.util.Scanner;

import ar.edu.unju.escmi.tp5.collections.CollectionCliente;
import ar.edu.unju.escmi.tp5.collections.CollectionFactura;
import ar.edu.unju.escmi.tp5.dominio.Factura;

public class SubmenuCliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("...Autenticacion...");
        System.out.println("Ingrese nombre:");String nombre=sc.nextLine(); 
        System.out.println("Ingrese contraseña:"); String passwd = sc.nextLine();
        
        if(CollectionCliente.autenticacion(nombre,passwd)){ // falta que lo hagan
            int op;
            do{
                System.out.println("Menu de Cliente");
                System.out.println("1- Buscar factura");
                System.out.println("2- Salir");
                op = sc.nextInt(); sc.nextLine();
            }while(op!=2);

            switch(op){
                case 1: {
                    System.out.println("Ingrese numero de factura: "); int nroFactura= sc.nextInt(); sc.nextLine();
                    Factura f = CollectionFactura.buscar(nroFactura);
                    if( f !=null){
                        Factura.mostrar(f); // falta q lo hagan
                    } else {
                        System.out.println("Factura no encontrada");
                    }
                    break;
                }
                case 2: System.out.println("Saliendo del rol cliente..."); break;
                default: System.out.println("Opcion invalida"); break;
            }
        }
        else{
            System.out.println("Autenticacion fallida. Intente mas tarde");
        }
        sc.close();
    }
}
