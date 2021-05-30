package decimales;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        
        int num = 2;
        double raiz = Math.sqrt(num);
        
        System.out.println("La raiz de "+ num + ": " + raiz);
        
        
        //Utilizar clase DecimalFormat
        DecimalFormat df = new DecimalFormat("#.000");
        
        System.out.println("La raiz de "+ num + ": " + df.format(raiz));
        
        //Utlizando String format
        System.out.println("La raiz de "+ num + ": " + String.format("%.3f", raiz));

        //Utilizando clase Math.round
        
        System.out.println("La raiz de "+ num + ": " + (double)Math.round(raiz * 100d)/100);

    }
    
}