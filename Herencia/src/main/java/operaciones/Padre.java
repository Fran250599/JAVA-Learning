package operaciones;

import java.util.Scanner;

public class Padre {
    protected int v1, v2, resultado;
    Scanner entrada = new Scanner(System.in);
    
    
    public void pedirDatos(){
        System.out.println("Primer valor: ");
        this.v1 = entrada.nextInt();
        
        System.out.println("Segundo valor: ");
        this.v2 = entrada.nextInt();
    }
    
    public void mostrarResultado(){
        System.out.println(resultado);
    }
}
