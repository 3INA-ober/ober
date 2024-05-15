package Array;

/**
 *
 * @author David Ober
 */
public class Matematica {

   
   
    
    public int mcm(int [] numeri){
        
        numeri = new int [2];
        
        
        int mcm = 0;
        for(int i = 0; i < numeri.length;i++){
            mcm *= numeri[i];
            
        }
        return mcm;
        
    }
    
     /**
     public int MCD(int [] numeri){
         
        int MCD = 0;
        numeri = new int[2];
       
        int i = 0;
        for(i = 0; i < numeri.length;i++){
            if(numeri[i] / numeri[i+1] == 0){
               MCD =  
            } 
        }
            
        
        
        return MCD;
    }
    */
    
    public int convBinToDec(int [] numeri){
        int dec = 0;
        int i ;
        for(i = 0; i<numeri.length;i++)
            if(numeri[i] == 1){
            dec += (int) Math.pow(2, i);
            }
            
        
        return dec;
        
        
    }
    
   
    
    public int [] convDecToBin(int numeri){
        int [] binario = new int[8];
        int i = 0;
        for(i = 0; i < binario.length ;i++){
            if(numeri%2 == 1){
                numeri /= 2;
                binario[i] = 1;
            }else{
                numeri /=2;
                binario[i] = 0;
            }
            
        }
      
        return binario;
        
    }
        
    

    
    
}
