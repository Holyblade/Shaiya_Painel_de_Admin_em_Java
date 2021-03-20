/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monster;

/**
 *
 * @author Jorge
 */
public class Monster {

    public Monster() {
    }

    public Monster(String M, String I, String G, String D) {
        this.M = M;
        this.I = I;
        this.G = G;
        this.D = D;
    }
    private String M; 
    private String I; 
    private String G; 
    private String D; 

    /**
     * @return the M
     */
    public String getM() {
        return M;
    }

    /**
     * @param M the M to set
     */
    public void setM(String M) {
        this.M = M;
    }

    /**
     * @return the I
     */
    public String getI() {
        return I;
    }

    /**
     * @param I the I to set
     */
    public void setI(String I) {
        this.I = I;
    }

    /**
     * @return the G
     */
    public String getG() {
        return G;
    }

    /**
     * @param G the G to set
     */
    public void setG(String G) {
        this.G = G;
    }

    /**
     * @return the D
     */
    public String getD() {
        return D;
    }

    /**
     * @param D the D to set
     */
    public void setD(String D) {
        this.D = D;
    }
}
