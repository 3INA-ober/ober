package Cicli;

import java.util.Scanner;

/**
 *
 * @author david.ober
 */
public class DataTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int g;
        int m;
        int a;
        int giorno;
        int mese;
        int anno;

        System.out.println("inserisci il giorno: ");
        g = in.nextInt();

        System.out.println("inserisci il mese: ");
        m = in.nextInt();

        System.out.println("inserisci l'anno: ");
        a = in.nextInt();
        
         System.out.println("inserisci il giorno: ");
        giorno = in.nextInt();

        System.out.println("inserisci il mese: ");
        mese = in.nextInt();

        System.out.println("inserisci l'anno: ");
        anno = in.nextInt();
        
        Data d = new Data(g,m,a,giorno,mese,anno);
        
        System.out.println(d.isBisestile());
        System.out.println("La data del giorno pre stabilito è: " +d.info());
        System.out.println("La data della seconda data pre stabilita è: " +d.info2());
        
        System.out.println("la distanza dei giorni tra le due date è: "+d.distanzaGiorni());

    }

}
