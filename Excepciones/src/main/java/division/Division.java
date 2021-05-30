package division;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        int v1, v2, resultado;
        try{
        Scanner entrada = new Scanner(System.in);

        System.out.println("Division.");
        System.out.print("Primer valor: ");
        v1 = entrada.nextInt();

        System.out.print("\nSegundo valor: ");
        v2 = entrada.nextInt();


            resultado = v1 / v2;

            System.out.println("\nResultado: " + resultado);
        
        }
        catch(Exception e){
            System.out.println("Error." + e);
        }
        finally{    //Sin importar que pase se ejecuta
            System.out.println("Programa concluido.");
        }

    }
}
