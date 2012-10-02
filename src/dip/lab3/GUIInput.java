/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import javax.swing.JOptionPane;


/**
 *
 * @author Jonathon
 */
public class GUIInput implements InputStrategy {
    String message = "";
    
    public void inputMessage(){
        message = JOptionPane.showInputDialog("GIve Message to send");
    }
    
    public String getMessage(){
        return message;
    }
}
