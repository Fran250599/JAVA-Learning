
package polimorfismo;


public class Main {
    public static void main(String[] args) {
        
        Operaciones_Padre suma = new Suma_Hija();
        
        suma.pedirDatos();
        suma.operaciones();
        suma.mostrarResultado();
        
        Operaciones_Padre resta = new Resta_Hija();
        resta.pedirDatos();
        resta.operaciones();
        resta.mostrarResultado();
        
               
        
    }
}
