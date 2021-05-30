

package inversordepalabras;

import java.util.Scanner;


public class InversorDePalabras {
    
    public static void main(String[] args){
    
        String word = "", invertWord= "";
        int wordLength = word.length();
        wordLength--;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escribe una palabra o frase: ");
        
        word = entrada.nextLine();
        
        wordLength = word.length();
        
        while (wordLength != 0) {
            invertWord += word.substring(wordLength-1, wordLength);
            
            wordLength--;
            
        }
        
        System.out.print(invertWord);
        
        
    }
    
}
