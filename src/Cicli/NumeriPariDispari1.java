package Cicli;

public class NumeriPariDispari1 {

 
    public static String menu() {
        String testo =  "1 = istanziare l'oggetto" +"\n"+
                        "2 = visualizzazione dei numeri pari: " + "\n"+
                        "3 = visualizzazione dei numeri dispari: " +"\n" +
                        "4 = esci" ;
        return testo;
    }

    public static String numeriDispari(int num) {
        String testo = "i primi numeri dispari sono: ";
        int i = 0;
        int risultato = 1;

        for (i = i; i < num; i++) {
            testo += risultato + "\n";
            risultato += 2;
        }

        return testo;
    }

    public static String numeriPari(int num) {
        String testo = "i primi numeri pari sono: ";
        int i = 0;
        int risultato = 1;

        while (i < num) {
            risultato += 1;
            testo = risultato + "\n";
            i++;
        }

        return testo;
    }

}
