package suma;

public class Suma {
    
    private int valor1, valor2, resultado;
    
    public Suma(int v1, int v2){
        this.valor1 = v1;
        this.valor2 = v2;
    }
    
    public int Sumar(){
        
        this.resultado = valor1+valor2;
        
        return resultado;
    }
    
    public void imprimir(){
        Sumar();
        System.out.println("Resultado: "+ resultado);
    }
    
}
