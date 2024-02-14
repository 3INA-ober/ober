package Cicli;

/**
 *
 * @author david.ober
 */
public class QuadratiCorrezione {

    private int n;

    public QuadratiCorrezione() {
    }

    public QuadratiCorrezione(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    private boolean isValido() {
        boolean valido = false;
        if (n > 0 && n < 20) {
            valido = true;
        }
        return valido;
    }

    public String potenza() {
        String testo = "";
        int i = 0;
        int quadrato;
        if (isValido()){
            for(i = 0; i<n; i++){
            n--;
            quadrato = n*n; 
            testo += "il quadrato di" + "\t" + n + " è: " + quadrato + "\n";
                    }
        }
        
    
        return testo;
    }
}
