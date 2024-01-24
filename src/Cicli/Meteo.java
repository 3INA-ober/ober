package Cicli;


 /**
 * la classe meteo serve per dare consigli in base alla temperatura
 *
 * @author david.ober
 */
public class Meteo {

    public float temperatura;

    /**
     * costruttore senza parametri {@link #setTemperatura(float t)}
     */
    public Meteo() {
    }

    /**
     * costruttore con parametro
     *
     * @param temperatura
     */
    public Meteo(float temperatura) {
        this.temperatura = temperatura;
    }

    /**
     * metodo per visualizzare la temperatura
     *
     * @return
     */
    public float getTemperatura() {
        return temperatura;
    }

    /**
     * metodo per impostare/modificare la temperatura
     *
     * @param temperatura
     */
    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    /**
     * metodo per restituire il valore dell'attributo
     *
     * @return
     */
    public String info() {
        String testo;
        testo = "la temperatura: " + temperatura + "\n";
        return testo;
    }

    /**
     * metodo che fornisce un consiglio in base alla temperatura
     *
     * @return
     */
    public String Consiglio() {
        String testo = "" ;
        if (temperatura < 0) {
            testo = "attenti al ghiaccio!";
        }
        if (temperatura == 0) {
            testo = "si va a sciare!";
        }
        if (temperatura > 0 && temperatura < 5) {
            testo = "ci vuole il cappellino!";
        }
        if (temperatura > 5 && temperatura <= 10) {
            testo = "basta il piumino!";
        }
        if (temperatura > 10 && temperatura <= 15) {
            testo = "solo il maglioncino!";
        }
        if (temperatura > 15 && temperatura <= 20) {
            testo = "magari!";
        }
        if (temperatura > 20 && temperatura <= 25) {
            testo = "tutti al mare!";
        }
        if (temperatura > 25) {
            testo = "condizionatore a manetta!";
        }       
        return testo;

    }

    /**
     * secondo metodo che fornisce un consiglio in base alla temperatura
     *
     * @return
     */
    public String Consiglio1() {
        String testo = "";
        if (temperatura < 0) {
            testo = "attenti al ghiaccio!";
        }
        if (temperatura == 0) {
            testo = "si va a sciare!";
        }
        if (temperatura > 0 && temperatura < 5) {
            testo = "ci vuole il cappellino!";
        }
        if (temperatura > 5 && temperatura <= 10) {
            testo = "basta il piumino!";
        }
        if (temperatura > 10 && temperatura <= 15) {
            testo = "solo il maglioncino!";
        }
        if (temperatura > 15 && temperatura <= 20) {
            testo = "magari!";
        }
        if (temperatura > 20 && temperatura <= 25) {
            testo = "tutti al mare!";
        }
        if (temperatura > 25) {
            testo = "condizionatore a manetta!";
        }
        return testo;s
        
    }

    /**
     * terzo metodo che fornisce un consiglio in base alla temperatura
     *
     * @return
     */
    public String Consiglio2() {

        String testo = "";

        if (temperatura < 0) {
            testo = "attenti al ghiaccio!";
        }else if (temperatura == 0) {
            testo = "si va a sciare!";
            
        } else if (temperatura > 0 && temperatura < 5) {
            testo = "ci vuole il cappellino!";
            
        } else if (temperatura > 5 && temperatura <= 10) {
            testo = "basta il piumino!";
            
        } else if (temperatura > 10 && temperatura <= 15) {
         
