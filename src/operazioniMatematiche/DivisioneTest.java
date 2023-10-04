

package operazioniMatematiche;

import java.util.Scanner;


public class DivisioneTest {

  
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        
        float s;
        float n1;
        float n2;
        
        System.out.print("inserisci il primo numero: ");
        n1 = in.nextFloat();
        
        System.out.print("inserisci il secondo numero: " );
        n2 = in.nextFloat();
        Divisione divisione = new Divisione (n1,n2);
        
        n1 = divisione.n1;
        n2 = divisione.n2;
        s = divisione.esegui();
        
        System.out.println("numero1 :" +n1);
        System.out.println("numero1 :" +n2);
        System.out.println("divisione :" +s);
    }
    
}
