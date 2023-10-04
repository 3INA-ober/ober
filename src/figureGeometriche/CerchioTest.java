
package figureGeometriche;

import java.util.Scanner;

public class CerchioTest {

    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       
       float raggio;
       float area;
       float circonferenza;
       
       System.out.println("inserisci il raggio: ");
       raggio = in.nextFloat();
       
       
       Cerchio cerchio = new Cerchio (raggio);
       
       raggio = cerchio.raggio;
       area = cerchio.CalcolaArea();
       circonferenza = cerchio.CalcolaCirconferenza();
       
       System.out.println("il raggio è :" +raggio);
       System.out.println("l'area è :" +area);
       System.out.println("la circonferenza è :" +circonferenza);
    }
    
}
