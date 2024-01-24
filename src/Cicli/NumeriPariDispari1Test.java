package Cicli;

import java.util.Scanner;

public class NumeriPariDispari1Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int menu;
        boolean verifica = false;
        int uscita = 1;

        do {

            System.out.println("inserisci il numero: ");
            num = in.nextInt();

            System.out.println(NumeriPariDispari1.menu());
            System.out.println("inserisci il numero della decisione: ");
            menu = in.nextInt();

            switch (menu) {

                case 1:
                    NumeriPariDispari1 n = new NumeriPariDispari1();
                    System.out.println("Oggetto istanziato");
                    verifica = true;

                case 2:
                    if (verifica) {
                        System.out.println(NumeriPariDispari1.numeriPari(num));
                    } else {
                        System.out.println("oggetto non istanziato");
                    }
                    break;
                case 3:
                    if (verifica) {
                        System.out.println(NumeriPariDispari1.numeriDispari(num));
                    } else {
                        System.out.println("oggetto non istanziato");
                    }
                    break;
                case 4:
                    uscita = 0;
                    break;

                default:
                    System.out.println("non è valido");
                    break;
     }
        } while (uscita != 0);
     }
}
