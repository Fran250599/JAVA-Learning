package ejemplos;

public class FuncionesTrigonometricas {
    public static void main(String[] args) {
        
        double resultado = 0;
        double anguloEnGrados = 45;
        
        double anguloEnRadianes = Math.toRadians(anguloEnGrados);
        
        //Seno
        
        resultado = Math.sin(anguloEnRadianes);
        System.out.println("Seno de " + anguloEnGrados + ": " + anguloEnRadianes);
        
        //Coseno
        resultado = Math.cos(anguloEnRadianes);
        System.out.println("Coseno de " + anguloEnGrados + ": " + anguloEnRadianes);
        
        
        //Tangente
        resultado = Math.tan(anguloEnRadianes);
        System.out.println("Tangente de " + anguloEnGrados + ": " + anguloEnRadianes);
    }
    
}