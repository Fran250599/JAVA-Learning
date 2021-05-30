package clases;

public class Proceso extends Thread {
    
    int num_int;
    
    public Proceso(String nombreHilo){
        
        super(nombreHilo);
    }
    
    
    @Override
    public void run(){
        for(int i = 0; i <= num_int; i++){
            System.out.println(i + " " + this.getName());
        }
        System.out.println("");
    }
    
    public void setNum(int n){
        this.num_int = n;
    }
}
