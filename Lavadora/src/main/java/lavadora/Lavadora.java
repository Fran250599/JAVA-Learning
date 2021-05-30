package lavadora;


public class Lavadora {
    private float kilos;
    private String tipo;
    
    public Lavadora(){
        this.kilos = 0;
        this.tipo = " ";
    }
    
    public Lavadora(float k, String t){
        this.kilos = k;
        this.tipo = t;
    }
    
    private void llenarDeAgua(){
        System.out.println("Estoy llenando de agua.");
    }
    
    private void lavar(){
        llenarDeAgua();
        System.out.println("Estoy lavando.");
    }
    private void secar(){
        lavar();
        System.out.println("Estoy secando.");
    }
    
    public void cicloFinalizado(){
        secar();
        System.out.println("Ropa lavada.");
    }

    public void setKilos(float k){
        this.kilos = k;
    }

    public float getKilos() {
        return kilos;
    }

   
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

 

 
}
