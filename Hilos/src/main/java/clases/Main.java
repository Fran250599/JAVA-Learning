
package clases;

public class Main {
    public static void main(String[] args) {
        
        Proceso1 hilo1 = new Proceso1();
        Thread hilo2 = new Thread(new Proceso2());
              
        //Start debe estar despues de todas las creaciones de hilos
        hilo1.start();
        hilo2.start();
        
    }
}
