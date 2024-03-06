package Cicli;

/**
 *
 * @author david.ober
 */
public class Data2 {

    private int g;
    private int m;
    private int a;

    public Data2() {
        
    }

    public Data2(int g, int m, int a) {
        this.g = g;
        this.m = m;
        this.a = a;
    }

    

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public boolean isValido() {
        boolean valido = false;
        if (a < 1000 || a > 9999) {
            valido = false;

        }
        if (m < 1 || m > 12) {
            valido = false;
        }
        
        if (m == 4 || m == 6 || m == 9 || m == 11){
            if (g >= 1 || g <=30){
                valido = true;
            }
        }
            if (m == 1 || m == 2 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12){
            if (g >= 1 || g <=31){
                valido = true;
            }
            }  


        return valido;
    }
    
    public boolean isBisestile(){
        boolean is = true;
        if (a%400 == 0 || (a%4 == 0 && !(a%100 == 0))){
            is = true;
            }else{
            is = false;
        }                        
        return is;
    }

    public String info() {
        String testo = "";
        if(isValido() == true){
            if(g >=1 && g<= 9){
            testo = testo = "0" + g +"/"; 
            }else{
            testo = g + "/" + m + "/" + a;
            }
            if(m >=1 && m<=9){
            testo += "0" + m + "/" + a;
            }else{
            testo = g + "/" + m + "/" + a;
            }
        }else{
            testo = "data non valida";
        }
        return testo;
    }

}
