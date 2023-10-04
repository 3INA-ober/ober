
package figureGeometriche;


public class Rettangolo {
    public float base;
    public float altezza;
    
    public Rettangolo (float base,float altezza){
            this.base = base;
            this.altezza = altezza;
           
    }
    
    public float CalcolaPerimetro (){
        float perimetro ;
        perimetro = base*2 + altezza*2 ;
        return perimetro;
}
    public float CalcolaArea (){
       float area ; 
       area = base * altezza;
       return area ; 
    
    }
}

