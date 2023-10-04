
package figureGeometriche;


public class Quadrato {
    public float lato;
    
    
    public Quadrato (float numero1){
            lato = numero1;
           
    }
    
    public float CalcolaPerimetro (){
        float perimetro ;
        perimetro = lato + lato + lato + lato ;
        return perimetro;
}
    public float CalcolaArea (){
       float area ; 
       area = lato * lato;
       return area; 
}
}
