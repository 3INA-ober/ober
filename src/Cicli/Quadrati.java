
package cicli;


public class Quadrati {

    private int numero;

    
    public Quadrati() {
    }

  
    public Quadrati(int numero) {
        this.numero = numero;
    }

 
    public int getNumero() {
        return numero;
    }

 
    public void setNumero(int numero) {
        this.numero = numero;
    }


    public String quadratiMin() {
        String testo = "Numeri" + "\t" + "Quadrato" + "\n";
        
        int contatore = numero;
        
        int quadrato;
        while (contatore > 1) {
            contatore= contatore-1;
            quadrato = contatore * contatore;
            testo += contatore + "\t" + quadrato + "\n";
        }
        return testo;
    }

   
    public String quadratiMax() {
        String testo = "Numeri" + "\t" + "Quadrato" + "\n";
        int contatore = numero;
        int quadrato;
        while (contatore < 20) {
            contatore= contatore+1 ;
            quadrato = contatore * contatore;
            testo += contatore + "\t" + quadrato + "\n";
        }
        return testo;
    }


    public String menu() {
        String testo;
        
        testo = "1 - i quadrati maggiori di N" + "\n" +
                "2 - i quadrati minori di N" + "\n" +
                "3 - esci dal programma";        
        return testo;
    }

    
    public String info() {
        String testo;
        testo = "Numero: " + numero;
        return testo;
    }
}


