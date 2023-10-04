
package figureGeometriche;

import java.util.Scanner;


public class RettangoloTest {

   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float base;
        float altezza;
        float perimetro;
        float area;
        
        System.out.println("inserisci la base: ");
        base = in.nextFloat();
        
        System.out.println("inserisci l'altezza: ");
        altezza = in.nextFloat();
        
        
        Rettangolo rettangolo = new Rettangolo (base,altezza);
        
        base = rettangolo.base;
        altezza = rettangolo.altezza;
        perimetro = rettangolo.CalcolaPerimetro();
        area = rettangolo.CalcolaArea();
        
        System.out.println("la base è :" +base);
        System.out.println("l'altezza è :" +altezza);
        System.out.println("l'area è :" +area);
        System.out.println("il perimetro è :" +perimetro);
    }
    
}
