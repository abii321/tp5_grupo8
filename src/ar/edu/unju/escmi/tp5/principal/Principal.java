package ar.edu.unju.escmi.tp5.principal;
import java.util.Scanner;

public class Principal {

    static void menuCliente(){
        Scanner sc = new Scanner(System.in);
        int op;
        do{
            System.out.println("Menu de Cliente");
            System.out.println("1- Buscar factura");
            System.out.println("2- Salir");
            op = sc.nextInt(); sc.nextLine();
        }while(op!=2);
        sc.close();
    }

    static void menuEncargadoVentas(){
        Scanner sc = new Scanner(System.in);
        int op;
        do{
            System.out.println("Menu de Encargado de Ventas");
            System.out.println("1- Mostrar las ventas");
            System.out.println("2- Mostrar  el total de todas las ventas");
            System.out.println("3- Verficar stock de un producto");
            System.out.println("4- Salir");
            op = sc.nextInt(); sc.nextLine(); 
        }while(op!=4);
        sc.close();
    }

    static void menuAdministrativo(){
        Scanner sc = new Scanner(System.in);
        int op;
        do{
            System.out.println("Menu de Administrativo");
            System.out.println("1- Alta de producto");
            System.out.println("2- Realizar venta");
            System.out.println("3- Salir");
            op = sc.nextInt(); sc.nextLine();
        }while(op!=3);
        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        do{
            System.out.println("Sistema de Ventas");
            System.out.println("1- Cliente");
            System.out.println("2- Encargado de ventas");
            System.out.println("3- Agente administrativo");
            System.out.println("4- Salir");
            System.out.println("Elige una opcion:");
            op = sc.nextInt(); sc.nextLine();     

            switch(op){
                case 1: menuCliente(); break;
                case 2: menuEncargadoVentas(); break;
                case 3: menuAdministrativo(); break;
                case 4: System.out.println("Saliendo del sistema"); break;
                default: System.out.println("Opcion invalida"); break;
            }
        }while(op!=4);

        sc.close();
    }
}
