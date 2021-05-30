package polimorfismo;

import java.util.Scanner;

public abstract class Operaciones_Padre {

    protected int v1, v2, resultado;

    Scanner entrada = new Scanner(System.in);

    public void pedirDatos() {
        System.out.println("Primer valor:");
        this.v1 = entrada.nextInt();
        System.out.println("Segundo valor:");
       this.v2 = entrada.nextInt();

    }
    
    public abstract void operaciones();
    
    public void mostrarResultado(){
        System.out.print("Resultado: ");
        System.out.println(resultado);
    }
        
    

}
