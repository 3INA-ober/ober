package Cicli;

import java.util.Scanner;

/**
 *
 * @author david.ober
 */
public class DataTest2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int g;
        int m;
        int a;

        System.out.println("inserisci il giorno: ");
        g = in.nextInt();

        System.out.println("inserisci il mese: ");
        m = in.nextInt();

        System.out.println("inserisci l'anno: ");
        a = in.nextInt();
        
        Data2 d = new Data2(g,m,a);
 
        System.out.println(d.isBisestile());
        System.out.println("La data del giorno pre stabilito è: " +d.info());

    }

}
