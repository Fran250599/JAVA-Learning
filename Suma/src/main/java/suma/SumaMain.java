package suma;

import java.util.Scanner;

public class SumaMain {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Primer valor: ");
        int valor1 = entrada.nextInt();
        System.out.println("");
        
        System.out.println("Segundo valor: ");
        int valor2 = entrada.nextInt();
        System.out.println("");
        
        Suma valores = new Suma(valor1, valor2);
        
         valores.imprimir();
        
    }
    
}
