
package figureGeometriche;


public class TriangoloScaleno {
   public float lato1;
   public float lato2;
   public float lato3;
   public float altezza;
    
    public TriangoloScaleno (float lato2,float lato3,float altezza, float base){
            lato1 = base;
            this.lato2 = lato2;
            this.lato3 = lato3;
            this.altezza = altezza;
           
    }
    
    public float calcolaPerimetro (){
        float perimetro ;
        perimetro = lato1 + lato2 + lato3 ;
        return perimetro;
}
    public float calcolaArea (){
       float area;
       area = (lato1 * altezza)/2;
       return area;
    
    }
}

