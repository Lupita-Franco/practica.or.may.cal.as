package models;

/**
 *
 * @author lupita
 */
public class ModelMayor3Num {
    
    private int n1;
    private int n2;
    private int n3;
    private int m=3;

    /**
     * @return the n1
     */
    public int getN1() {
        return n1;
    }

    /**
     * @param n1 the n1 to set
     */
    public void setN1(int n1) {
        this.n1 = n1;
    }

    /**
     * @return the n2
     */
    public int getN2() {
        return n2;
    }

    /**
     * @param n2 the n2 to set
     */
    public void setN2(int n2) {
        this.n2 = n2;
    }

    /**
     * @return the n3
     */
    public int getN3() {
        return n3;
    }

    /**
     * @param n3 the n3 to set
     */
    public void setN3(int n3) {
        this.n3 = n3;
    }

    /**
     * @return the m
     */
    public int getM() {
        return m;
    }

    /**
     * @param m the m to set
     */
    public void setM(int m) {
        
        this.m = m;
    }
    
    public void mayor (){
        m=n1;
        
        if(n2>m){
            m=n2;
            if(n3>m){
                m=n3;
            }
        }
    }
}
