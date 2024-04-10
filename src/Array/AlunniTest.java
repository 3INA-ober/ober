package Array;

import java.util.Scanner;

public class AlunniTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = "";
        String c = "";
        int index = 0;
        int dim = 0;
        int scelta = 0;
        boolean valore = true;

        Alunni a = new Alunni(dim, index);

        do {
            System.out.println("queste sono le tue scelte: ");
            System.out.println("1. inserisci i nomi e i cognomi degli studenti: ");
            System.out.println("2. visualizzazione dei nomi e dei cognomi ");
            System.out.println("3. visualizzazione degli omonimi");
            System.out.println("4. esci");
            System.out.println("inserisci la tua scelta: ");
            scelta = Integer.parseInt(in.nextLine());

            switch (scelta) {
                case 1:
                    System.out.println("inserire il numero degli studenti: ");
                    a.setDim(Integer.parseInt(in.nextInt()));
                    break;
                case 2:
                    System.out.println("inserire il nome e il cognome dello studente: ");
                    n = in.nextLine();
                    c = in.nextLine();
                    break;
                case 3:
                    a.ricercaCognomi(n);
                    break;
                case 4:
                    System.out.println("arrivederci");
                    valore = false;

            }

        } while (valore = true);
    }

}
