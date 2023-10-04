
package figureGeometriche;


public class Cerchio {
    public float raggio;
   
    public Cerchio (float raggio){
        this.raggio = raggio;
      
    
    }

    public float CalcolaArea () {
        float area;
        area = 3.14f*(raggio*raggio);
        return area;
   
    }
    
    public float CalcolaCirconferenza () {
        float circonferenza;
        circonferenza = (raggio)*2*3.14f;
        return circonferenza;
    }

   
    }
