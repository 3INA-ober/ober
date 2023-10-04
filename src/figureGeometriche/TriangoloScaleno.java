
package figureGeometriche;


public class TriangoloScaleno {
   public float lato1;
   public float lato2;
   public float lato3;
    
    public TriangoloScaleno (float lato1,float lato2,float lato3){
            this.lato1 = lato1;
            this.lato2 = lato2;
            this.lato3 = lato3;
           
    }
    
    public float CalcolaPerimetro (){
        float perimetro ;
        perimetro = lato1 + lato2 + lato3 ;
        return perimetro;
}
    public float CalcolaArea (int perimetro){
        
    }   
    
