package ar.edu.unju.escmi.tp5.principal;

import java.util.Scanner;

import ar.edu.unju.escmi.tp5.collections.CollectionCliente;
import ar.edu.unju.escmi.tp5.dominio.Cliente;

public class SubmenuCliente {
    public static void main(Scanner sc) {

        System.out.println("...Autenticacion...");
        System.out.println("Ingrese codigo o DNI segun corresponda:"); int codigo=sc.nextInt(); sc.nextLine(); 
        System.out.println("Ingrese contraseña:"); String passwd = sc.nextLine();
        
        if(CollectionCliente.autenticacion(codigo,passwd)){ 
            int op;
            do{
                System.out.println("Menu de Cliente");
                System.out.println("1- Buscar factura");
                System.out.println("2- Salir");
                System.out.println("Elige una opcion:");
                op = sc.nextInt(); sc.nextLine();

                switch(op){
                    case 1: {
                        System.out.println("Ingrese numero de factura: "); int nroFactura= sc.nextInt(); sc.nextLine();
                        Cliente.buscarFactura(nroFactura);
                        break;
                    }
                    case 2: System.out.println("Saliendo del rol cliente..."); break;
                    default: System.out.println("Opcion invalida"); break;
                }
            }while(op!=2);
        }
        else{
            System.out.println("Autenticacion fallida. Intente mas tarde");
        }
    }
}
