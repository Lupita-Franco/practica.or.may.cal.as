
package models;

/**
 *
 * @author lupita
 */

public class ModelOperaciones {
    
    double firstValue = 0;
    double secondValue = 0;
    
    public double getFirstValue(){
        return firstValue;
    }
    
    public double getSecondValue(){
        return secondValue;
    }
    
    public void setValues(double firstValue, double secondValue){
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }
    
    public double jb_suma(){
       return (this.firstValue + this.secondValue);
    }
      public double jb_residuo(){
       return (this.firstValue % this.secondValue);
    }
    public double jb_resta(){
        return (this.firstValue - this.secondValue);
    }
    
    public double multiplicacion(){
        return (this.firstValue * this.secondValue);
    }
    
    public double divicion(){
        return (this.firstValue / this.secondValue);
    }
    
    public double getjb_residuo(){
        return this.jb_residuo();   
    }
    public double getjb_suma(){
        return this.jb_suma();   
    }
    
    public double getjb_resta(){
        return this.jb_resta();
    }
    
    public double getMultiplicacion(){
        return this.multiplicacion();
    }
    
    public double getDivicion(){
        return this.divicion();
    }
}
