package clases;

public class Recursividad {

    public void factorial(int x, int aux, int aux2) {
        if (aux2 <= x) {
            aux = aux*aux2;
            
            
            aux2++;
            
            
            factorial(x, aux, aux2);
        }
        else{
            System.out.println(aux);
        }
        
    
    }

}
