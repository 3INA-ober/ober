package Cicli;

public class TestRandom {

    
    public static void main(String[] args) {
        double numero;       
        int intero;
        
        Random r = new Random();
   

    /*
        for (int i = 0; i < 10; i++) {
            numero = (Math.random()*7)+1 ;
            
            intero = (int)numero;
            System.out.println("numero: " + intero);
        }*/
    
        for (int i = 0; i < 100; i++){
            numero = r.nextDouble();
            System.out.println("numero: " + numero);
        
        }
    }

}
