/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;

/**
 *
 * @author Jwilliams96
 */
public class TipCalcService {
    private CalculateStrategy newStrategy;
    
    public TipCalcService(CalculateStrategy newStrategy){
        this.newStrategy = newStrategy;
    }
    public double getTip(){
        return newStrategy.getTip();
    }
}
