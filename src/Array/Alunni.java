
package Array;


public class Alunni {
   private int dim;
   private int index;
   private String nomi [];
   private String cognomi [];

    public Alunni() {
    }

    public Alunni(int dim, int index) {
        this.dim = dim;
        this.index = index;
    }

    public int getDim() {
        return dim;
    }

    public void setDim(int dim) {
        this.dim = dim;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String[] getNomi() {
        return nomi;
    }

    public void setNomi(String[] nomi) {
        this.nomi = nomi;
    }

    public String[] getCognomi() {
        return cognomi;
    }

    public void setCognomi(String[] cognomi) {
        this.cognomi = cognomi;
    }
   
   public boolean inserisci(String n, String c){
       boolean inserito = false;
       if(index < nomi.length){
           nomi[index] = n;
           cognomi[index] = c;
           index++;
           inserito = true;
       }
       if(index == nomi.length){
           inserito = false;
       }
       return inserito;
   }
   public String ricercaCognomi(String nome){
       String testo = "";
       for(index = 0; index < nomi.length;index++){
           if(nome.equals(nomi[index])){
               testo = "nome: " + "" + nomi[index] + "cognome: " + "" + cognomi[index]; 
               
           }
       }
       return testo;
   }
}
