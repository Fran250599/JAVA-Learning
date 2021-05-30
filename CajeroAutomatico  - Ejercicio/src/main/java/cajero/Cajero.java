package cajero;

public class Cajero {
    private float saldo;
    
    public Cajero(float s){
        this.saldo = s;
    }
    
    public float consulta(){       //Equivalente a metodo getter
        return this.saldo;
    }
    
    public void retiro(float s){
        this.saldo = this.saldo - s;
    }
    
    public void deposito(float s){  
        this.saldo = this.saldo + s;
    }
}
