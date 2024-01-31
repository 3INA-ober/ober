
package Cicli;

import java.util.Formatter;
import java.util.Random;


public class Frequenza3 {
    public static String frequenza(){
        Formatter f = new Formatter();
        
        Random r = new Random();
        
        String testo = "N. -FA -   FR    - FP\n" ;
        
        int totNumeri = 100000;
        int nNumeri = 9;
        int contatore = 0;
          
        int differenza = totNumeri;
        
        for (int i = 1; i <= nNumeri; i++){
            if (i < nNumeri)
                contatore = r.nextInt(differenza);
            else
                contatore = differenza;
            double fR = (double)contatore/totNumeri;
            double fP = fR*100;
            
            f.format("%d    %2d    %4.2f    %5.2f\n", i, contatore, fR , fP);
            
            differenza -=contatore;      
        }                              
        
        testo += f;
        
        return testo;
        
    }
        
    


public static void main(String[] args) {
    System.out.println(Frequenza3.frequenza());
    
    
}
}

    
    
    
    
      
        
        
        
  
        
    


