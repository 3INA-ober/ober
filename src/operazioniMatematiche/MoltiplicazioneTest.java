
package operazioniMatematiche;

import java.util.Scanner;
public class MoltiplicazioneTest {

   
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        
        double m;
        float n1;
        float n2;
        
        System.out.print("inserisci il primo numero: ");
        n1 = in.nextFloat();
        
        System.out.print("inserisci il secondo numero: " );
        n2 = in.nextFloat();
        Moltiplicazione moltiplicazione = new Moltiplicazione (n1,n2);
        
        n1 = moltiplicazione.n1;
        n2 = moltiplicazione.n2;
        m = moltiplicazione.esegui();
        
        System.out.println("numero1 :" +n1);
        System.out.println("numero1 :" +n2);
        System.out.println("moltiplicazione :" +m);
    
    }
    
}
