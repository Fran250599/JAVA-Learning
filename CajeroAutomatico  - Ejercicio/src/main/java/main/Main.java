package main;

import java.util.Scanner;
import cajero.Cajero;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Cajero c = new Cajero(500);

        System.out.println("Bienvenido al cajero automatico.");
        System.out.println("Seleccione una opcion: ");

        System.out.println("\n1) Consulta de saldo.");
        System.out.println("2) Retiro de efectivo.");
        System.out.println("3) Deposito de efectivo.");
        System.out.println("4) Salir.\n");

        

        boolean menu = true;

        while (menu == true) {
            int opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1: {
                    System.out.println(c.consulta());
                   
                }
                break;

                case 2: {

                    System.out.println("¿Cuanto dinero desea retirar?");
                    float retiro = entrada.nextFloat();

                    c.retiro(retiro);
                    
                    System.out.print("Saldo actual:");
                    System.out.println(c.consulta());
                    
                }
                break;

                case 3: {
                    System.out.println("¿Cuanto dinero está depositando?");
                    float deposito = entrada.nextFloat();

                    c.deposito(deposito);
                    
                    System.out.print("Saldo actual:");
                    System.out.println(c.consulta());

                }break;
                
                case 4:{
                    menu = false;
                }break;

                default: {
                    System.out.println("Valor invalido.");
                }
                break;
            }
        }
    }
}
