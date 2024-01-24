
package Cicli;


public class Gelataio {
 
    private int gusto;
    
    public Gelataio() {
    }
    
    
    
    public String menu(){
        String testo = "1= elenco gusti" +"\n"+
                       "2= frequenza relativa " +"\n"+
                       "3= frequenza percentuale" +"\n"+
                       "4= totale venduti"+"\n"+
                       "5= esci";
        return testo;
    }
   
}
