package ar.edu.unju.escmi.tp5.principal;
import java.util.Scanner;

import ar.edu.unju.escmi.tp5.collections.CollectionCliente;
import ar.edu.unju.escmi.tp5.collections.CollectionEmpleado;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        CollectionCliente.precargarClientes();
        CollectionEmpleado.precargarEmpleados();

        int op;
        do{
            System.out.println("......Sistema de Ventas......");
            System.out.println("1- Cliente");
            System.out.println("2- Encargado de ventas");
            System.out.println("3- Agente administrativo");
            System.out.println("4- Salir");
            System.out.println("Elige una opcion:");
            op = sc.nextInt(); sc.nextLine();     

            switch(op){
                case 1: SubmenuCliente.main(sc);; break;
                case 2: SubmenuEncargVentas.main(sc); break;
                case 3: SubmenuAgenteAdmin.main(sc); break;
                case 4: System.out.println("Saliendo del sistema"); break;
                default: System.out.println("Opcion invalida"); break;
            }
        }while(op!=4);

        sc.close();
    }
}
