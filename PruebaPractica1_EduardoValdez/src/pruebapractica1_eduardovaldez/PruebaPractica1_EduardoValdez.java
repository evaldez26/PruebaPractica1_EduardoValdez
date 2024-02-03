/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebapractica1_eduardovaldez;

import java.util.Scanner;

/**
 *
 * @author guali
 */
public class PruebaPractica1_EduardoValdez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char resp = 's';
        int cont = 0;
        while (resp == 's') {
            cont = cont + 1;
            System.out.println("**********Menu**********\n1. Repetir mi nombre\n2. SubMenu de mensajes\n3. Salir\nElija una opcion: ");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Cantidad de veces que se repetira el texto: ");
                    int cantidad = leer.nextInt();
                    for (int i = 0; i < cantidad; i++) {
                        System.out.println("¡Hola mi nombre es Eduardo Valdez y miren mi prueba!");
                    }
                    System.out.println();
                    break;
                case 2:
                    char resp2 = 's';
                    while (resp2 == 's') {
                        System.out.println("\n**********SubMenu**********\n1. Bienvenida\n2. Despedida\n3. Salir del submenu\nIngrese una opcion: ");
                        int opcion2 = leer.nextInt();
                        switch (opcion2) {
                            case 1:
                                System.out.println("Bienvenido a la prueba de Eduardo valdez");
                                break;
                            case 2:
                                System.out.println("Hasta luego, gracias por usar mi programa");
                                break;
                            case 3:
                                System.out.println("Saliendo del submenu");
                                resp2='n';
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Adios, esta fue mi prueba");
                    resp ='n';
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
        System.out.println("\nCantidad de veces que se repitio el menu principal: "+cont);
    }

}
