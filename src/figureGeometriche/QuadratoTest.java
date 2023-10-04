
package figureGeometriche;

import java.util.Scanner;

public class QuadratoTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float lato;
        float p;
        float a;
        
        System.out.println("inserisci il lato: ");
        lato = in.nextFloat();
        
        Quadrato quadrato = new Quadrato (lato);
        
        lato = quadrato.lato;
        p = quadrato.CalcolaPerimetro();
        a = quadrato.CalcolaArea();
        
        System.out.println("lato :" +lato);
        System.out.println("area :" +a);
        System.out.println("perimetro :" +p);
    }
    
}

    
