package clases;

public class Main {

    public static void main(String[] args) {
        
        
        //Estado: New  (Creado pero no inicializado)
        Hilo_Proceso hilo1 = new Hilo_Proceso();
        Hilo_Proceso hilo2 = new Hilo_Proceso();

        //Estado: Ejecutable (Crea recursos para ejecutar el hilo
        //y llama al metodo run)
        hilo1.start();
        
        
        //Estado: Bloqueado (Bloquea la ejecución de un hilo por
        //tiempo determinado
        try{
        hilo1.sleep(1000);   //1 segundo
        }catch(InterruptedException e){
            System.out.println("Error en el hilo 1 " + e);
        }
        
        
        
        // :D
        hilo2.start();
        //Estado: Muerto (Basicamente para el hilo)
        hilo2.stop();
        
        try{
            hilo2.sleep(1000);            
        }catch(InterruptedException e){
            System.out.println("Error en el hilo 2 "+ e);
        }
        
        
        
        
        
    }
}