package cicli;

import java.util.Scanner;

public class GelataioTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Gelataio g1 = null;
        int gusto1;
        int gusto2;
        int gusto3;
        int gusto4;
        int totVendite;
        int valore = 0;
        int scelta;

        do {
            System.out.println("MENU");
            System.out.println("1 - Costruttore con Parametri");
            System.out.println("2 - Visualizzazione delle Frequenze");
            System.out.println("3 - Uscita");

            System.out.println("Inserire la propria scelta: ");
            scelta = in.nextInt();

            switch (scelta) {

                case 1:
                    System.out.println("Inserire il numero di ghiaccioli per gusto: ");
                    gusto1 = in.nextInt();
                    gusto2 = in.nextInt();
                    gusto3 = in.nextInt();
                    gusto4 = in.nextInt();

                    System.out.println("Inserire il numero totale di ghiaccioli");
                    totVendite = in.nextInt();

                    g1 = new Gelataio(gusto1, gusto2, gusto3, gusto4, totVendite);
                    break;

                case 2:
                    System.out.println(" Le frequenze: ");

                    System.out.println(g1.frequenzeRelative());
                    System.out.println(g1.frequenzePercentuale());
                    
                default:
                    System.out.println("Scelta Errata!");
                    break;
            }

        } while (valore != 0);
    }
}


