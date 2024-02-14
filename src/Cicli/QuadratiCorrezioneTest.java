
package Cicli;

import java.util.Scanner;

public class QuadratiCorrezioneTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n;
        System.out.println("inserisci il numero: ");
         n = in.nextInt();
         
         QuadratiCorrezione q = new QuadratiCorrezione(n);
         
         System.out.println(q.potenza());
         
        
        
    }
    
}
