/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;

/**
 *
 * @author Jwilliams96
 */
public interface CalculateStrategy {
    public static enum ServiceQuality {
           GOOD, FAIR, POOR
    };
 
    double getTip();
}
