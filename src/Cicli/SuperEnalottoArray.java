package Cicli;

public class SuperEnalottoArray {

    int numeri[] = new int[6];
    int n1;
    int n2;

    public SuperEnalottoArray() {
    }

    public String generatore() {
        String testo = "";
        int i = 0;
        for (i = 0; i < 6; i++) {
            numeri[i] = (int) (Math.random() * 99) + 1;
        testo += numeri[i];  
        }
        return testo;
    }

    public String confronto() {
        String testo= "";
        int i = 0;
        for (i = 0; i < 6; i++){
            
            
        }
        
        return testo;
        
    }
}
